package app.Transportation;

import app.DriveBeheavior.NoDrive;

/**
 * ModelCar
 */
public class ModelCar extends Transportation {

    public ModelCar() {
        setDriveBeheavior(new NoDrive());
    }

    @Override
    public void display() {
        System.out.println("This is a model car without wheels.");
    }
}