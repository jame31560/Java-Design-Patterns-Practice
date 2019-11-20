package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("======Flyweight Test Start=====");

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight f = flyweightFactory.getFlyweight("line");
        f.draw();
        Flyweight f2 = flyweightFactory.getFlyweight("rectangle");
        f2.draw();
        Flyweight f3 = flyweightFactory.getFlyweight("rectangle");
        f3.draw();
        Flyweight f4 = flyweightFactory.getFlyweight("line");
        f4.draw();
        System.out.println("=======Flyweight Test End======");
    }
}