package cs5800.assignment1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cs5800.assignment1.utils.polymorphism.CargoShip;
import cs5800.assignment1.utils.polymorphism.CruiseShip;
import cs5800.assignment1.utils.polymorphism.Ship;

public class TestPolymorphism {
    public final Ship ship = new Ship();
    public final CargoShip cargoShip = new CargoShip();
    public final CruiseShip cruiseShip = new CruiseShip();

    protected final String shipName = "USS CPP";
    protected final int yearBuild = 2025;

    @Test
    void testShip() {
        // Setup objects
        this.ship.setName(this.shipName);
        this.ship.setYear(this.yearBuild);

        // Start testing
        assertEquals(this.ship.getName(), this.shipName);
        assertEquals(this.ship.getYear(), this.yearBuild);
    }

    @Test
    void testCargoShip() {
        // Variable Setup
        final int tonnage = 60000;

        // Setup objects
        this.cargoShip.setName(this.shipName);
        this.cargoShip.setYear(this.yearBuild);
        this.cargoShip.setTonnage(tonnage);

        // Start testing
        assertEquals(this.cargoShip.getName(), this.shipName);
        assertEquals(this.cargoShip.getYear(), this.yearBuild);
        assertEquals(this.cargoShip.getTonnage(), tonnage);
    }

    @Test
    void testCruiseShip() {
        // Variable Setup
        final int maxPassengers = 600;

        // Setup objects
        this.cruiseShip.setName(this.shipName);
        this.cruiseShip.setYear(this.yearBuild);
        this.cruiseShip.setMaxPassengers(maxPassengers);

        // Start testing
        assertEquals(this.cruiseShip.getName(), this.shipName);
        assertEquals(this.cruiseShip.getYear(), this.yearBuild);
        assertEquals(this.cruiseShip.getMaxPassengers(), maxPassengers);
    }}
