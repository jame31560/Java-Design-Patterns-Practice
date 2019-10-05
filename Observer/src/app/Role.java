package app;

/**
 * Person
 */
public abstract class Role {

    public String name;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
