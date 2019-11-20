package app;

/**
 * Line
 */
public class Line implements Flyweight {

    @Override
    public void draw() {
        System.out.println("Line: " + this);
    }
}