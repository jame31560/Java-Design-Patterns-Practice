package app.Transportation;

import app.DriveBeheavior.Ride;

/**
 * Bike
 */
public class Bike extends Transportation {

    public Bike() {
        this.setDriveBeheavior(new Ride());
    }

    @Override
    public void display() {
        System.out.println("This is a bike.");
    }
}
