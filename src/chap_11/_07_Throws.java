package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args)    {
        //2. 메인 메소드에서 해결하는 방법
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요");
        }

    }//main
    public static void writeFile() throws IOException {// 메소드 , 여기서 발생하는 문제를 정의 해줌
        //1. 자체적으로 해결하는 방법
//        try {  // 자체적으로 해결
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일쓰기에 실패했어요");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("write파일 메소드 내에서 자체 해결했어요");
//        }

        FileWriter writer = new FileWriter("test.txt"); // FileWriter라는게 있음! 이 방법은 내부에서 자체처리하는게 아니라 메인메소드에서 해결하는 것
           throw new IOException("파일쓰기에 실패했어요"); //
    }
}
