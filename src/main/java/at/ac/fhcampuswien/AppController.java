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

    public int getArticleCount() {
        if (articles == null) {
            return 0;
        } else {
            return articles.size();
        }
    }

    public NewsResponse getTopHeadlinesAustria() throws IOException {
        NewsApi newsApi = new NewsApi();
        newsApi.urlBuilder(Endpoint.TOP_HEADLINES.Endpoints, "", Country.AUSTRIA.Countries);
        String Json = newsApi.run(newsApi.getAPIURL());
        newsApi.getResponseArticles(Json);
        return newsApi.getResponseArticles(Json);
    }


    public NewsResponse getAllNewsBitcoin() throws IOException {

        NewsApi newsApi = new NewsApi();
        newsApi.urlBuilder(Endpoint.EVERYTHING.Endpoints, "bitcoin");
        String Json = newsApi.run(newsApi.getAPIURL());
        newsApi.getResponseArticles(Json);
        return newsApi.getResponseArticles(Json);
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



