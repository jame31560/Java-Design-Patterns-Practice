package app;

import java.util.HashMap;

/**
 * FlyweightFactory
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> graphicList = new HashMap<>();

    public Flyweight getFlyweight(String graphic) {
        Flyweight flyweight = graphicList.get(graphic);

        if (flyweight == null) {
            switch (graphic) {
            case "line":
                flyweight = new Line();
                break;

            case "rectangle":
                flyweight = new Rectangle();
                break;
            }
            graphicList.put(graphic, flyweight);
        }
        return flyweight;
    }
}
