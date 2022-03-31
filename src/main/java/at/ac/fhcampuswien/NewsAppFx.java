package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;


import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;


public class NewsAppFx extends AppController {


   public Label Labelonee;
   private AppController controller = new AppController() {
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
   };
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

   public void BitcoinNews(ActionEvent actionEvent) {
     Labelonee.setText(getAllNewsBitcoin().toString());

   }
   public void AllNews(ActionEvent actionEvent) {
      Labelonee.setText(getTopHeadlinesAustria().toString());

   }
   public void ArticleCount(ActionEvent actionEvent) {
      Labelonee.setText("At the time we count "+getArticleCount()+" articles"+"!");

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

