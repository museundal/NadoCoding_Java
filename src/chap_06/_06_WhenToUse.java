package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number , int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드가 필요한 이유
        //비슷한 연산인데 코드 중복이 많다.똑같은 동작을 반복
        //동작을 메소드로 정의하면 , 코드 유지보수 할 때에 굉장히 용이합니다.

        //2의 2승 구하기
        System.out.println(getPower(2,2));

        //3의 3승 구하기
       int  result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        //4의 2승 구하기

        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);

    }
}

