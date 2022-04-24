package at.ac.fhcampuswien;
import at.ac.fhcampuswien.Enum.*;
import okhttp3.*;
import java.io.IOException;
import com.google.gson.Gson;

public class NewsApi {

    private static final String API_KEY = "fccf5f95aebd4f5f921ce51486d46e1b";
    private static final OkHttpClient client = new OkHttpClient();
    public static final String url = "https://newsapi.org/";

    public static Category Category;
    public static Country Country;
    public static Endpoint Endpoint;
    public static Language Language;
    public static Sortby Sortby;
    public static String query;






    static NewsResponse run() throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(url).newBuilder();

        urlBuilder.addPathSegment("v2");
        urlBuilder.addPathSegment(String.valueOf(Endpoint));

        urlBuilder.addQueryParameter("q", query);
        urlBuilder.addQueryParameter("apiKey", API_KEY);
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new Gson();
            if (!response.isSuccessful()) throw new IOException("Something went wrong" + response);
            else {
                return gson.fromJson(response.body().string(), NewsResponse.class);
        }
    }



}}
