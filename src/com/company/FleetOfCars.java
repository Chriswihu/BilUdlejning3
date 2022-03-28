package com.company;

import java.util.ArrayList;

public class FleetOfCars
{
    private ArrayList<Car> fleet;

    public FleetOfCars()
    {
        fleet = new ArrayList<>();

    }
    public void addCarsToFleet(Car car)
    {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet()
    {
        int sum = 0;
        for (Car car : fleet)
        {
            sum += car.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString()
    {
        StringBuilder res = new StringBuilder();
        res.append("Fleet of Cars:\n");
        res.append("*******************************************************\n");
        for(Car car : fleet)
        {
            res.append(car.toString());
            res.append("*******************************************************\n");
        }
        return res.toString();
    }
}
