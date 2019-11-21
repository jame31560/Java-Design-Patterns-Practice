package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=====Decorator Test Start=====");
        Combo A = new Drink(new ComboA());
        Combo B = new ComboB();
        Combo C = new Dessert(new Drink(new ComboB()));

        System.out.println("A: " + A.print());
        System.out.println("A price: " + A.price() + "\n");

        System.out.println("B: " + B.print());
        System.out.println("B price: " + B.price() + "\n");

        System.out.println("C: " + C.print());
        System.out.println("C price: " + C.price());

        System.out.println("======Decorator Test End======");
    }
}