package com.cs5800.polymorphism;
import com.cs5800.polymorphism.Ship;

public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip() {
        this.setName("");
        this.setYear(0);
        this.setTonnage(0);
    }

    public CargoShip(String name, int year, int tonnage) {
        this.setName(name);
        this.setYear(year);
        this.setTonnage(tonnage);
    }

    public void setTonnage(int tonnage) {
        if(tonnage > 0) {
            this.tonnage = tonnage;
        } else {
            this.tonnage = 0;
        }
    }
    
    public int getTonnage() {
        return this.tonnage;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + this.name + ", Cargo Capacity: " + this.tonnage);
    }
}