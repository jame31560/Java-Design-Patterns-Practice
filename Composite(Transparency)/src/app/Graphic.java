package app;

/**
 * Picture
 */
public abstract class Graphic {

    public void addGraphic(Graphic graphic) {
        throw new UnsupportedOperationException();
    }

    public void deleteGraphic(int index) {
        throw new UnsupportedOperationException();
    }

    abstract void draw();
}
