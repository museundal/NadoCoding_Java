package chap_12;

import chap_12.clean.CleanThread;

public class _04_MultiThread {
    public static void main(String[] args) {
        //익명 클래스와 람다식을 이용해 Runnable 객체를 만들어 보자
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작 ");
                for (int i = 1; i < 10; i += 2) {
                    System.out.println("(직원1) " + i + "번방 청소중  ");
                    try {
                        Thread.sleep(1000); // 1초동안 잠깐 멈추는 것
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("직원1 청소 끝 ");
            }
        };
        //Runnable 눌러보면 함수형 인터페이스, run 메소드 한개 있다.
        Runnable cleaner2 = ()->{
            System.out.println("직원2 청소 시작 ");
            for (int i = 2; i < 10; i += 2) {
                System.out.println("(직원2) " + i + "번방 청소중  ");
                try {
                    Thread.sleep(1000); // 1초동안 잠깐 멈추는 것
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("직원2 청소 끝 ");
        };
        //멀티스레드
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();
    }
}
