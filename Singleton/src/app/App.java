package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====Singleton Test Start=====");
        Singleton singleton;
        System.out.println("=======First get instance=====");
        singleton = Singleton.getInstance();
        System.out.println("Instance's Name: " + singleton.getName());
        singleton.setName("Changed");
        System.out.println("Instance's Name: " + singleton.getName());
        System.out.println("======Second get instance=====");
        singleton = Singleton.getInstance();
        System.out.println("Instance's Name: " + singleton.getName());
        System.out.println("=======Singleton Test End=====");

    }
}
