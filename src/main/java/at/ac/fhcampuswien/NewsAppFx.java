package at.ac.fhcampuswien;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class NewsAppFx extends AppController {


    public Label Labelonee;
    public Button searchButton;
    public TextArea filter;

    public void BitcoinNews() {
        Labelonee.setText(getAllNewsBitcoin().toString());
    }

    public void AllNews() {
        Labelonee.setText(getTopHeadlinesAustria().toString());
    }

    public void ArticleCount() {
        Labelonee.setText("At the time we count " + getArticleCount() + " articles" + "!");
    }

    public void searchAction() {

        query = filter.getText();
        Labelonee.setText(filterList(filter.getText(), generateMockList()).toString());
    }
}

