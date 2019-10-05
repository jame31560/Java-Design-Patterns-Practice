package app;

/**
 * Jenny
 */
public class Jenny extends Role implements Observer {

    private String news;
    private Subject newsData;

    public Jenny(Subject newsData) {
        setName("Jenny");
        this.newsData = newsData;
        this.newsData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.name + ":");
        System.out.println("The news '" + news + "', I have get it!");
    }

    @Override
    public void update(String news) {
        this.news = news;
        this.display();
    }
}
