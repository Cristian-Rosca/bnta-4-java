package com.bnta.weekthree.monday.classes;

import java.util.Arrays;

public class Dealership {
    private String dealerName;
    private int maxCapacity;
    private Car [] carsInStock;

    public Dealership(String dealerName, int maxCapacity, Car[] carsInStock) {
        this.dealerName = dealerName;
        this.maxCapacity = maxCapacity;
        this.carsInStock = new Car[Car.carCount]; // Making the maximum array size equal to the total number of cars created
    } // The above may not be the best solution. If cars are added after object is created, array will be too small for all objects.

    public Dealership(String dealerName, int maxCapacity) { // not asked to specify car array when creating object //
        this.dealerName = dealerName;
        this.maxCapacity = maxCapacity;
        this.carsInStock = new Car[Car.carCount];
    }


    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }


    @Override
    public String toString() {
        return "Dealership{" +
                "dealerName='" + dealerName + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';



        }


    }



