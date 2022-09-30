package daily_inspector.integrator_inspector.requestor;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequestor implements Requestor {

    private final URL url;

    public HttpRequestor(URL url) {
        this.url = url;
    }

    public void connect() throws IOException {

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(10000);
        connection.setDoOutput(true);

        int responseCode = connection.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) {
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream(), "euc-kr");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String result;
            while ((result = bufferedReader.readLine()) != null) {
                if (result.contains("error")) {
                    System.out.println(" ERROR EXIST : " + url.getPath());
                } else {
                    System.out.println(" Response error with error code : " + responseCode);
                }
            }
        }
    }
}
