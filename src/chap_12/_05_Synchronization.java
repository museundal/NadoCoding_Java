package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        //동기화 -> 청소를 순서대로 하도록 !

        Room romm = new Room();
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작 ");
                for (int i = 1 ; i <= 5; i ++) {
                    romm.clean("직원1"); // 비어있는 방 청소하게 된다. 몇번방을 청소하게 될줄은 모른다.
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("직원1 청소 끝 ");
            }
        };

        Runnable cleaner2 = ()->{
            System.out.println("직원2 청소 시작 ");
            for (int i = 1; i <= 5; i ++) {
                romm.clean("직원2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(i==2){
                    throw new RuntimeException("못해먹겠어!"); // 그럼에도 불구하고 직원1은 묵묵히 일한다.
                }
            }
            System.out.println("직원2 청소 끝 ");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);
        cleanerThread1.start();
        cleanerThread2.start();
    }
}
