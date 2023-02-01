package Vehicles;

import abstraction.Refuelable;

public class Vehicle implements Refuelable {
    private String make;
    private String model;
    private String colour = "black";
    private int speed;
    private int numDoors;
    private int fuel;

    public Vehicle(){
        super();
    }
    public Vehicle(String make, String model, String colour, int speed, int numbDoors) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.speed = speed;
        this.numDoors = numbDoors;
    }

    @Override
    public void refuel(int fuel) {
        this.fuel += fuel;
    }

    @Override
    public void refuel() {
        this.fuel = 40;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

//    public void accelerate (int speed){
//        this.speed += speed;
//    }
//    public void decelerate (int speed){
//        this.speed -= speed;
//    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                ", numDoors=" + numDoors +
                '}';
    }

    public int getBill(){
        return 0;
    }
}
