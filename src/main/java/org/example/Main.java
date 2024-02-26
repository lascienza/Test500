package Test500;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        String urlString = "https://www.dellin.ru/amp/directions/gruzoperevozki-iz/aleksandrov/";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            System.out.println("Response code is 200. Connection is successful.");
        } else {
            System.out.println("Response code is " + responseCode + ". Connection failed.");
        }
    }
}