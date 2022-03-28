package com.company;

public abstract class AFuelCar extends ACar
{
    private int kmPrLitre;
    protected AFuelCar(String registrationNumber,
                       String make, String model,
                       int numberOfDoors,
                       int kmPrLitre)
    {
        super(registrationNumber,
                make,
                model,
                numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }
    abstract String getFuelType(); // should return “Gasoline” or “Diesel”

    public int kmPrLitre() // should return how many kilometres the car can drive on 1 litre of fuel
    {
        return kmPrLitre;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Kilometer per litre = " + kmPrLitre + "\n" +
                "Fuel type = " + getFuelType() + "\n";
    }
}
