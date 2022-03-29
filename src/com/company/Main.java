package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new GasolineCar("THK-674", "Kia", "Elganto", 5, 19);
        //System.out.println(car);
        System.out.println("Registration Fee is = " + car.getRegistrationFee());
        Car car1 = new DieselCar("XCQ-756", "Mercedes", "2400", 4, 15, false);
        //System.out.println(car1);
        System.out.println("Registration Fee is = " + car1.getRegistrationFee());
        Car car2 = new ElectricCar("THZ-875", "Tesla", "S3", 5, 700, 450);
        //System.out.println(car2);
        System.out.println("Registration Fee is = " + car2.getRegistrationFee());

        FleetOfCars myFleet = new FleetOfCars();
        myFleet.addCarsToFleet(car);
        myFleet.addCarsToFleet(car1);
        myFleet.addCarsToFleet(car2);

        System.out.println("\n\n\n");
        System.out.println(myFleet);

        System.out.println("\n\n\n");
        System.out.println(myFleet.getTotalRegistrationFeeForFleet());

        MainFeature mainFeature = new MainFeature();
        System.out.println(mainFeature);

        NewFeature newFeature = new NewFeature();
        System.out.println(newFeature);
    }
}
