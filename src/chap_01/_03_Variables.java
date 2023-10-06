package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // int long float double char String Boolean
        // 불필요하게 용량 남지 않도록 맞는 타입을 쓰자.

        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다."+ hour+ "시에 방문 예정입니다");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "임시완";
        System.out.println(name + "님의 평균 점수는" + score+"점입니다.");
        System.out.println("학점은 " +grade+"입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요?" + pass);

        double d = 3.14;
        //int, double 은 각각 정수에 대한 기본타입, 실수에 대한 기본타입이다.
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);

        double dd = 3.14123456789;
        float ff = 3.14123456789f;
        System.out.println(dd);
        System.out.println(ff);

        //int i = 1000000000000; int가 표현 할 수 있는 값의 범위를 벗어남
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l );





    }
}
