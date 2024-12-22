package com.EVBLZ8.beadando.Service;

import com.EVBLZ8.beadando.Entity.CarEntity;
import com.EVBLZ8.beadando.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<CarEntity> findAll(){
        return carRepository.findAll();
    }

    public CarEntity findCarById(Long id) {
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    public CarEntity save(CarEntity carEntity){
        return carRepository.save(carEntity);
    }

    public void deleteById(Long id){
        carRepository.deleteById(id);
    }


}
