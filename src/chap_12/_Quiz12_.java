package chap_12;

public class _Quiz12_ {
    public static void main(String[] args) {
        Runnable presentA = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("상품A " + i + "개 준비완료");
                }
                System.out.println("A상품 준비완료");
            }
        };


        Runnable presentB = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("상품B " + i + "개 준비완료");
                }
                System.out.println("B상품 준비완료");
            }
        };

        Thread thread1 = new Thread(presentA);
        Thread thread2 = new Thread(presentB);
        thread1.start();
        thread2.start();
//        while(thread1.isAlive() || thread2.isAlive()){ // isAlive는 스레드가 살아있는지 죽어있는지 판단하는 것
        //thread1 과 thread2가 모두 종료될 때까지 현재 스레드의 실행을 멈추게 합니다.
        //이 루프가 끝나야 다음 wrapSEATAB가 실행된다. , join과 같은 기능
//
//        }
        try {
            thread1.join(1000);
            thread2.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable wrapSETAB = () -> {
            System.out.println("🎄🎄세트 상품 포장 시작🎄🎄");
            for (int i = 1; i <= 5; i++) {
                System.out.println("상품AB " + i + "개 포장완료");
            }
            System.out.println("🎄🎄세트 상품 포장 완료🎄🎄");
        };

        Thread thread3 = new Thread(wrapSETAB);
        thread3.start();
    }
}



