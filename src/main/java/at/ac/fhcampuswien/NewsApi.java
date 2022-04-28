package at.ac.fhcampuswien;
import okhttp3.*;
import java.io.IOException;
import com.google.gson.Gson;

public class NewsApi {

    //brate

    private static final String API_KEY = "fccf5f95aebd4f5f921ce51486d46e1b";
    private static final OkHttpClient client = new OkHttpClient();
    private static String APIUrl = "";




    public void setAPIUrl(String APIUrl) {
        this.APIUrl = "https://newsapi.org/v2/";
    }

    public void urlBuilder(String endpoint, String query, String country, String sortBy, String category) {
        String build = APIUrl+endpoint+"?q="+query+"&country="+country+"&sortBy="+sortBy+"&category"+category+"&apiKey="+API_KEY;
        setAPIUrl(build);
    }

    public void urlBuilder(String endpoint, String query, String country, String sortBy) {
        String build = APIUrl+endpoint+"?q="+query+"&country="+country+"&sortBy="+sortBy+"&apiKey="+API_KEY;
        setAPIUrl(build);
    }

    public void urlBuilder(String endpoint, String query, String country) {
        String build = APIUrl+endpoint+"?q="+query+"&country="+country+"&apiKey="+API_KEY;
        setAPIUrl(build);
    }

    public void urlBuilder(String endpoint, String query) {
        String build = APIUrl+endpoint+"?q="+query+"&apiKey="+API_KEY;
        setAPIUrl(build);
    }

    public NewsResponse run(String urlString) throws IOException {

        Request request = new Request.Builder()
                .url(urlString)
                .build();

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new Gson();
            if (!response.isSuccessful()) throw new IOException("Unexpected Error" + response);
            else {
                return gson.fromJson(String.valueOf(response.body()), NewsResponse.class);
            }
        }


    }
}
