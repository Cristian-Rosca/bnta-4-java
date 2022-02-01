package com.bnta.weekthree.monday.classes;

public class DealershipService {

    // Write another method to add a car to the dealership.
    // The method should have a Car parameter and doesn't need to return anything.
    public void addCar(Car car, Dealership dealership) {
        for (int i = 0; i < dealership.getCarsInStock().length; i++) {
            if (dealership.getCarsInStock()[i] == null) {
                dealership.getCarsInStock()[i] = car;
                break;
            }
            else {
                // insert else functionality
            }
        }

    }

    // Write a method to count the number of cars in the dealership.
    // It doesn't need to take any parameters and should return an int.

    public int countCarsInDealership (Dealership dealership) {
        int dealerCarCount = 0;
        for (int i = 0; i < dealership.getCarsInStock().length; i++) {
            if (dealership.getCarsInStock()[i] != null) {
                dealerCarCount++;
            }
        }
        return dealerCarCount;
    }

    /* Write a method for the dealership called findCarByManufacturer which takes a String as a parameter and returns a Car object.

    The method should return the first Car the dealership has in stock with a manufacturer property matching the value passed to the method.
     */

    public Car findCarByMake (String searchMake, Dealership dealership) throws Exception {
        Car placeholder = new Car ();
        for (int i = 0; i < dealership.getCarsInStock().length; i++) {
            if (dealership.getCarsInStock()[i].getMake().equals(searchMake)) {
                placeholder = dealership.getCarsInStock()[i];
                break;
            }
            else {
                throw new Exception ("No match found"); // Must include exception in method signature(?)- see ln38
            }
        }
        return placeholder;
    }

        // Scan through the array of cars in the dealership
            // Examine each car in the array and look for a match between car make and input string
                // if there is a match, return the Car name
            // If not a match, move onto the next car in the Array
            // If no match in the array, throw an exception


    }


