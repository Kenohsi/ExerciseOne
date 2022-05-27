package at.ac.fhcampuswien;

public class NewsApiException extends Exception {

    public NewsApiException(){
        super("NewsApi Schiefgelaufen!");
    }
}
