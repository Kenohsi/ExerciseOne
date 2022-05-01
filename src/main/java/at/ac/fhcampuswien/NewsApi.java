package at.ac.fhcampuswien;
import okhttp3.*;
import java.io.IOException;
import com.google.gson.Gson;
import at.ac.fhcampuswien.Enum.*;
public class NewsApi {


    private static final String API_KEY = "fccf5f95aebd4f5f921ce51486d46e1b";
    private static final OkHttpClient client = new OkHttpClient();
    private static final String APIUrl = "https://newsapi.org/";
    public static Category category;
    public static  Endpoint endpoint;
    public static Country country;
    public static Sortby sortby;
    public static String query;
    public static Language language;

    public static NewsResponse run() throws IOException {

        HttpUrl.Builder builder = HttpUrl.parse(APIUrl).newBuilder();
        builder.addPathSegment("v2");
        builder.addPathSegment((endpoint.getEndpoints()));

        builder.addQueryParameter("q", query);
        builder.addQueryParameter("apiKey", API_KEY);

        if (sortby != null) {
            builder.addQueryParameter("sortBy", sortby.toString());
        }
        if (country != null) {
            builder.addQueryParameter("country", country.toString());
        }
        if (category != null) {
            builder.addQueryParameter("category", category.toString());
        }
        if (language != null) {
            builder.addQueryParameter("language", language.toString());
        }
        Request request = new Request.Builder()
                .url(builder.build().toString())
                .build();

        try (Response response = client.newCall(request).execute()) {

            Gson gson = new Gson();

            if (!response.isSuccessful()) throw new IOException("Something went wrong" + response);
            else {
                return gson.fromJson(response.body().string(), NewsResponse.class);

            }
    }}}




     /*
    public NewsResponse getResponseArticles(String Json) {
        return new Gson().fromJson(Json, NewsResponse.class);


    }
    }

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


    }


}

      */
