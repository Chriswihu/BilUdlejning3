package com.company;

//Abstract because it is a derivative of Car, but not a full clone
public abstract class ACar implements Car {
    private String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

    protected ACar(String registrationNumber,
                   String make,
                   String model,
                   int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString()
    {
        return  "\nRegistration number = " + registrationNumber + "\n" +
                "Make = " + make + "\n" +
                "Model = " + model + "\n" +
                "Number of doors = " + numberOfDoors + "\n";
    }
}
