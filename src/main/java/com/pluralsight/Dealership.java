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

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
