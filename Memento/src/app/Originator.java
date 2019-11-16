package app;

/**
 * Originator
 */
public class Originator {

    int state;

    Originator(int state) {
        this.state = state;
        printState();
    }

    public void restoreMemento(Memento m) {
        state = m.getState();
    }

    public Memento creatMemento() {
        return new Memento(state);
    }

    public void nextState() {
        state++;
        printState();
    }

    public void printState() {
        System.out.println(this.state);
    }
}
