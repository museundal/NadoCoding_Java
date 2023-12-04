package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외 처리
        //오류 : 컴파일 오류(실행조차 안된다.) , 런타임 오류

        //int i = "문자" -> 컴파일 오류
        // int [] num = new int[3];
        //num[5] = 3;   Index 5 out of bounds for length 3 , 런타임오류

        // 런타임 오류 : 에러 error 코드로 수습 안된다 , 예외 exception 수습 가능 (파일 경로 잘못, 배열 인덱스 초과, )
       // S s = new S();
       // s.methodA(); StackOverflowError

       // S s = null;
       // s.methodA(); //  NullPointerException 예외 !!
       // System.out.println("프로그램 정상 종료"); // 출력이 안됌

        //try - catch 구문  시도하려는 코드 - 예외 처리 하려는 코드
        try {
           // System.out.println(3/0); // 모든 정수는 0으로 나눌 수 가 없다.
//            int[] arr = new int[3];
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((int)obj);
        }catch (Exception e){
            System.out.println("이런 문제가 발생했어요 " + e.getMessage()); // / byzero 0으로 나누려는 시도를 했다. ,String은 intger로 변할 수 없다.
            e.printStackTrace(); // 빨간글씨가 나오는 부분
        }
        System.out.println("프로그램 정상 종료"); // 정상적으로 출력도 완료


    }
}

class S{
    public void methodA(){
        this.methodA(); // 스택 오버 플로우 에러 , 끊임 없이 자기를 호출
    }
}
