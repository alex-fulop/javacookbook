package test.com.packt;

import main.java.com.packt.entities.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VehicleTest {

    @Test
    public void getCorrectWeightPoundsValue(){
        int weightPounds = 9000;
        int horsePower = 300;
        Vehicle vehicle = new Vehicle(weightPounds, horsePower);
        assertEquals(9000, vehicle.getWeightPounds());
    }

    @Test
    public void getCorrectMilesPerHourValue(){
        int weightPounds = 9000;
        int horsePower = 300;
        Vehicle vehicle = new Vehicle(weightPounds, horsePower);
        assertEquals( 87, vehicle.getMilesPerHour(10.2),0);
    }
}
