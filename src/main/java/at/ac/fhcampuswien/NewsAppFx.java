package at.ac.fhcampuswien;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class NewsAppFx extends AppController {


    public Label Labelonee;
    public ImageView Background;


    public void BitcoinNews() {
        Labelonee.setText(getAllNewsBitcoin().toString());
    }

    public void AllNews() {
        Labelonee.setText(getTopHeadlinesAustria().toString());
    }

    public void ArticleCount() {
        Labelonee.setText("At the time we count " + getArticleCount() + " articles" + "!");
    }

}

