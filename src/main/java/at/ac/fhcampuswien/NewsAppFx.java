package at.ac.fhcampuswien;

import at.ac.fhcampuswien.Enum.Endpoint;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class NewsAppFx extends AppController {



    public Label Labelonee;
    public ImageView Background;
    private final AppController controller = new AppController();
    private List <Article> articles = new ArrayList<Article>();

    public void BitcoinNews() throws IOException {
        StringJoiner joiner = new StringJoiner("\n\n");

        articles = controller.getAllNewsBitcoin();
        for (Article article: articles) {
            joiner.add(article.toString());
        }
        Labelonee.setText(joiner.toString());

    }

    public void AllNews() throws IOException {
        StringJoiner joiner = new StringJoiner("\n\n");
        articles = controller.getTopHeadlinesAustria();
        for (Article article: articles) {
            joiner.add(article.toString());
        }
        Labelonee.setText(joiner.toString());

    }

    public void ArticleCount() throws IOException {

        Labelonee.setText("We have " + ( getArticleCount() ) + " articles available.");
    }
    }

