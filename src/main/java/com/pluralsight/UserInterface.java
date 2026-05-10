package com.pluralsight;

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
            choice = input.nextLine();

            //does things based on user input
            if (choice.equals("1")){
                priceRangeSearch();
            } else if (choice.equals("2")){
                makeModelSearch();
            }else if (choice.equals("3")){
                yearRangeSearch();
            }else if (choice.equals("4")){
                colorSearch();
            }else if (choice.equals("5")){
                mileRangeSearch();
            }else if (choice.equals("6")){
                typeSearch();
            }else if (choice.equals("7")){
                allVehicleSearch();
            }else if (choice.equals("8")){
                addVehicle();
            }else if (choice.equals("9")){
                removeVehicle();
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

    public void priceRangeSearch(){
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
    }

    public void addVehicle(){
    }

    public void removeVehicle(){
    }










}
