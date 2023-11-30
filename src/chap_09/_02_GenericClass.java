package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제네릭 클래스

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("이태민");
        c2.ready();

        System.out.println("===================");

        CoffeeByName c3 = new CoffeeByName(34); //정수
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("문태일"); // 문자열
        c4.ready();

        System.out.println("===================");
        int c3Name = (int) c3.name; // int를 기대하는 object여서 형변환 필요
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);
        System.out.println("===================");

        // c4Name= (String)c3Name; 사용자가 실수할 수 있어요!! 모르고 정수를 문자열로 바꾸려고 할 수 있음
        // 이러한 문제를 해결하기 위해서 제네릭클래스

        Coffee<Integer> c5 = new Coffee<>(127);
        c5.ready();

        int c5Name = c5.name; // 형변환이 필요 없습니다. 자바의 언박싱 기능 덕분에 가능한 것으로, Integer 객체가 자동으로 기본 타입 int로 변환
        System.out.println("주문 고객 번호 : " + c5Name);

        // Coffee<Integer> c7 = new Coffee<>("한지민");
        // c5.ready();  이  타입은 Integer 를 기대하고 있다며 에러가 납니다!
        Coffee<String> c6 = new Coffee<>("SHINEE");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);
        System.out.println("===================");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("김도연"));
        c7.ready();
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("문태일"));
        //User를 상속받는 건 다 되니까 가능
        c8.ready();
        // CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox()); , User를 상속받는게 아니어서 에러!
        System.out.println("===================");
        orderCoffee("김도영");
        orderCoffee(127);
        orderCoffee("정재현", "아메리카노");
        orderCoffee(999,"밀크티" );




    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 주문 완료 : " + name);

    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 주문 완료 : " + name);

    }
}

class BlackBox {

}