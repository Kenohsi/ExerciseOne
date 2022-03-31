package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class NewsAppFx extends AppController {


   public Label Labelonee;
   private AppController controller = new AppController();
   private List<Article> articles = new ArrayList<Article>();

   @FXML
   private Button Headlines = new Button();

   @FXML
   private Button Bitcoin = new Button();

   @FXML
   private Button ArticleCount = new Button();

   @FXML
   private Button Quit = new Button();

   @FXML
   private ImageView BreakingPicture;

   @FXML
   private ImageView TitlePicture;

   @FXML
   private ImageView NewsPicture;

   @FXML
   private ImageView ArticlesPics;

   @FXML
   private ImageView BitcoinPicture;

   @FXML
   private TextArea Text;

 //  public void BitcoinNews(AppController controller) {
//
 //        Text.setText("asdfsdf");
 //  }

   public void BitcoinNews(ActionEvent actionEvent) {
     Labelonee.setText(getAllNewsBitcoin().toString());

   }
   public void AllNews(ActionEvent actionEvent) {
      Labelonee.setText(getTopHeadlinesAustria().toString());

   }
   public void ArticleCount(ActionEvent actionEvent) {
      Labelonee.setText("At the time we count 3 articles");

   }


   // public void getArticleCount(MouseEvent event){
//
  //    Text.setText(controller.getAllNewsBitcoin().toString());
  // }
//
      }
//

