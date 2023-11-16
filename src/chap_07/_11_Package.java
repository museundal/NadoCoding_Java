package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지는 폴더구조와 같아요 , 패키지(package)는 관련된 클래스와 인터페이스들의 그룹
        // 대형 마트에 가면 과일,채소,수산물,축산물 등등 프로그램도 똑같아요
        //하나의 프로젝트 안의 여러개의 클래스가 있을 수 있고, 연관되 클래스끼리 묶어 놓은걸 패키지라 그래요

        /*제시된 항목들은 자바의 java.lang 및 java.util 패키지, 그리고 java.math와 java.time 패키지의 일부 클래스입니다. 각각은 다음과 같습니다:*/
        //Math ,Scanner , StringBuilder StringBuffer StringTokenizer
        //BigInteger, BigDemical
        //LocalDate, LocalTime, LocalDateTime, DateTimeFormatter

        //패키지 랜덤클래스!
        Random random = new Random();
        System.out.println("랜점 정수 : " + random.nextInt()); // int 범위 내에서 정수형 값 반환
        System.out.println("랜점 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만
        System.out.println("랜점 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 값
       // System.out.println("랜점 실수 (범위) : " + random.nextDouble(10.0)); // 0.0 이상 10.0 미만 근데 이게 안된다.
        //만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        // 약간의 트릭인데 10.0-5.0 하면 5 에 0.0 이상 1.0 미만의 실수를 곱하면  0.0 이상 5.0 미만의 실수가 되고 거기에 다시 5를 더하니 5.0 이상 10.0 미만의 실수값이 된다.
        System.out.println("랜덤 실수 (범위)"+(min+(max-min)*random.nextDouble()));

        System.out.println("랜덤 불리안" + random.nextBoolean());

        //로또 번호 1~45
        System.out.println("로또번호" + (random.nextInt(45)+1));
        //nextInt(45)  : 0 이상 45 미만의 수
        // nextInt(45) +1 : 1 이상 46 미만의 수 = 1 이상 45 이하의 수




    }
}
