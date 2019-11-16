package app;

public class App {
    public static void main(String[] args) throws Exception {
        Originator originator = new Originator(0);
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.creatMemento());

        for (int i = 0; i < 4; i++) {
            originator.nextState();
            caretaker.setMemento(originator.creatMemento());
        }
        originator.nextState();
        originator.restoreMemento(caretaker.getMemento());
        originator.printState();

    }
}