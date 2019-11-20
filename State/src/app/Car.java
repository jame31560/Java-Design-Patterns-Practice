package app;

/**
 * Car
 */
public class Car {

    private CarState carState;

    Car() {
        carState = new CarOff();
    }

    public void changeState(CarState carState) {
        this.carState = carState;
    }

    public void startUp() {
        System.out.println("======Press the Start Up======");
        carState.startup(this);
    }

    public void acceleratorOn() {
        System.out.println("=====Tread the Accelerator====");
        carState.acceleratorOn();
    }

    public void trunOff() {
        System.out.println("======Press the Turn Off======");
        carState.turnOff(this);
    }
}