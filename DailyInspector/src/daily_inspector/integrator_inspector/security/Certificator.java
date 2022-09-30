package daily_inspector.integrator_inspector.security;

import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class Certificator {

    public static void trustAll() throws NoSuchAlgorithmException, KeyManagementException {
        //TrustManager를 아무일도 하지 않는 객체로 재정의 하므로써 SSL을 우회합니다.
        //TrustManager가 먼데?
        //SSLContext가 먼데?
        TrustManager[] trustManagers = new TrustManager[]{
            new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType)
                    throws CertificateException {

                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType)
                    throws CertificateException {

                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }
        };

        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustManagers, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

    }
}
