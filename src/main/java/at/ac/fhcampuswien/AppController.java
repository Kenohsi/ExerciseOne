package at.ac.fhcampuswien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import at.ac.fhcampuswien.Enum.Category;
import at.ac.fhcampuswien.Enum.Country;
import at.ac.fhcampuswien.Enum.Endpoint;

public class AppController {
    private List<Article> articles;


    public AppController() {
        this.articles = generateMockList();
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public int getArticleCount() throws IOException {
        if (articles == null) {
            return 0;
        } else {
            int Count1;
            int Count2;
            Count1 = getAllNewsBitcoin().size();
            Count2 = getTopHeadlinesAustria().size();
            return Count1+Count2;
        }
    }

    public List<Article> getTopHeadlinesAustria() throws IOException {

        NewsApi.query = "Corona";
        NewsApi.endpoint = Endpoint.topHeadlines;
        NewsResponse response = NewsApi.run();
       return response.getArticles() != null ? response.getArticles(): new ArrayList<>();

    }


    public List<Article> getAllNewsBitcoin() throws IOException {
        NewsApi.query = "bitcoin";
        NewsApi.endpoint = Endpoint.everything;
        NewsApi.country = null;
        NewsResponse response =  NewsApi.run();
        return response.getArticles() != null ? response.getArticles(): new ArrayList<>();
    }


    protected static List<Article> filterList(String query, List<Article> articles) {  // Searching for query in every article
        List<Article> rem_article = new ArrayList<>();
        for (Article a : articles) {
            if (a.getTitle().toLowerCase().contains(query.toLowerCase())) {
                rem_article.add(a);
            }
        }

        return rem_article;
    }

    private List<Article> generateMockList() { // Mocklist List of random articles
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
}



