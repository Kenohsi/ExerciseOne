package at.ac.fhcampuswien;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewsAppFx extends AppController {



    public Label Labelonee;
    public ImageView Background;
    private final AppController controller = new AppController();


    public void setOutputText(String text){
        Labelonee.setText(text);
    }

    public void BitcoinNews() throws IOException {
        setOutputText(controller.getAllNewsBitcoin().getArticles().toString());
    }

    public void AllNews() throws IOException {
            setOutputText((controller.getTopHeadlinesAustria().getArticles().toString()));
    }

    public void ArticleCount() {

        int austriaCount = 0;
        int bitcoinCount = 0;

        try {
            austriaCount = controller.getTopHeadlinesAustria().getArticles().size();
            bitcoinCount = controller.getAllNewsBitcoin().getArticles().size();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        setOutputText("Number of articles: " + (austriaCount + bitcoinCount));
    }
    }

