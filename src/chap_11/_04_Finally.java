package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        // catch 했다고 해서 완전히 끝난게 아닙니다.
        // 문제가 발생여부 떠나서 무조건 수행되어야 하는 finally
        //try 구문을 정리하는 느낌의 코드를 넣는다.
        // 보통 여는 작업을 하면 finally에서 닫음 , 또는 임시파일 생성 뒤 삭제
        // try -catch , try -catch(s)- finally , try - finally
        try {
            System.out.println("택시의 문을 연다.");
           // throw new Exception("휴무 택시"); // 예외가 발생해도
            System.out.println("택시에 탑승한다."); // 예외가 발생하지 않아도 finally 실행
        }catch (Exception e){
            System.out.println("!! 문제발생 : " + e.getMessage()); // message 에 휴무택시가 담아짐
        }finally {
            System.out.println("택시의 문을 닫는다.");
        }

        System.out.println("---------------");
        try {
            System.out.println(3/0);
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
