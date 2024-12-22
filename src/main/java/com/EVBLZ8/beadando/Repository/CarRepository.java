package com.EVBLZ8.beadando.Repository;

import com.EVBLZ8.beadando.Entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
