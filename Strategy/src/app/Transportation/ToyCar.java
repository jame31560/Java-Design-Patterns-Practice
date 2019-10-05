package app.Transportation;

import app.DriveBeheavior.Push;

/**
 * ToyCar
 */
public class ToyCar extends Transportation {

    public ToyCar() {
        setDriveBeheavior(new Push());
    }

    @Override
    public void display() {
        System.out.println("This is a toy car.");
    }
}
