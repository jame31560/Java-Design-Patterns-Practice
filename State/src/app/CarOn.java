package app;

/**
 * CarOn
 */
public class CarOn implements CarState {

    @Override
    public void startup(Car car) {
        System.out.println("Already started.");
    }

    @Override
    public void acceleratorOn() {
        System.out.println("Go forward...");
    }

    @Override
    public void turnOff(Car car) {
        System.out.println("Turn Off...");
        car.changeState(new CarOff());
        System.out.println("Off.");
    }
}
