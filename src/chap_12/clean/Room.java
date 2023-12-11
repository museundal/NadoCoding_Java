package chap_12.clean;

public class Room {
    public int number = 1;
   synchronized public void clean(String name) { //멀티스레드가 동일한 변수에 동시에 접근하는것을 방지하기 위해 synchronized를 붙여준다.
        System.out.println(name + " : " + number + "번방 청소중");
        number++;
    }
}
