package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    public static int gear;
    public static int speed;

    private final int maxSpeed = 100;
    private final int minSpeed = -10;
    private final int minGear = 0;
    private final int maxGear = 20;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear != 1 && newGear != -1) {
            throw new Exceptions("Value is not allowed. Please use 1 or -1");
        } else if (newGear + gear < minGear) {
            throw new Exceptions("Gear is too low. Lowest allowed gear is " + minGear);
        } else if (newGear + gear >= maxGear) {
            throw new Exceptions("Gear is too high. Highest allowed gear is " + maxGear);
        }
        newGear = newGear + gear;
        System.out.println("Current gear: " + newGear);
    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            throw new Exceptions("Increment can't be negative. Please use positive increment.");
        } else if (speed + increment > maxSpeed) {
            throw new Exceptions("Value is too high to increase bike speed. Highest possible speed to increase is " + (maxSpeed - speed));
        }
        speed = speed + increment;
        System.out.println("Current Mountain bike speed after increment: " + speed);
    }

    @Override
    public void applyBrakes(int decrease) {
        if (decrease < 0) {
            throw new Exceptions("Decrease must be a positive number.");
        } else if (speed - decrease < minSpeed) {
            throw new Exceptions("Breaking value is too high. The highest possible value to use to brake a mountain bike is " + (speed - minSpeed));
        }
        speed = speed - decrease;
        System.out.println("Current Mountain bike speed after decrease: " + speed);
    }

    public int getSpeed() {
        return speed;
    }


    public String toString() {
        return "Mountainbike gear: " + gear + ", speed: " + speed;
    }
}
