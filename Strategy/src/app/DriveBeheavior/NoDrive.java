package app.DriveBeheavior;

/**
 * NoDrive
 */
public class NoDrive implements DriveBeheavior {

    @Override
    public void drive() {
        System.out.println("Can't drive.");
    }
}
