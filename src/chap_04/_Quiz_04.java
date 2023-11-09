package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
        //경차 또는 장애인 차량은 최종 요금에서 50% 할인
        //일반 차량 5시간 주차시 20000원 할인
        //경차 5시간 주차시 10000원
        //장애인 차량 10시간 주차시 15000원 , 일일 최대 요금이 3만원이라 했으니까!

        // 실행결과 : 주차 요금은 xx 원입니다.

        int hour =5;
        boolean isSmallCar = true;
        boolean withDisabledPerson = false;

        int fee = hour * 4000;

        //30000원 초과 시 일일 최대 요금으로 수정
        if(fee>30000){
            fee=30000;
        }

        if(isSmallCar || withDisabledPerson){
            fee*=0.5f;
        }

        System.out.println("주차요금은 "+fee +"원 입니다.");
    }
}
