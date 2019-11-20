package app;

/**
 * State
 */
public interface CarState {

    public void startup(Car car);

    public void acceleratorOn();

    public void turnOff(Car car);
}
