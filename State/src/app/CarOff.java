package app;

/**
 * CarOff
 */
public class CarOff implements CarState {

    @Override
    public void startup(Car car) {
        System.out.println("Start Up...");
        car.changeState(new CarOn());
        System.out.println("On.");
    }

    @Override
    public void acceleratorOn() {
        System.out.println("Please start the car first.");
    }

    @Override
    public void turnOff(Car car) {
        System.out.println("Already off.");
    }
}
