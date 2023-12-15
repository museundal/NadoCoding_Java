package chap_13;

import java.io.File;

public class _06_FileAndFolder {
    public static void main(String[] args) {
        String folder = "."; //현재위치경로 , 현재 디렉토리를 나타내는 상대 경로
        String absolutePath = "C:\\Users\\lsware\\Desktop\\NadoCoding\\src\\chap_13"; // 절대경로
        String path = "src/chap_13"; // 상대 경로
        File filesAndFolders = new File(path);
        System.out.println("현재 폴더 경로 : "+ filesAndFolders.getAbsolutePath());
        for(File file : filesAndFolders.listFiles()){
            if(file.isFile()){
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
            System.out.println(file.getName());
        }
    }
}
