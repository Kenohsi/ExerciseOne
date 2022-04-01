package at.ac.fhcampuswien;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class AppController implements Shape {
    private List<Article> articles;
    public String query = "Bitcoin";


    public AppController() {
        this.articles = generateMockList();
    }


    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getArticleCount() {
        if (articles == null) {
            return 0;
        } else {
            return articles.size();
        }

    }

    public List<Article> getTopHeadlinesAustria() {
        return generateMockList();

    }


    public List<Article> getAllNewsBitcoin() {

        return filterList(query, articles);
    }

    protected List<Article> filterList(String query, List<Article> articles) {
        List<Article> rem_article = new ArrayList<>();
        for (Article a : articles) {
            if (a.getTitle().toLowerCase().contains(query.toLowerCase())) {
                rem_article.add(a);
            }
        }

        return rem_article;
    }

    public static List<Article> generateMockList() { // was set to public for javaFX
        List<Article> articles = new ArrayList();
        Article one = new Article("Steve Rosenberg ", "Ukraine war: Russians grieve for fallen soldiers");
        articles.add(one);
        Article two = new Article("Annabelle Liang ", "Businesses shut as officials widen Covid lockdowns");
        articles.add(two);
        Article three = new Article("Josh Martin ", "Bitcoin P&O cancels services and tells ships to stay in port");
        articles.add(three);
        Article four = new Article("The New York Times", "The Bitcoin Case That Puzzled the Shadowy World of Cryptocurrency");
        articles.add(four);
        return articles;
    }


    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}



