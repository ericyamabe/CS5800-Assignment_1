package com.cs5800.polymorphism;
import com.cs5800.polymorphism.Ship;

public class CruiseShip extends Ship {
    private int maxPassangers;

    public CruiseShip() {
        this.setName("");
        this.setYear(0);
        this.setMaxPassengers(0);
    }

    public CruiseShip(String name, int year, int maxPassengers) {
        this.setName(name);
        this.setYear(year);
        this.setMaxPassengers(maxPassengers);
    }

    public void setMaxPassengers(int maxPassengers) {
        if(maxPassengers > 0) {
            this.maxPassangers = maxPassengers;
        } else {
            this.maxPassangers = 0;
        }
    }

    public int getMaxPassengers() {
        return this.maxPassangers;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + this.name + ", Max number of passengers: " + this.maxPassangers);
    }
}