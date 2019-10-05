package app;

import app.DriveBeheavior.Push;
import app.Transportation.Bike;
import app.Transportation.Car;
import app.Transportation.ModelCar;
import app.Transportation.ToyCar;
import app.Transportation.Transportation;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("======Strategy Test Start=====");
        Transportation transportation;
        transportation = new Car();
        transportation.display();
        transportation.drive();
        System.out.println("==============================");
        transportation = new Bike();
        transportation.display();
        transportation.drive();
        System.out.println("==============================");
        transportation = new ToyCar();
        transportation.display();
        transportation.drive();
        System.out.println("==============================");
        transportation = new ModelCar();
        transportation.display();
        transportation.drive();
        System.out.println("=====After install wheels=====");
        transportation.setDriveBeheavior(new Push());
        transportation.display();
        transportation.drive();
        System.out.println("======Strategy Test End=======");
    }
}
