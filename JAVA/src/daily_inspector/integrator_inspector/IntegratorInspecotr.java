package daily_inspector.integrator_inspector;

public class IntegratorInspecotr {

    public void run(){

        RequestUtilList urlList = new RequestUtilList();
        RequestUrlHandler requestUrlHandler = new RequestUrlHandler();

        for(String urlString : urlList.getRequestUrls()){
            requestUrlHandler.urlRequest(urlString);
        }

    }

}
