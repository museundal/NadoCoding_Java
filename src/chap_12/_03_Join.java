package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        //직원 청소 끝나고 사장이 다시 청소 !
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
//        try {
//            thread.join(); // 쓰레드가 종료될 떄까지 기다렸다가 끝나면 cleanBoss가 실행 , 근데 직원을 고용한 보람이 없네... 한사람이 방 10개 청소하는거랑 같음
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            thread.join(2500); // 2.5초 대기 , 그럼에도 안끝나면 다음줄 실행 , 직원이 방 3개정도 하니까 사장이 그냥 함 !
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("====사장 청소 시작 Thread====");
        for (int i = 1; i < 10; i += 2) { // 홀수번방 청소
            System.out.println("(사장) " + i + "번방 청소중 Thread ");
            try {
                Thread.sleep(1000); // 1초동안 잠깐 멈추는 것
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("====사장 청소 끝 Thread====");
    }
}
