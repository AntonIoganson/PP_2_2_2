package web.service;

import org.springframework.stereotype.Controller;
import web.Models.Car;

import java.util.List;

@Controller
public interface CarService {

    public List<Car> getCars(int count);
}
