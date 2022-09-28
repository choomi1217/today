import DownladFileInspector.DownloadFileInspector;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DownloadFileInspector downloadFileInspector = new DownloadFileInspector("D:\\development\\Job\\testFiles");
        downloadFileInspector.run();
        downloadFileInspector.getErrorFileList().stream().forEach(s -> System.out.println(s));
        System.out.println(downloadFileInspector.getErrorCount());
    }

}