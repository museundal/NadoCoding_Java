package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;

    }

//    public static double getPower(int number) {
//        return 0.0;
//
//    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩 , 이름이 같은 메소드를 여러개 만드는 것
        //전달값의 타입이 다르거나, 전달값의 갯수가 다르거나
        //반환형이 다르다고 메소드 오버로딩 되진 않는다! int,double 같은 이름이면 에러 납니다.
        System.out.println(getPower(4));
        System.out.println(getPower("4"));
        System.out.println(getPower(4, 2));
    }
}

