package Mapping;

import org.json.JSONObject;

public class GeoLocationParser {
	public static GeoLocation parse(String jsonResponse) throws IllegalArgumentException {
		JSONObject json = new JSONObject(jsonResponse);

		if (json.getJSONArray("results").isEmpty()) {
			throw new IllegalArgumentException("No results found for the place.");
		}

		JSONObject location = json.getJSONArray("results").getJSONObject(0).getJSONObject("geometry")
				.getJSONObject("location");

		double latitude = location.getDouble("lat");
		double longitude = location.getDouble("lng");

		return new GeoLocation(latitude, longitude);
	}
}
