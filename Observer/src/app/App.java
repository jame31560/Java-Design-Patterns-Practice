package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("======Observer Test Start=====");
        NewsData newsData = new NewsData();
        System.out.println("====No person subscription====");
        newsData.publicNews("No.1 News");
        Mary mary = new Mary(newsData);
        Mike mike = new Mike(newsData);
        System.out.println("====Two person subscription===");
        newsData.publicNews("No.2 News");
        Jenny jenny = new Jenny(newsData);
        System.out.println("===Tree person subscription===");
        newsData.publicNews("No.3 News");
        newsData.removeObserver(jenny);
        System.out.println("=====Jenny unsubscription=====");
        newsData.publicNews("No.4 News");
        System.out.println("=======Observer Test End======");
    }
}
