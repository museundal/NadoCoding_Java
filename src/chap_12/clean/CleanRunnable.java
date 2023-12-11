package chap_12.clean;

public class CleanRunnable implements Runnable { // 인터페이스를 구현
    @Override
    public void run() {
        System.out.println("직원 청소 시작 Runnable");
        for (int i = 2; i < 10; i += 2) { // 짝수번방 청소
            System.out.println("(직원) " + i + "번방 청소중 Runnable ");
            try {
                Thread.sleep(1000); // 1초동안 잠깐 멈추는 것
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("직원 청소 끝 Runnable");
    }
}

// 상속은 단일 상속만 가능(쓰레드) , Runnable은 인터페이스여서 여러개 한꺼번에 구현 가능
//그거 빼고는 둘의 기능은 같습니다!