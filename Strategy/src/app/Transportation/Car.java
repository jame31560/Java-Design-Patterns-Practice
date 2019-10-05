package app.Transportation;

import app.DriveBeheavior.Drive;

/**
 * Car
 */
public class Car extends Transportation {

    public Car() {
        this.setDriveBeheavior(new Drive());
    }

    @Override
    public void display() {
        System.out.println("This is a car.");
    }
}
