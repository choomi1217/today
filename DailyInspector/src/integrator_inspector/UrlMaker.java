package integrator_inspector;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlMaker {

    private String inputUrl;

    public UrlMaker(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public URL getUrl() {
        URL url = null;
        try {
            url = new URL(inputUrl + DailyDateUtil.dateNow());
        }catch (MalformedURLException e){
            System.out.println(e);
            System.out.println(" URL MAKING ERROR ");
        }
    }
}
