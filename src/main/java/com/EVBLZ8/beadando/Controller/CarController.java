package com.EVBLZ8.beadando.Controller;

import com.EVBLZ8.beadando.Entity.CarEntity;
import com.EVBLZ8.beadando.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/getAllCars")
    public List<CarEntity> getAllCars() {
        return carService.findAll();
    }

    @GetMapping("/getCarById/{id}")
    public CarEntity getCarById(@PathVariable Long id) {
        return carService.findCarById(id);
    }

    @PostMapping("/addCar")
    public CarEntity addCar(@RequestBody CarEntity carEntity) {
        return carService.save(carEntity);
    }

    @PutMapping("/updateCar/{id}")
    public CarEntity updateCar(@PathVariable Long id, @RequestBody CarEntity updatedCar) {
        updatedCar.setId(id);
        return carService.save(updatedCar);
    }

    @DeleteMapping("/deleteCarById/{id}")
    public void deleteCarById(@PathVariable Long id) {
        carService.deleteById(id);

    }

}
