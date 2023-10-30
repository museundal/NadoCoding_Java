package chap_04;

public class _02_else {
    public static void main(String[] args) {
          int hour = 15;
          if(hour<14)
              System.out.println("아이스 아메리카노 +1");
          else
              System.out.println("디카페인 아이스 아메리카노 +1");

        System.out.println("#1 커피주문완료");

        hour = 10;
        boolean morningCoffee = false;

        if(hour>=14 ||morningCoffee==true){
            System.out.println("디카페인 아이스 아메리카노 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("#2 커피주문완료");

    }

}

