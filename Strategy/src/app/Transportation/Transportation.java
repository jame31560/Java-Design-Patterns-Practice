package app.Transportation;

import app.DriveBeheavior.DriveBeheavior;

/**
 * Transportation
 */
public abstract class Transportation {

    public DriveBeheavior driveBeheavior;

    public abstract void display();

    /**
     * @param driveBeheavior the driveBeheavior to set
     */
    public void setDriveBeheavior(DriveBeheavior driveBeheavior) {
        this.driveBeheavior = driveBeheavior;
    }

    public void drive() {
        driveBeheavior.drive();
    }

}
