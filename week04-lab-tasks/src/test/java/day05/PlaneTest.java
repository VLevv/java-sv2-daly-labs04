package day05;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PlaneTest {
    @Test
    void testPlane(){
        Passenger passenger = new Passenger("Jack","asd123",4);
        Passenger passenger1 = new Passenger("Joe","asd1267",2);
        Passenger passenger2 = new Passenger("Jane","asd153",3);
        Passenger passenger3 = new Passenger("Bob","asf123",6);
        Plane plane = new Plane(3);
        plane.addPassenger(passenger);
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        assertFalse(plane.addPassenger(passenger3));
        assertEquals(9,plane.numberOfPackages());
    }
}
