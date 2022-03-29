package com.company;

public class DieselCar extends AFuelCar
{
    private boolean hasFilter;
    protected DieselCar(String registrationNumber,
                        String make,
                        String model,
                        int numberOfDoors,
                        int kmPrLitre,
                        boolean hasFilter)
    {
        super(registrationNumber,
                make,
                model,
                numberOfDoors,
                kmPrLitre, hasFilter);
        this.hasFilter = hasFilter;
    }

    @Override
    String getFuelType()
    {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int sum = 0;
        if(kmPrLitre() < 5)
        {
            sum += 10470+15260;
        }
        else if (kmPrLitre() < 10)
        {
            sum += 5500+2770;
        }
        else if(kmPrLitre() < 15)
        {
            sum += 2340+1850;
        }
        else if(kmPrLitre() < 20)
        {
            sum += 1050+1390;
        }
        else
        {
            sum += 330+130;
        }
        if(!hasFilter)
        {
            sum += 1000;
        }
        return sum;
    }
    public boolean hasParticleFilter()
    {
        return hasFilter;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Has particle Filter: " + hasFilter + "\n";
    }
}
