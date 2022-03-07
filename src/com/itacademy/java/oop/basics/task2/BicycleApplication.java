package com.itacademy.java.oop.basics.task2;

import static com.itacademy.java.oop.basics.task2.MountainBike.gear;
import static com.itacademy.java.oop.basics.task2.MountainBike.speed;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mountainBike = new MountainBike(1, 10);
        System.out.println("Mountain bike starting gear: " + gear + " and speed: " + speed);
        Bicycle roadBike = new RoadBike(1, 10);
        System.out.println("Road bike starting gear: " + gear + " and speed: " + speed);

        mountainBike.speedUp(40);
        mountainBike.applyBrakes(5);
        mountainBike.changeGear(-1);

        roadBike.speedUp(20);
        roadBike.applyBrakes(-2);
        roadBike.changeGear(2);

        Speedometer.chooseWinner((MountainBike) mountainBike, (RoadBike) roadBike);
    }
}
