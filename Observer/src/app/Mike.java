package app;

/**
 * Mike
 */
public class Mike extends Role implements Observer {

    private String news;
    private Subject newsData;

    public Mike(Subject newsData) {
        this.setName("Mike");
        this.newsData = newsData;
        this.newsData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(name + ":");
        System.out.println("Wow! It's '" + news + "'!.");
    }

    @Override
    public void update(String news) {
        this.news = news;
        this.display();
    }
}
