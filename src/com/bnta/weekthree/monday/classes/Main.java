package com.bnta.weekthree.monday.classes;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Creating Car Objects
        Car volvo = new Car("volvo", 200, EngineTypes.engineType.Diesel);

        Car mercedes = new Car("mercedes", 350, EngineTypes.engineType.Diesel);

        // getting the engine of first car object
        System.out.println(volvo.getEngine());

        // changing the engineType of first car object
        volvo.setEngine(EngineTypes.engineType.Electric);

        // printing all properties of first Car object
        System.out.println(volvo);


        // Creating Dealership Objects
        Dealership cristianCars = new Dealership("Cristian's Cars", 10);

        DealershipService dealershipService = new DealershipService(); // Importing DealershipService Class Functions/Methods

        //Counting the total number of Car Class Objects created
        System.out.println(Car.carCount);


        // Invoking method to add car to dealership
        dealershipService.addCar(volvo,cristianCars);

        // printing all properties of dealership object
        System.out.println(cristianCars);

        // Counting how many cars are currently held in cristianCars object
        System.out.println("________");
        System.out.println(dealershipService.countCarsInDealership(cristianCars));


        // Searching for a car by make in a given dealership
        // We have added mercedes to cristianCars above
        // We will try to return mercedes using filter function

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which make do you want to search?");
        String searchMake = scanner.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(dealershipService.findCarByMake(searchMake,cristianCars));
    }



}
