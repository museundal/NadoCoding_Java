package chap_13;

import java.io.*;

public class _07_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader 파일 내용을 읽어올 때
        // BufferedWriter 파일 내용을 쓸 때

        //파일 쓰기
        //FileWriter fw = new FileWriter("goodjob.txt");
        //try-with-resources 문
        /*
        try (리소스 생성) {
               리소스 사용 , try 블록이 종료되면 리소스는 자동으로 닫힙니다. 수동으로 닫는 코드 작성 필요가 없다 .
        } catch (예외 처리) {
               예외 처리
        }
         */
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) { // append 문장을 추가할건지!
////            bw.write("1. 이제 거의 끝이 보여요");
////            bw.newLine();
////            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
////            bw.newLine();
//            bw.write("3. 조금만 더 힘내요💦");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //파일 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("A/B/goodjob.txt"))){
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }//메인
}//클래스
