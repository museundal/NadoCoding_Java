package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {

        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable); // 쓰레드 생성자에 Runnable 집어넣기
        thread.start();
        cleanByBoss();

    }

    public static void cleanByBoss() {
        System.out.println("====사장 청소 시작 Thread====");
        for (int i = 1; i < 10; i += 2) { // 홀수번방 청소
            System.out.println("(사장) " + i + "번방 청소중 Thread ");
        }
        System.out.println("====사장 청소 끝 Thread====");
    }
}
