package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "-1") int id, Model model) {
        if ((id > 0) & (id < 6)) {
            model.addAttribute("cars", carService.getCarList().subList(0, id));
        } else {
            model.addAttribute("cars", carService.getCarList());
        }
        return "cars";
    }
//    @GetMapping(value = "/cars?count={id}")
//    public String printCars1(@PathVariable("id") int id, ModelMap model) {
//        model.addAttribute("id",id);
//        model.addAttribute("cars", carService.getCarList());
//        return "cars1";
//    }
}
