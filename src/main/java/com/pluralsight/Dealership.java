package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNum;
    //might need to change <String> to int or something else
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNum, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.inventory = inventory;
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

    public  Vehicle getAllVehicle(Vehicle vehicle){
        // maybe a get. for each variable of a vehicle

        return null;
    }

    public void removeVehicle(){

    }
}
