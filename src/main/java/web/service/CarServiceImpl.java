package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Mazda", 3, 2009));
        cars.add(new Car("BMW", 7, 2000));
        cars.add(new Car("Lada", 2, 1997));
        cars.add(new Car("Toyota", 6, 2010));
        cars.add(new Car("Mercedes", 9, 2020));
    }

    @Override
    public List<Car> cars() {
        return cars;
    }

    @Override
    public List<Car> countCars(List<Car> carList, int count) {

        return carList.subList(0, count);
    }
}
