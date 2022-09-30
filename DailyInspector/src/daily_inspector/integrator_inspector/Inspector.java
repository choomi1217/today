package daily_inspector.integrator_inspector;

import java.io.IOException;

public class Inspector {
    private final String useSSLUrl = "localhost:8080/first.do?first=1&second=2&date=";
    private final String noUseSSLUrl = "localhost:8080/second.do?first=1&second=2&date=";
    private final String adminUrl = "localhost:8080/third.do?first=1&second=2&date=";
    private final String citizenUrl = "localhost:8080/forth.do?first=1&second=2&date=";

    public void run() throws IOException {
        HttpRequestor useSSLInspector = new HttpRequestor(useSSLUrl);
        HttpRequestor noUseInspector = new HttpRequestor(noUseSSLUrl);
        HttpRequestor adminInspector = new HttpRequestor(adminUrl);
        HttpRequestor citizenInspector = new HttpRequestor(citizenUrl);

        useSSLInspector.httpConnect();
        noUseInspector.httpConnect();
        adminInspector.httpConnect();
        citizenInspector.httpConnect();

    }

}
