package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Hyundai", "v35", 132));
        list.add(new Car("BWM", "5 series", 144));
        list.add(new Car("Land Rover", "Range Rover", 192));
        list.add(new Car("Kia", "Sportage", 777));
        list.add(new Car("Audi", "TT", 1988));
    }

    @Override
    public List<Car> getCarList() {
        return list;
    }
}
