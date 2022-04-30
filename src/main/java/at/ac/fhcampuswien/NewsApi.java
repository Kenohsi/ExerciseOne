package at.ac.fhcampuswien;
import okhttp3.*;
import java.io.IOException;
import com.google.gson.Gson;

public class NewsApi {


    private static final String API_KEY = "fccf5f95aebd4f5f921ce51486d46e1b";
    private static final OkHttpClient client = new OkHttpClient();
    private static String APIUrl = "https://newsapi.org/v2/";



    public String getAPIURL(){
        return APIUrl;
    }

    public void setAPIUrl(String APIUrl) {
        NewsApi.APIUrl = APIUrl;
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

    public String run(String urlString) throws IOException {

        Request request = new Request.Builder()
                .url(urlString)
                .build();

        try (Response response = client.newCall(request).execute()) {

                return response.body().string();
            }
        }
    public NewsResponse getResponseArticles(String Json) {
        return new Gson().fromJson(Json, NewsResponse.class);


    }


}
