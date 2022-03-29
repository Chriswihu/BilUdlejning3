package com.company;

public class DieselTruck extends AFuelCar
{
    protected DieselTruck(String registrationNumber,
                          String make,
                          String model,
                          int numberOfDoors,
                          int kmPrLitre,
                          boolean hasFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
