package integrator_inspector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.stream.Collectors;

public class HttpRequestor {

    private final UrlMaker urlMaker;

    public HttpRequestor(String urls) {
        this.urlMaker = new UrlMaker(urls);
    }

    public void httpConnect(){

        URL url = UrlMaker.getUrl();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(10000);
        connection.setDoOutput(true);

        int responseCode = connection.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK){
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream(), "euc-kr");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String result;
            while ((result = bufferedReader.readLine()) != null){
                if(result.contains("error")){
                    System.out.println(" ERROR EXIST : " + url.getPath());
                }
            }else{
                System.out.println(" Response error with error code : " + responseCode);
            }
    }

    public void httpsConnect() {
    /*
    *
    * */
        URL url = UrlMaker.getUrl();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(10000);
        connection.setDoOutput(true);

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStreamReader inputStreamReader = new InputStreamReader(
                connection.getInputStream(), "euc-kr");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String result;
            while ((result = bufferedReader.readLine()) != null) {
                if (result.contains("error")) {
                    System.out.println(" ERROR EXIST : " + url.getPath());
                }
            }else{
                System.out.println(" Response error with error code : " + responseCode);
            }

        }
    }
}
