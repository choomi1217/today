package daily_inspector.integrator_inspector;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 문자열을 입력받아 URL로 만들어주며 도중에 생기는 에러 핸들링?하려는 클래스입니다.
 * Static Inner Class holder(of)를 사용해서 구현 했습니다.
 * 왜 이름이 of일까?
 * */
public class RequestUrlMaker {

    private RequestUrlMaker(){}

    private static class RequestUrlMakerHolder{
        private static final RequestUrlMaker INSTANCE = new RequestUrlMaker();
    }

    public static RequestUrlMaker of(){
        return RequestUrlMakerHolder.INSTANCE;
    }

    public URL getUrl(String urlString) {
        URL url = null;
        try {
            url = new URL(urlString);
        }catch (MalformedURLException e){
            System.out.println(e);
            System.out.println("URL MAKING ERROR");
        }
        return url;
    }
}
