package at.ac.fhcampuswien;
import io.github.cdimascio.dotenv.Dotenv;
import okhttp3.*;
import java.io.IOException;
import java.util.Objects;

import com.google.gson.Gson;
import at.ac.fhcampuswien.Enum.*;
public class NewsApi {


    private static final String API_KEY = Dotenv.load().get("API_TOKEN");
    private static final OkHttpClient client = new OkHttpClient();
    private static final String APIUrl = "https://newsapi.org/";
    public static Category category;
    public static  Endpoint endpoint;
    public static Country country;
    public static Sortby sortby;
    public static String query;
    public static Language language;

    public static NewsResponse run() throws IOException {

        HttpUrl.Builder builder = Objects.requireNonNull(HttpUrl.parse(APIUrl)).newBuilder();
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
          //System.out.println(builder.build());
        Request request = new Request.Builder()
                .url(builder.build().toString())
                .build();

        try (Response response = client.newCall(request).execute()) {
            Gson gson = new Gson();
            if (!response.isSuccessful()) throw new IOException("Unexpected Error" + response);
            else {
                return gson.fromJson(Objects.requireNonNull(response.body()).string(), NewsResponse.class);
            }
    }}}

        //Error Messages that we could implement -HTTP status codes summary
         //200 — OK. The request was executed successfully.
         //400 — Bad Request. The request was unacceptable, often due to a missing or misconfigured parameter.
         //401 — Unauthorized. Your API key was missing from the request, or wasn’t correct.
         //429 — Too Many Requests. You made too many requests within a window of time and have been rate limited. Back off for a while.
         //500 — Server Error. Something went wrong on our side.


