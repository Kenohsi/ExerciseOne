package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;




public class NewsAppFx extends AppController {

    private List<Article> articles;
    public Label Labelonee;
    public Button searchButton;
    public TextArea filter;
    //public String query = filter.getText();



    public void BitcoinNews(ActionEvent actionEvent) {
        Labelonee.setText( getAllNewsBitcoin().toString() );

    }

    public void AllNews(ActionEvent actionEvent) {
        Labelonee.setText( getTopHeadlinesAustria().toString() );

    }

    public void ArticleCount(ActionEvent actionEvent) {
        Labelonee.setText( "At the time we count " + getArticleCount() + " articles" + "!" );

    }

    public static List<Article> generateMockList() {
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

   public void searchAction(ActionEvent actionEvent) {


       query=filter.getText();

       this.articles= generateMockList();
       Labelonee.setText(filterList(filter.getText(),generateMockList()).toString()  );

   }
}

