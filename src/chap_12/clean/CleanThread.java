package chap_12.clean;

public class CleanThread extends Thread { //Thread를 상속해야 이용 가능
    public void run() { // run 메소드를 오버라이드
        System.out.println("직원 청소 시작 Thread");
        for (int i = 2; i < 10; i += 2) { // 짝수번방 청소
            System.out.println("(직원) " + i + "번방 청소중 Thread ");
        }
        System.out.println("직원 청소 끝 Thread");
    }

}
