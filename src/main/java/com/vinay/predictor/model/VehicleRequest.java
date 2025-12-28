package com.vinay.predictor.model;

public class VehicleRequest {

    private String vehicleType;
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private String condition;
    private String fuelType;
    private int engineSize;

    public VehicleRequest() {}

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public int getEngineSize() { return engineSize; }
    public void setEngineSize(int engineSize) { this.engineSize = engineSize; }
}