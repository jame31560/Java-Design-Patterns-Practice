package app;

/**
 * Mary
 */
public class Mary extends Role implements Observer {

    private String news;
    private Subject newsData;

    public Mary(Subject newsData) {
        this.setName("Mary");
        this.newsData = newsData;
        this.newsData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.name + ":");
        System.out.println("I get the news '" + news + "'.");
    }

    @Override
    public void update(String news) {
        this.news = news;
        this.display();
    }
}
