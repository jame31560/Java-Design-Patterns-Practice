package app;

import java.util.ArrayList;

/**
 * Picture
 */
public class Picture extends Graphic {

    private ArrayList<Graphic> graphicList = new ArrayList<>();

    @Override
    void draw() {
        System.out.println("========");
        System.out.println("---Picture");
        System.out.println("========");

        for (Graphic graphic : graphicList) {
            graphic.draw();
        }
    }

    public void addGraphic(Graphic graphic) {
        graphicList.add(graphic);
    }

    public void deleteGraphic(int index) {
        graphicList.remove(index);
    }
}
