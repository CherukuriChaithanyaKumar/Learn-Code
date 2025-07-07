package com.example.NewsaggregationsystemClient.Service;

import com.example.NewsaggregationsystemClient.DTO.LoginRequest;
import com.example.NewsaggregationsystemClient.DTO.SignupRequest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

public class ClientApp {

    private static final RestTemplate rest = new RestTemplate();
    private static final String BASE_URL = "http://localhost:8080/api";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("==== NEWS AGGREGATOR MENU ====");
            System.out.println("1) Sign-Up");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    signUp(scanner);
                    break;
                case "2":
                    login(scanner);
                    break;
                case "3":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void signUp(Scanner scanner) {
        System.out.print("Username : ");
        String username = scanner.nextLine();
        System.out.print("Email    : ");
        String email = scanner.nextLine();
        System.out.print("Password : ");
        String password = scanner.nextLine();

        SignupRequest signup = new SignupRequest(username, email, password, "USER");

        try {
            String response = rest.postForObject(BASE_URL + "/auth/signup", signup, String.class);
            System.out.println("Server: " + response);
        } catch (Exception e) {
            System.out.println("Sign-up failed: " + e.getMessage());
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Username : ");
        String username = scanner.nextLine();
        System.out.print("Password : ");
        String password = scanner.nextLine();

        LoginRequest login = new LoginRequest(username, password);

        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<LoginRequest> request = new HttpEntity<>(login, headers);
            ResponseEntity<String> response = rest.exchange(BASE_URL + "/auth/login", HttpMethod.POST, request, String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                System.out.println("Login successful. Welcome, " + username + "!");
            } else {
                System.out.println("Login failed. Please check your credentials.");
            }
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
