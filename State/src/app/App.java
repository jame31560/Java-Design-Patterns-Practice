package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=======State Test Start=======");
        Car car = new Car();
        car.acceleratorOn();
        car.trunOff();
        car.startUp();
        car.acceleratorOn();
        car.startUp();
        car.trunOff();
        System.out.println("========State Test End========");
    }
}
