package com.directi.training.srp.exercise;

public class CarManager {
    private CarRepository carRepository = CarRepository.getInstance();
    private CarComparison carComparison = new CarComparison();

    public Car getCarById(String carId) {
        return carRepository.getById(carId);
    }

    public String getAllCarNames() {
        return carRepository.getCarsNames();
    }

    public Car getBestCar() {
        return carComparison.getBestCar();
    }
}