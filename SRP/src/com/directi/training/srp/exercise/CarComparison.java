package com.directi.training.srp.exercise;

public class CarComparison {
    private CarRepository carRepository = CarRepository.getInstance();

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : carRepository.getAllCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}