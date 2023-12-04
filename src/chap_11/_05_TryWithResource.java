package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResource {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                writer1.close(); // 예외처리가 또 필요하다고 경고문이 뜸 , try catch는 중첩되도 됩니다.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }//try
        // 항상  close() 를 신경써야 된다는게 번거로울 수 있습니다.
        //소괄호 안에서 객체 생성 해보기 , close() 메소드를 자동으로 어디선가 호출 해준게 보임
        // try 구문 내에서 사용할 Resource 를 괄호 속에서 정의하면 자동으로 close()를 호출한다.
        // 객체는 근데  AutoCloseable 인터페이스를 구현해야 자동으로 close()가 됩니다.



        System.out.println("-----------------------------------");

        try ( MyFileWriter writer2 = new MyFileWriter() ){
          writer2.write("빵이 먹고 싶어요");
        }catch (Exception e) {
            e.printStackTrace();
        }

       // BufferedWriter bw = null;  -> 이 친구도 타고타고 보면 AutoCloseable를 구현하는 클래스다.

    }//메인
}//클래스

class MyFileWriter implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line){
        System.out.println("파일의 내용을 입력합니다 ");
        System.out.println("입력내용 :  " + line);
    }
}
