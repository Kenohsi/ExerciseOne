package at.ac.fhcampuswien;

public class Article {
    private String author;
    private String title;

    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;

    public Article(String author, String title) {
        this.setAuthor(author);
        this.setTitle(title);
    }
    private void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Article(String author, String title, String description, String url, String urlToImage, String publishedAt, String content) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    @Override
    public String toString() {
        return "Author: " + author + System.lineSeparator() + "Title: " + title;
    }
}
