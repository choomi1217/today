package daily_inspector.integrator_inspector;

import daily_inspector.integrator_inspector.requestor.HttpRequestor;
import daily_inspector.integrator_inspector.requestor.HttpsRequestor;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class RequestUrlHandler {

    private URL url;
    RequestUrlMaker maker;

    public RequestUrlHandler() {
        maker = RequestUrlMaker.of();
    }

    public void urlRequest(String urlString){
        this.url = maker.getUrl(urlString);
        protocolHandler();
    }

    private void protocolHandler(){
        String protocol = url.getProtocol();

        try {
            if(protocol.equals("http")){
                HttpRequestor httpRequestor = new HttpRequestor(url);
                httpRequestor.connect();
            }
            if(protocol.equals("https")){
                HttpsRequestor httpsRequestor = new HttpsRequestor(url);
                httpsRequestor.connect();
            }
        }catch (IOException e){
            System.out.println(e);
        }catch (KeyManagementException e){
            System.out.println(e);
            System.out.println(" SSL Certificatior no key");
        }catch (NoSuchAlgorithmException e){
            System.out.println(e);
            System.out.println(" SSL Certificatior NoSuchAlgorithmException ");
        }
    }

}
