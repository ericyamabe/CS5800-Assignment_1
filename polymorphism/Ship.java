package com.cs5800.polymorphism;

public class Ship {
    protected String name;
    protected int year;

    public Ship() {
        this.name = "";
        this.year = 0000;
    }

    public Ship(String name, int year) {
        this.setName(name);
        this.setYear(year);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void print() {
        System.out.println("Ship Name: " + this.name + ", Year Built: " + this.year);
    }
}