package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        //익명 클래스 - 이름이 없는 클래스
        //클래스도 다른 클래스 내부에 정의 할 수도 있는데 이걸 내부클래스라고 합니다!
        //내부 클래스 중 특별한 익명클래스~
        // 커피를 상속해서 다른 스페셜 커피 만들 필요없이 메소드만 재정의 ~

        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println();
        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println();

        //친한 친구가 와서 서비스를 주고싶음
        Coffee specialCoffee = new Coffee(){ // 익명클래스, 똑같은 클래스를 이용하는데 기능을 확장
            //specialCoffee 이 객체를 위한 1회성 코드
            @Override
            public void order(String coffee) {
                super.order(coffee); // order 적으니까 자동으로 오버라이드가 되었습니다.
                System.out.println("(딸기 케이크는 서비스야 )");
            }

            @Override
            public void returnTray() {
                //super.returnTra();
                System.out.println("자리에 두면 내가 치울게");
            }
        };

        specialCoffee.order("민트초코라떼");
        specialCoffee.returnTray();

    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료되었습니다");
    }
}
