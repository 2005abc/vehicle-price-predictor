package com.vinay.predictor.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "prediction_history")
public class PredictionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private int year;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "kms_driven")
    private int kmsDriven;

    @Column(name = "predicted_price")
    private double predictedPrice;

    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public PredictionHistory() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public int getKmsDriven() { return kmsDriven; }
    public void setKmsDriven(int kmsDriven) { this.kmsDriven = kmsDriven; }

    public double getPredictedPrice() { return predictedPrice; }
    public void setPredictedPrice(double predictedPrice) { this.predictedPrice = predictedPrice; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}