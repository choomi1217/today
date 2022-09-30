import daily_inspector.download_inspector.DownloadDailyInspector;
import daily_inspector.integrator_inspector.IntegratorInspecotr;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * 1. 다운로드 파일 일일점검
         * */
        DownloadDailyInspector downloadDailyInspector = new DownloadDailyInspector("D:\\development\\Job\\testFiles");
        downloadDailyInspector.run();
        System.out.println(downloadDailyInspector.getErrorCount());
        System.out.println(downloadDailyInspector.getErrorFileList());

        /**
         * 2. url 요청 일일점검
         * */
        IntegratorInspecotr integratorInspecotr = new IntegratorInspecotr();
        integratorInspecotr.run();

    }

}