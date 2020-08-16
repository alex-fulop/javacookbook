package main.java.com.packt.entities;

public class Vehicle {

    private int weightPounds;
    private int horsePower;
    public Vehicle(int weightPounds, int horsePower){
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;

    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public double getMilesPerHour(double timeSec){
         class Engine {
            private final int horsePower;

            Engine(int horsePower){
                this.horsePower = horsePower;
            }

            public long getMilesPerHour(double timeSec) {
                double velocity = 2.0 * this.horsePower * 746;
                velocity = velocity * timeSec * 32.174 / getWeightPounds();
                return Math.round(Math.sqrt(velocity) * 0.68);
            }
        }

        Engine engine = new Engine(this.horsePower);
        return engine.getMilesPerHour(timeSec);
    }
}
