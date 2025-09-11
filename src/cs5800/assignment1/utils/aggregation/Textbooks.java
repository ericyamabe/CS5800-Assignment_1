package cs5800.assignment1.utils.aggregation;

public class Textbooks {
    protected String title;
    protected String author;
    protected String publisher;

    public Textbooks() {
        this.setTitle("");
        this.setAuthor("");
        this.setPublisher("");
    }

    public Textbooks(String title, String author, String publisher) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }
}
