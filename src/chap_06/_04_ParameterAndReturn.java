package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;

    }

    public static int powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = powerByExp(5,5);
        System.out.println(retVal);
    }
}
