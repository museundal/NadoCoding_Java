package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser<T extends User> { // T 어떤 형태든 타입이든 상관 없지만 ,User 클래스를 상속해야한다는 뜻
    //User 또는 VIPUser를 받을 수 있다

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 주문 완료 : " + user.name );
        user.addPoint();
    }
}
