package chap_07.hamburger;

public class CheeseBurger extends Hamburger {


    public CheeseBurger() {
        super("치즈버거"); // 부모클래스의 생성자를 호출
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");

    }
}
