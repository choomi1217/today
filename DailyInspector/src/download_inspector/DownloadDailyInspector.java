package download_inspector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DownloadDailyInspector {

    private final String file_dir;
    private int errorCount;
    private ArrayList<String> errorFileList;

    public DownloadDailyInspector(String file_dir) {
        this.file_dir = file_dir;
        this.errorCount = 0;
        this.errorFileList = new ArrayList<String>();
    }

    public void run() throws IOException {
        readFiles(file_dir);
    }

    private void readFiles(String path) throws IOException {
        File file = new File(path);
        File[] files = file.listFiles();

        for (File oneFile : files){
            if(oneFile.isDirectory()){
                readFiles(oneFile.getPath());
            }
            if(oneFile.isFile()){
                isError(oneFile);
            }
        }
    }

    private void isError(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "euc-kr");
        BufferedReader br = new BufferedReader(inputStreamReader);

        String tmp;

        while ((tmp = br.readLine()) != null){
            if(tmp.contains("NoData")){
                this.errorCount++;
                this.errorFileList.add(file.getPath());
            }
        }
    }

    public int getErrorCount(){
        return this.errorCount;
    }

    public ArrayList<String> getErrorFileList(){
        return errorFileList;
    }

}
