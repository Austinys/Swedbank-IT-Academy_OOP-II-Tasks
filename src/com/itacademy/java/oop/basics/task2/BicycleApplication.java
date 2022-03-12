package com.itacademy.java.oop.basics.task2;


public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike(1, 10);
        System.out.println(mountainBike);
        Bicycle roadBike = new RoadBike(1, 10);
        System.out.println(roadBike);

        try {
            mountainBike.speedUp(10);
        } catch (WrongSpeedIncrementException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } try {
            mountainBike.applyBrakes(5);
        } catch (WrongBrakesValueException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } try {
            mountainBike.changeGear(1);
        } catch (WrongGearValueException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        try {
            roadBike.speedUp(10);
        } catch (WrongSpeedIncrementException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } try {
            roadBike.applyBrakes(-5);
        } catch (WrongBrakesValueException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } try {
            roadBike.changeGear(1);
        } catch (WrongGearValueException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        };


        Speedometer.chooseWinner((MountainBike) mountainBike, (RoadBike) roadBike);


            }
}