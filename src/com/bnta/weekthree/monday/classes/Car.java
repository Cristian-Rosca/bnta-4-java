package com.bnta.weekthree.monday.classes;



public class Car {
    private String make;
    private int price;
    private EngineTypes.engineType engine;
    static int carCount; // Adding an integer property to the Car class. Make sure this is static (related to class itself, not individual objects)

    public Car () {
        carCount++; // each time a car is constructed carCount is incremented
    }

    public Car(String make, int price, EngineTypes.engineType engine) {
        this.make = make;
        this.price = price;
        this.engine = engine;
        carCount++; // each time a car is constructed carCount is incremented
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EngineTypes.engineType getEngine() {
        return engine;
    }

    public void setEngine(EngineTypes.engineType engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }

    // Method to call out how many total Car objects have been created
    public static int getCarCount () {
        return Car.carCount;
    }

}
