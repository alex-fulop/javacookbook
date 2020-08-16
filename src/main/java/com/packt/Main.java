package main.java.com.packt;

import main.java.com.packt.entities.Truck;
import main.java.com.packt.entities.Vehicle;

public class Main {

    public static void main(String[] args) {
	double timeSec = 2.0;
	int engineHorsePower = 246;
	int vehicleWeightPounds = 4000;
	Vehicle vehicle = new Truck(3330, vehicleWeightPounds, engineHorsePower);
    }
}
