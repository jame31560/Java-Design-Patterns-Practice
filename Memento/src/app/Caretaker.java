package app;

/**
 * Caretaker
 */
public class Caretaker {

    Memento memento;

    /**
     * @param memento the memento to set
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * @return the memento
     */
    public Memento getMemento() {
        return memento;
    }
}
