package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    public static int gear;
    public static int speed;

    private final int maxSpeed = 100;
    private final int minSpeed = -10;
    private final int minGear = 0;
    private final int maxGear = 20;
    private final int minChangeGear = -1;
    private final int maxChangeGear = 1;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear < minChangeGear || newGear > maxChangeGear) {
            throw new WrongGearValueException("Value is not allowed. Please use 1 or -1");
        } else if (newGear + gear < minGear) {
            throw new WrongGearValueException("Gear is too low. Lowest allowed gear is " + minGear);
        } else if (newGear + gear >= maxGear) {
            throw new WrongGearValueException("Gear is too high. Highest allowed gear is " + maxGear);
        }
        newGear = newGear + gear;
        System.out.println("Current mountain bike gear: " + newGear);
    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            throw new WrongSpeedIncrementException("Increment can't be negative. Please use positive increment.");
        } else if (speed + increment > maxSpeed) {
            throw new WrongSpeedIncrementException("Value is too high to increase bike speed. Highest possible speed to increase is " + (maxSpeed - speed));
        }
        speed = speed + increment;
        System.out.println("Mountain bike speed increment: " + increment + ", current speed after increment: " + speed);
    }

    @Override
    public void applyBrakes(int decrease) {
        if (decrease < 0) {
            throw new WrongBrakesValueException("Decrease must be a positive number.");
        } else if (speed - decrease < minSpeed) {
            throw new WrongBrakesValueException("Breaking value is too high. The highest possible value to use to brake a mountain bike is " + (speed - minSpeed));
        }
        speed = speed - decrease;
        System.out.println("Mountain bike speed derease " + decrease + ", current speed after decrease: " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "Mountain bike gear: " + gear + ", speed: " + speed;
    }
}
