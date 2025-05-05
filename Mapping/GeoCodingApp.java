package Mapping;

import java.io.IOException;
import java.util.Scanner;

public class GeoCodingApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a place name: ");
		String place = scanner.nextLine().trim();

		GeoCodingService service = new GeoCodingService();

		try {
			String response = service.fetchGeoData(place);
			GeoLocation location = GeoLocationParser.parse(response);
			System.out.println("Coordinates found:");
			System.out.println(location);
		} catch (IOException e) {
			System.out.println("Failed to fetch data: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Could not parse location: " + e.getMessage());
		}
	}
}
