package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    //    Add supporting methods:
    //
    //    displayVehicles(List<Vehicle> list) – Loops through and displays each vehicle.
    //    Used by all the “get vehicles” features.

    //    processAllVehiclesRequest() – Calls dealership.getAllVehicles() and passes the result to displayVehicles().


    Scanner input = new Scanner(System.in);
    private Dealership dealership;

    public String display(){
        init();
        String choice = "";

        do {
            //loop that displays menu
            System.out.println(" ");
            System.out.println("1) - Find vehicles within a price range ");
            System.out.println("2) - Find vehicles by make / model ");
            System.out.println("3) - Find vehicles by year range");
            System.out.println("4) - Find vehicles by color ");
            System.out.println("5) - Find vehicles by mileage range ");
            System.out.println("6) - Find vehicles by type (car, truck, SUV, van) ");
            System.out.println("7) - List ALL vehicles ");
            System.out.println("8) - Add a vehicle ");
            System.out.println("9) - Remove a vehicle ");
            System.out.println("99) - Quit ");
            System.out.println();
            //validates for a number input

            if (input.hasNextInt()) {
                choice = input.nextLine();
            }

            switch (choice){
                case "1":
                    priceRangeSearch();
                    break;
                case "2":
                    makeModelSearch();
                    break;
                case "3":
                    yearRangeSearch();
                    break;
                case "4":
                    colorSearch();
                    break;
                case "5":
                    mileRangeSearch();
                    break;
                case "6":
                    typeSearch();
                    break;
                case "7":
                    allVehicleSearch();
                    break;
                case "8":
                    addVehicle();
                    break;
                case "9":
                    removeVehicle();
                    break;
            }

        }while (!choice.equals("99"));

        // ends loop12
        return choice;
    }
        //need to practice stuff like this
    private void init(){
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealership = dealershipFileManager.getDealership();
    }

    //Switch Menu Methods
    public void priceRangeSearch(){
        System.out.println("what is the min price you are looking for? ");
        Double minPrice = input.nextDouble();
        System.out.println("what is the max price you are looking for? ");
        Double maxPrice = input.nextDouble();

        displayVehicles(dealership.getVehicleByPrice(minPrice,maxPrice));
    }

    public void makeModelSearch(){

    }

    public void yearRangeSearch(){

    }

    public void colorSearch(){

    }

    public void mileRangeSearch(){

    }

    public void typeSearch(){

    }

    public void allVehicleSearch(){
        processAllVehiclesRequest();
    }

    public void addVehicle(){

    }

    public void removeVehicle(){

    }

    private void displayVehicles(ArrayList<Vehicle> getAllVehicle){

        for (Vehicle vehicle: getAllVehicle){
            //display the entire list line by line
            System.out.println(vehicle);
        }
    }

    public void processAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicle());
    }

    }

