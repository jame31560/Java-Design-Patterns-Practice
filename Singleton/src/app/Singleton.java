package app;

/**
 * Singleton
 */
public class Singleton {

    private String name;
    private static volatile Singleton singleton;

    private Singleton() {
        this.name = "Default";
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                // Waiting for other threads.
                if (singleton == null) {
                    singleton = new Singleton();
                    System.out.println("Create a new instance.");
                } else {
                    System.out.println("Instance is exist.");
                }
            }
        } else {
            System.out.println("Instance is exist.");
        }
        return singleton;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        System.out.println("Instance's name has changed from '" + this.name + "' to '" + name + "'.");
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
