package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //쓰레드란 프로그램이나 프로세스 안에서의 실행 흐름의 기본 단위입니다.
        //cleanBySelf(); 혼자서 하기 너무 벅참

        //호텔방 10개가 있는데 홀수 , 짝수 번방이 복도를 기준으로 마주보는 중 (직원고용)
        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); run 메소드를 직접 호출하면 동시작업이 안됩니다.
        cleanThread.start(); // 이 과정에서 새로운 쓰레드를 만들면서 run 메소드를 실행합니다.
        cleanByBoss();

        
    }
    public static void cleanBySelf(){
        System.out.println("===혼자서 청소 시작====");
        for (int i = 1; i <10 ; i++) {
            System.out.println("(혼자) "+ i + "번방 청소중 ");
        }
        System.out.println("===혼자 청소 끝===");
    }

    public static void cleanByBoss() {
        System.out.println("====사장 청소 시작 Thread====");
        for (int i = 1; i < 10; i += 2) { // 홀수번방 청소
            System.out.println("(사장) " + i + "번방 청소중 Thread ");
        }
        System.out.println("====사장 청소 끝 Thread====");
    }
}
