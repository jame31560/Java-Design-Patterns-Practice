package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=Composite(Safety) Test Start=");
        Graphic graphic1 = new Picture();
        ((Picture) graphic1).addGraphic(new Text());
        ((Picture) graphic1).addGraphic(new Rectangle());
        ((Picture) graphic1).addGraphic(new Line());

        Graphic graphic2 = new Picture();
        ((Picture) graphic2).addGraphic(new Line());
        ((Picture) graphic2).addGraphic(new Line());
        ((Picture) graphic2).addGraphic(new Text());
        ((Picture) graphic2).addGraphic(new Line());

        Graphic graphic = new Picture();
        ((Picture) graphic).addGraphic(graphic2);
        ((Picture) graphic).addGraphic(graphic1);
        ((Picture) graphic).addGraphic(new Text());

        graphic.draw();
        System.out.println("==Composite(Safety) Test End==");
    }
}
