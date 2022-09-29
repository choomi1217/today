import download_inspector.DownloadDailyInspector;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DownloadDailyInspector downloadDailyInspector = new DownloadDailyInspector("D:\\development\\Job\\testFiles");
        downloadDailyInspector.run();
        downloadDailyInspector.getErrorFileList().stream().forEach(s -> System.out.println(s));
        System.out.println(downloadDailyInspector.getErrorCount());
    }

}