package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스 - 다양한 타입의 객체를 지원하는 클래스,인터페이스,메소드를 정의하는 방법
        //딱 한번만 정의하면 여러타입을 지원 어렵쥬? 실습 고고

        //기본형
        int[] iArray = {1, 2, 3, 4, 5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        // wrapper
        Integer[] iiArray = {1, 2, 3, 4, 5};
        Double[] ddArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        //자료형만 다르지 똑같은 코드가 반복중
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("====제네릭====");
        //printAnyArray(iArray); 제네릭스에서 지원하는건 객체 , 기본 자료형은 바로 쓸 수 가 없다.wrapper 클래스라고 감싸줘야합니다.
        //printAnyArray(dArray);

        //서로 다른 타입임에도 불필요한 코드 중복을 줄이게 해주는 제네릭스 !
        printAnyArray(iiArray);
        printAnyArray(ddArray);
        printAnyArray(sArray);

    }//메인

    //T : type, K : key , V : value , E : element
    private static <T> void printAnyArray(T[] array) { // T는 type 을 의미합니다. T는 쌍을 이뤄야합니다.
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + "  ");
        }
        System.out.println();
    }


    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
