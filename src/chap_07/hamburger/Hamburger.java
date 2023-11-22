package chap_07.hamburger;

public class Hamburger {
public String name;

    public Hamburger() {

        this("햄버거"); // 오버로드된 생성자 호출

    }

    public Hamburger(String name) {
        this.name = name;
    }

    public void cook(){
        System.out.println(this.name+"를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
}

}
