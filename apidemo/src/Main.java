import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://api.chucknorris.io/jokes/random";
        HttpRequest req = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient hclint = HttpClient.newBuilder().build();
        HttpResponse<String> hresponse = hclint.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println("status code = "+hresponse.statusCode());
        System.out.println(hresponse.body());
    }
}