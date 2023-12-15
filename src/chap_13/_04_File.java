package chap_13;

import java.io.File;
import java.io.IOException;

public class _04_File { // 파일 생성과 정보를 얻어오는 방법
    public static void main(String[] args) {
        String fileName = "text.txt";
        File file = new File(fileName);
        try {
            file.createNewFile(); // 파일이 만들어진다. tryCatch 해도 되고 throws main에 달아도 되고~
            if(file.exists()){
                System.out.println("파일이름 : "+ file.getName());
                System.out.println("파일 절대 경로 : "+ file.getAbsolutePath());
                System.out.println("파일 크기 : "+ file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
