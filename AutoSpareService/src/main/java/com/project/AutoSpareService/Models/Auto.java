package com.project.AutoSpareService.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
@Entity
@Table(name = "Auto")
public class Auto {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Auto(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }
    public Auto(){}

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Id
    @Column(name = "id")
    private int id;
    @Column (name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

}
