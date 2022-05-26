package at.ac.fhcampuswien;

public class NewsApiException extends Exception {

    public NewsApiException(String message){
        super("NewsApi Schiefgelaufen!");
        System.out.println(message);
    }
}
