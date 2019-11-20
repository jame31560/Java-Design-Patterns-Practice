package app;

/**
 * Rectangle
 */
public class Rectangle implements Flyweight {
    @Override
    public void draw() {
        System.out.println("Rectangle: " + this);
    }
}