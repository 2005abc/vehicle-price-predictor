package com.vinay.predictor.service;

import com.vinay.predictor.model.PredictionHistory;
import com.vinay.predictor.model.PredictionResponse;
import com.vinay.predictor.model.VehicleRequest;
import com.vinay.predictor.repository.PredictionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
public class PricePredictionService {


    private final PredictionRepository repository;

    public PricePredictionService(PredictionRepository repository) {
        this.repository = repository;
    }

    public PredictionResponse predict(VehicleRequest request) {

        int currentYear = 2025;
        int age = currentYear - request.getYear();


        Map<String, Integer> basePrices = Map.of(
                "car", 800000, "bike", 120000, "scooter", 90000,
                "truck", 3500000, "bus", 5500000, "tractor", 1000000
        );

        double price = basePrices.getOrDefault(request.getVehicleType().toLowerCase(), 400000);

        Map<String, Double> brandFactor = Map.of(
                "tata", 1.2, "mahindra", 1.15, "hyundai", 1.1, "maruti", 1.05, "royal-enfield", 1.4, "ola", 1.3
        );

        price *= brandFactor.getOrDefault(request.getBrand().toLowerCase(), 1.0);

        double annualDepreciation = 0.17;
        if (request.getVehicleType().equalsIgnoreCase("bike") || request.getVehicleType().equalsIgnoreCase("scooter")) {
            annualDepreciation = 0.19;
        }

        if (request.getFuelType().equalsIgnoreCase("electric")) {
            annualDepreciation *= 0.85;
        }

        price *= Math.pow(1 - annualDepreciation, age);
        double mileageRate = request.getVehicleType().equalsIgnoreCase("car") ? 2.5 : 0.6;
        price -= request.getMileage() * mileageRate;

        Map<String, Double> conditionFactor = Map.of("excellent", 1.25, "good", 1.0, "fair", 0.7, "poor", 0.4);
        price *= conditionFactor.getOrDefault(request.getCondition().toLowerCase(), 1.0);

        if (request.getFuelType().equalsIgnoreCase("electric")) {
            price *= 1.25;
        } else if (request.getFuelType().equalsIgnoreCase("diesel")) {
            price *= 0.92;
        }

        double engineFactor = 1 + (Math.log(request.getEngineSize() / 1000.0) * 0.18);
        price *= engineFactor;
        price = Math.max(price, 30000);

        int finalPrice = ((int) price / 1000) * 1000;

        try {
            PredictionHistory history = new PredictionHistory();
            history.setBrand(request.getBrand());
            history.setModel(request.getModel()); // Ensure model exists in Request
            history.setYear(request.getYear());
            history.setFuelType(request.getFuelType());
            history.setKmsDriven(request.getMileage());
            history.setPredictedPrice(finalPrice);
            history.setCreatedAt(LocalDateTime.now());

            repository.save(history);
            System.out.println("Data saved to MySQL successfully!");
        } catch (Exception e) {
            System.out.println("Database save failed: " + e.getMessage());
        }

        return new PredictionResponse(finalPrice, "Predicted & Saved to Database");
    }
}