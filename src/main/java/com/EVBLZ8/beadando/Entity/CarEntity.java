package com.EVBLZ8.beadando.Entity;

// Egyszerűség érdekében itt nincs Serializable.

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity {
    // Mezők : azonosító, autó márkája, rendszáma, ki van-e adva
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String carModel;

    private String serialNumber;

    private boolean isLentOut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isLentOut() {
        return isLentOut;
    }

    public void setLentOut(boolean lentOut) {
        isLentOut = lentOut;
    }

    public CarEntity(Long id, String carModel, String serialNumber, boolean isLentOut) {
        this.id = id;
        this.carModel = carModel;
        this.serialNumber = serialNumber;
        this.isLentOut = isLentOut;
    }

    public CarEntity() {
    }
}
