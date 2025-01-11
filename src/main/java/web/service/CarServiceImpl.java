package web.service;

import org.springframework.stereotype.Controller;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Audi", "q3", 2020));
        cars.add(new Car("BMW", "x2", 2018));
        cars.add(new Car("Lada", "granta", 2015));
        cars.add(new Car("Opel", "astra", 2010));
        cars.add(new Car("Jeep", "runner", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        return (count >= 5) ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }
}
