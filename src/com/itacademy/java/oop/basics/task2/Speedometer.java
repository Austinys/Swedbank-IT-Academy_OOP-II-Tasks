package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            System.out.println(Bike.MOUNTAIN + " Bike Wins!");
        } else if (mountainBike.getSpeed() < roadBike.getSpeed())
            System.out.println(Bike.ROAD + " Bike Wins!");
       return null;
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            System.out.println(Bike.MOUNTAIN + " Bike Wins!");
        } else if (mountainBikeSpeed < roadBikeSpeed)
            System.out.println(Bike.ROAD + " Bike Wins!");
        return null;
    }
}

