package com.company;

public class GasolineCar extends AFuelCar
{

    protected GasolineCar(String registrationNumber,
                          String make,
                          String model,
                          int numberOfDoors,
                          int kmPrLitre) {
        super(registrationNumber,
                make,
                model,
                numberOfDoors,
                kmPrLitre, hasFilter);
    }

    @Override
    String getFuelType()
    {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee()
    {
        if(kmPrLitre() < 5)
        {
            return 10470;
        }
        if (kmPrLitre() < 10)
        {
            return 5500;
        }
        if(kmPrLitre() < 15)
        {
            return 2340;
        }
        if(kmPrLitre() < 20)
        {
            return 1050;
        }
        return 330;
    }


}
