package main.java.com.packt.entities;

public class Truck extends Vehicle{
    int payload;
    public Truck(int payloadPounds, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.payload = payloadPounds;
    }

    public int getPayload() {
        return payload;
    }
}
