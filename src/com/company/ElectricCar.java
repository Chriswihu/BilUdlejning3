package com.company;

public class ElectricCar extends ACar
{
    private int batteryCapacityKWH;
    private int maxRangeKm;

    protected ElectricCar(String registrationNumber,
                          String make,
                          String model,
                          int numberOfDoors,
                          int batteryCapacityKWH,
                          int maxRangeKm)
    {

        super(registrationNumber,
                make,
                model,
                numberOfDoors);
        this.batteryCapacityKWH = batteryCapacityKWH;
        this.maxRangeKm = maxRangeKm;
    }

    @Override
    public int getRegistrationFee()
    {
        int kmPrL = (int) ((100 / (getWhPrKm() / 91.25)) + 0.5);
        if(kmPrL < 5)
        {
            return 10470;
        }
        if (kmPrL < 10)
        {
            return 5500;
        }
        if(kmPrL < 15)
        {
            return 2340;
        }
        if(kmPrL < 20)
        {
            return 1050;
        }
        return 330;
    }

    public int getBatteryCapacityKWh() // returns the battery capacity in kilowatt hours
    {
        return batteryCapacityKWH;
    }

    public int getMaxRangeKm() // returns the maximum range in kilometres.
    {
        return maxRangeKm;
    }

    public int getWhPrKm() // returns the power consumption in watt hours per driven kilometre.
    {
        return (batteryCapacityKWH * 1000) / maxRangeKm;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Enginge type = Electric\n" +
                "Battery capacity in KWH = " + batteryCapacityKWH + "\n" +
                "Max range in Km = " + maxRangeKm + "\n";
    }
}
