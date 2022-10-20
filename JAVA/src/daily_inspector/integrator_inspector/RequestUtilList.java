package daily_inspector.integrator_inspector;

import daily_inspector.DailyDateUtil;
import java.util.ArrayList;
import java.util.List;


/**
 * 요청 보내야 하는 url들을 List<String> 으로 관리하는 클래스입니다.
 * List<URL>로 관리하는 것도 나쁘지 않다고 생각하나 우선 보류중입니다
 * */
public class RequestUtilList {

    private final static String useSSLUrl = "localhost:8080/first.do?first=1&second=2&date=";
    private final static String noUseSSLUrl = "localhost:8080/second.do?first=1&second=2&date=";
    private final static String adminUrl = "localhost:8080/third.do?first=1&second=2&date=";
    private final static String citizenUrl = "localhost:8080/forth.do?first=1&second=2&date=";

    private List<String> requestUrls;

    public RequestUtilList() {
        this.requestUrls  = new ArrayList<String>();
        requestUrls.add(useSSLUrl + DailyDateUtil.currentDate());
        requestUrls.add(noUseSSLUrl + DailyDateUtil.currentDate());
        requestUrls.add(adminUrl + DailyDateUtil.currentDate());
        requestUrls.add(citizenUrl + DailyDateUtil.currentDate());
    }

    public List<String> getRequestUrls(){
        return requestUrls;
    }

}
