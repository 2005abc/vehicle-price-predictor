package com.vinay.predictor.controller;

import com.vinay.predictor.model.VehicleRequest;
import com.vinay.predictor.model.PredictionResponse;
import com.vinay.predictor.service.PricePredictionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PredictionController {

    private final PricePredictionService service;

    public PredictionController(PricePredictionService service) {
        this.service = service;
    }

    @PostMapping("/predict")
    public PredictionResponse predictPrice(@RequestBody VehicleRequest request) {
        return service.predict(request);
    }
}
