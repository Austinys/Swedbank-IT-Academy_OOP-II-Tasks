package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    private final int maxSpeed = 50;
    private final int minSpeed = 0;
    private final int minGear = 0;
    private final int maxGear = 10;
    private final int minChangeGear = -2;
    private final int maxChangeGear = 2;


    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear < minChangeGear || newGear > maxChangeGear) {
            throw new WrongGearValueException("Value is not allowed. Please use-2, -1, 1 or 2");
        } else if (newGear + gear < minGear) {
            throw new WrongGearValueException("Gear is too low. Lowest allowed gear is " + minGear);
        } else if (newGear + gear >= maxGear) {
            throw new WrongGearValueException("Gear is too high. Highest allowed gear is " + maxGear);
        }
        newGear = newGear + gear;
        System.out.println("Current road bike gear: " + newGear);
    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            throw new WrongSpeedIncrementException("Increment can't be negative. Please use positive increment.");
        } else if (speed + increment > maxSpeed) {
            throw new WrongSpeedIncrementException("Value is too high to increase bike speed. Highest possible speed to increase is " + (maxSpeed - speed));
        }
        speed = speed + increment;
        System.out.println("Road bike speed increment: " + increment + ", current speed after increment: " + speed);
    }

    @Override
    public void applyBrakes(int decrease) {
        if (decrease >= minSpeed) {
            throw new WrongBrakesValueException("Decrease must be negative.");
        } else if (speed + decrease < minSpeed) {
            throw new WrongBrakesValueException("Road bike speed can't be negative.");
        }
        speed = speed + decrease;
        System.out.println("Road bike speed decrease: " + decrease + ", current speed after decrease: " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "Road bike gear: " + gear + ", speed: " + speed;
    }
}
