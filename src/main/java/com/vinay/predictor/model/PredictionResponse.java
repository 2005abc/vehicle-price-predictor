package com.vinay.predictor.model;

public class PredictionResponse {

    private int predictedPrice;
    private String message;

    public PredictionResponse() {}

    public PredictionResponse(int predictedPrice, String message) {
        this.predictedPrice = predictedPrice;
        this.message = message;
    }

    public int getPredictedPrice() {
        return predictedPrice;
    }

    public void setPredictedPrice(int predictedPrice) {
        this.predictedPrice = predictedPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
