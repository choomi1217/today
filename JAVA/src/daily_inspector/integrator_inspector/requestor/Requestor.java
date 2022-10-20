package daily_inspector.integrator_inspector.requestor;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public interface Requestor {
    public void connect() throws IOException, NoSuchAlgorithmException, KeyManagementException;
}
