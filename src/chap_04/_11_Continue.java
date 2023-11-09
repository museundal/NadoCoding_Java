package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //FOR
        int max= 20; // 최대 치킨 판매 수량
        int sold = 0; //현재 치킨 판매 수량
        int noShow= 17;

        for (int i = 1; i < 50; i++) {

            System.out.println(i+"번 손님 , 주문하신 치킨 나왔습니다.");
            sold++; // 판매처리

            if(i==17){
                System.out.println(i+"번 손님 , 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 즉시 동작을 멈추고 다음 회차로
            }
            if(sold==max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // 반복문을 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("=========================");
        //while 문
        sold = 0;

        int index =1;

//        while (index<=50){
//            System.out.println(index+"번 손님 , 주문하신 치킨 나왔습니다.");
//            if(index==noShow){
//                System.out.println(index+"번 손님 , 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
//                index++; //for문과 다르게 증감 부분이 없어서 안에서 한번 더 적어줘야한다.
//                continue;
//            }
//            sold++;
//            if(sold==max){
//                System.out.println("금일 재료가 모두 소진되었습니다.");
//                break;
//            }
//            index++;
//        }
        index=0;
        sold=0;

        while (index<50){
            index++;
            System.out.println(index+"번 손님 , 주문하신 치킨 나왔습니다.");
            //손님이 없다면
            if(index==noShow){
                System.out.println(index+"번 손님 , 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;//판매처리

            if(sold==max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
    }
}
