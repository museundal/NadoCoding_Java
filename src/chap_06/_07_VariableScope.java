package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        //System.out.println(number); // main 영역의 number 사용불가
    }

    public static void methodB() {
         int result =1; // 지역변수
    }

    public static void main(String[] args) {

        int number = 3;  // 전역변수
        //System.out.println(result); // methodB에서 선언한 변수 사용 불가

        for (int i = 0; i <5 ; i++) {
            System.out.println(i); //i는 for문 내에서 사용 가능
        }

       // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
        }

       // System.out.println(j); 지역변수
        System.out.println(number); // main 전역에 선언된 변수라 사용가능
    }
}

