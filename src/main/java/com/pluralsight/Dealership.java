package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNum;
    //might need to change <String> to int or something else
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public  ArrayList<Vehicle> getAllVehicle(){
        //all stored in the array list
        //need to display all things on the array list
        return inventory;
    }

    public void removeVehicle(){
    }

    public ArrayList<Vehicle> getVehicleByPrice(double minPrice, double maxPrice){
        ArrayList<Vehicle> priceSearch = new ArrayList<Vehicle>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice){
                priceSearch.add(vehicle);
            }
        }
        return priceSearch;
    }

    public ArrayList<Vehicle> getVehicleMakeModel(String inputMake,String inputModel){
        ArrayList<Vehicle> makeModelSearch = new ArrayList<Vehicle>();
        for (Vehicle vehicle : inventory){
            if (inputMake.equals(vehicle.getMake()) && inputModel.equals(vehicle.getModel())){
                makeModelSearch.add(vehicle);
            }
        }
        return makeModelSearch;
    }

    public ArrayList<Vehicle> getVehicleByYear(int minYear,int maxYear){
        ArrayList<Vehicle> yearSearch = new ArrayList<Vehicle>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear){
                yearSearch.add(vehicle);
            }
        }
        return yearSearch;
    }

    public ArrayList<Vehicle> getVehicleColor(String inputColor){
        ArrayList<Vehicle> colorSearch = new ArrayList<Vehicle>();
        for (Vehicle vehicle : inventory){
            if (inputColor.equals(vehicle.getColor())){
                colorSearch.add(vehicle);
            }
        }
        return colorSearch;
    }

    public ArrayList<Vehicle> getVehicleByMiles(int minMiles,int maxMiles){
        ArrayList<Vehicle> mileRangeSearch = new ArrayList<Vehicle>();
        for (Vehicle vehicle : inventory){
            if (vehicle.getOdometer() >= minMiles && vehicle.getOdometer() <= maxMiles){
                mileRangeSearch.add(vehicle);
            }
        }
        return mileRangeSearch;
    }
}
