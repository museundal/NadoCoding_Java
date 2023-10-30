package chap_04;

public class _01_if {
    public static void main(String[] args) {
        int hour = 10;
        // 하나의 문장 실행할 때는 {} 생략 가능
        if(hour < 14)
            System.out.println("아이스 아메리카노 +1");

        if(hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean hadMorningCoffee = false;
//        if(hour<14 && hadMorningCoffee==false){
//            System.out.println("아이스 아메리카노 +1");
//        }
//        System.out.println("커피 주문 완료");

        if(hour<14 && !hadMorningCoffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

    // 오후 2시 이후거나, 모닝 커피를 마신 경우?
    hour=15;
    hadMorningCoffee=true;
//    if(hour>=14 || hadMorningCoffee ==true ){
//        System.out.println("디카페인 아메리카노 +1");
//    }
//        System.out.println("커피주문완료 #3");

    if(hour>=14 || hadMorningCoffee ){
        System.out.println("디카페인 아메리카노 +1");
    }
        System.out.println("커피주문완료 #3");

    }

}

