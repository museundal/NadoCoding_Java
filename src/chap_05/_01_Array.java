package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "리떼";
        String coffeeMonica = "밀크티";

        //배열 선언 첫 번째 방법
        //String[]coffees = new String[4];

        //배열 선언 두 번째 방법
        //String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "리떼";
//        coffees[3] = "밀크티";

        //세 번째 방법
       // String[]coffees = new String[]{"아메리카노","카페모카","라떼","밀크티"};

        //네 번째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","밀크티"};

        System.out.println(coffees[0] + "하나"); // 아메리카노 하나
        System.out.println(coffees[1] + "하나"); // 카페모카 하나
        coffees[2] = "에프레소라떼";
        System.out.println(coffees[2] + "하나"); // 카페모카 하나
        System.out.println(coffees[3] + "하나"); // 카페모카 하나
        System.out.println("주세요");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[]d = new double[]{10.0,12.0,1.27};
        boolean[]b = {true,false};

    }
}
