package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarRepository {

    private static CarRepository instance;

    private List<Car> carsDb;

    private CarRepository() {
        carsDb = Arrays.asList(
                new Car("1", "Golf III", "Volkswagen"),
                new Car("2", "Multipla", "Fiat"),
                new Car("3", "Megane", "Renault"));
    }

    public static CarRepository getInstance() {
        if (instance == null) {
            instance = new CarRepository();
        }
        return instance;
    }

    public Car getById(final String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public List<Car> getAllCars() {
        return carsDb;
    }
}