package daily_inspector.integrator_inspector;

import daily_inspector.DailyDateUtil;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlMaker {

    private String inputUrl;

    public UrlMaker(String inputUrl) {
        this.inputUrl = inputUrl;
    }

    public URL getUrl() throws MalformedURLException {
        return new URL(inputUrl + DailyDateUtil.dateNow());
    }
}
