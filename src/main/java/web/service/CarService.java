package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> cars();

    List<Car> countCars(List<Car> carList, int count);
}
