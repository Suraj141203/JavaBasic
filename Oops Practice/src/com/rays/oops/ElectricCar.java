package com.rays.oops;

public class ElectricCar extends Car {
    void charge() {
        System.out.println("The electric car is charging.");
    }

    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.move();   
        myElectricCar.honk();  
        myElectricCar.charge();
    }
}
