package at.ac.fhcampuswien;


import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class NewsAppFx extends AppController {

    public Label Labelonee;
    public ImageView Background;
    private final AppController controller = new AppController();
    private List<Article> articles = new ArrayList<>();
    private NewsResponse response;

    public void BitcoinNews() {
        try {
            articles = controller.getAllNewsBitcoin();
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
        } catch (Exception e) {
            Labelonee.setText("Exception error");

        }
    }

    public void AllNews() {
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
        } catch (Exception e) {
            Labelonee.setText("Exception error");

        }
    }

    public void ArticleCount() {
        try {
            Labelonee.setText("We have " + (getArticleCount()) + " articles available.");
        } catch (UnknownHostException e) {
            Labelonee.setText("Please check your internet Connection.");
        } catch (NewsApiException e) {
            Labelonee.setText("Unexpected Error");
        } catch (NullPointerException e) {
            Labelonee.setText("Please check your input for Query and Endpoints");
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        } catch (Exception e) {
            Labelonee.setText("Exception error");
        }
    }
      //Source:-https://stackoverflow.com/questions/35486826/transform-and-filter-a-java-map-with-streams
    public void mostArticles() {
        try {
            List<String> List = new ArrayList<String>();
            for (int i = 0; i < getArticles().size(); i++) {
                List.add(getArticles().get(i).getSource().getName());
            }
            String mostArticles = List.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey).orElse(null);
            Labelonee.setText("Most Source Provider : " + mostArticles);
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        } catch (NullPointerException e) {
            Labelonee.setText("Please Click on Get Top Headlines or Bitcoin before you click on this button");
        }catch (Exception e){
            Labelonee.setText("Exception Error");
        }
    }

    public void LongestAuthorName() {
        try {
            Stream<Article> List = getArticles().stream();
            String Author = List.map(Article::getAuthor).filter(Objects::nonNull)
                    .max(Comparator.comparingInt(String::length)).orElseThrow();
            Labelonee.setText("Longest Author Name : " + Author);
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        } catch (NullPointerException e) {
            Labelonee.setText("Please Click on Get Top Headlines or Bitcoin before you click on this button");
        }catch (Exception e){
            Labelonee.setText("Exception Error");
        }
    }

    public void NewYorkTimesfilter() {
        try {
            Stream<Article> List = getArticles().stream();
            long count = List
                    .filter(article -> article.getSource().getName().equals("New York Times"))
                    .count();
            Labelonee.setText("We have this " + count + " many New York Times articles");
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        } catch (NullPointerException e) {
            Labelonee.setText("Please Click on Get Top Headlines or Bitcoin before you click on this button");
        }catch (Exception e){
            Labelonee.setText("Exception Error");
        }
    }
    //Source: - https://www.baeldung.com/java-8-streams
    public void LessthanfifteenChars() {
        try {
            List<Article> allarticles = AppController.getArticles();
            try (Stream<Article> streamFromList = allarticles.stream()) {
                List<Article> articles = streamFromList
                        .map(Article::getTitle)
                        .filter(Objects::nonNull)
                        .filter(o -> o.length() < 100).map(o -> allarticles.stream().filter(
                                a -> a.getTitle().equals(o)
                        ).findFirst().orElseThrow()).collect(Collectors.toList());
            }
            Labelonee.setText(String.valueOf(allarticles));
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        } catch (NullPointerException e) {
            Labelonee.setText("Please Click on Get Top Headlines or Bitcoin before you click on this button");
        }catch (Exception e){
            Labelonee.setText("Exception Error");
        }
    }
    // Source: - https://howtodoinjava.com/java8/stream-sorting/
        public void sorted()  {
        try {
            List<Article> allarticles1 = AppController.getArticles();
            Stream<Article> streamFromList = allarticles1.stream();
            List<Article> articles = streamFromList
                    .sorted((Comparator.comparing(Article::getDescription)))
                    .collect(Collectors.toList());
            articles.forEach((System.out::println));
            //Das funktioniert in Console
        } catch (IOException e) {
            Labelonee.setText("IO Exception Error");
        } catch (NullPointerException e) {
            Labelonee.setText("Please Click on Get Top Headlines or Bitcoin before you click on this button");
        } catch (Exception e){
            Labelonee.setText("Exception Error");
        }
        }
}

