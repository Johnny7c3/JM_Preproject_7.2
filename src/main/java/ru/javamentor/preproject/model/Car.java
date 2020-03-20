package ru.javamentor.preproject.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private int id;
    private String model;
    private String series;

    public Car() {}

    public Car(int id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
