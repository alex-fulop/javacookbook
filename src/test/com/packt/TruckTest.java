package test.com.packt;

import main.java.com.packt.entities.Truck;
import org.junit.Test;

public class TruckTest {
    @Test
    public void instantiateTruck(){
        int payloadPounds = 2000;
        int horsePower = 246;
        int vehicleWeightPounds = 4000;
        Truck truck = new Truck(payloadPounds, horsePower, vehicleWeightPounds );
    }
}
