package Mapping;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeoCodingService {

    private static final String API_KEY = "AIzaSyDmtepQybvZCSX1GHBISAj4RG5KeDMgDH8";

    public String fetchGeoData(String placeName) throws IOException {
        String encodedPlace = URLEncoder.encode(placeName, StandardCharsets.UTF_8);
        String url = String.format(
                "https://maps.googleapis.com/maps/api/geocode/json?address=%s&key=%s",
                encodedPlace, API_KEY
        );

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            return EntityUtils.toString(httpClient.execute(request).getEntity());
        }
    }
}
