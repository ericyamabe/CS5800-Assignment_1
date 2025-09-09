package com.cs5800.polymorphism;
import com.cs5800.polymorphism.CruiseShip;
import com.cs5800.polymorphism.CargoShip;
import com.cs5800.polymorphism.Ship;

public class Driver {
    public static void main(String[] args) {
        Ship[] shiplist = new Ship[3];

        shiplist[0] = new Ship("USS Bonhomme Richard", 1995);
        shiplist[1] = new CruiseShip("Disney Magic", 1998, 2713);
        shiplist[2] = new CargoShip("Atlantic Causeway", 1969, 14946);

        for(Ship singleShip : shiplist) {
            singleShip.print();
        }
    }
}