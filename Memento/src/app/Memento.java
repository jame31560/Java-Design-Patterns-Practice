package app;

/**
 * Memento
 */
public class Memento {
    int state;

    Memento(int state) {
        this.state = state;
    }

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }
}
