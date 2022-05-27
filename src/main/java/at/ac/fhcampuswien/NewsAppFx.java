package at.ac.fhcampuswien;


import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class NewsAppFx extends AppController {

    public Label Labelonee;
    public ImageView Background;
    private final AppController controller = new AppController();
    private List <Article> articles = new ArrayList<>();

    public void BitcoinNews()  {
        try {
            articles = controller.getAllNewsBitcoin();
            StringJoiner joiner = new StringJoiner("\n\n");
            for (Article article: articles) {
                joiner.add(article.toString());
            }
            Labelonee.setText(joiner.toString());
        }catch(UnknownHostException e){
            Labelonee.setText("Please check your internet Connection.");
        }catch(NewsApiException e){
            Labelonee.setText(e.getMessage());
        }catch (NullPointerException e){
            Labelonee.setText("NullPointerException Error");
        }catch (IOException e){
            Labelonee.setText("IO Exception Error");
        }

    }
    public void AllNews()  {
        try {
            articles = controller.getTopHeadlinesAustria();
            StringJoiner joiner = new StringJoiner("\n\n");
            for (Article article : articles) {
                joiner.add(article.toString());
            }
            Labelonee.setText(joiner.toString());
        } catch (UnknownHostException e) {
            Labelonee.setText("Please check your internet Connection.");
        } catch (NewsApiException e) {
            Labelonee.setText(e.getMessage());
        } catch (NullPointerException e) {
            Labelonee.setText("NullPointerException Error");
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        }
    }
    public void ArticleCount()  {
        try{
        Labelonee.setText("We have " + ( getArticleCount() ) + " articles available.");
    }catch(UnknownHostException e){
            Labelonee.setText("Please check your internet Connection.");
        }catch(NewsApiException e){
            Labelonee.setText(e.getMessage());
        }catch (NullPointerException e){
            Labelonee.setText("NullPointerException Error");
        }catch (IOException e){
            Labelonee.setText("IO Exception Error");
        }
    }}

