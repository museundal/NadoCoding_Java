package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //사용자 도구준비
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.next();
//        System.out.print("혈액형을 입력하세요 : ");
//        String bloodType = sc.next();
//        System.out.print("키를 입력하세요 : ");
//        int height = sc.nextInt();
//        System.out.print("몸무게를 입력하세요 : ");
//        double weight = sc.nextDouble();
//
//        System.out.println("===========================");
//        System.out.print("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);
        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next();
        //String lang = sc.nextLine(); // 한 단어 자바, 자바스크립트 라고 입력하면 입력버퍼에 자바스크립트 단어가 남아있다.

        sc.nextLine(); // 불필요한 문장을 삭제하는 처리

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.next();
        //String feeling = sc.nextLine(); // 한 문장 , 그래서 입력버퍼에 아직 남아있는 자바스크립트가 출력
        //nextLine();
//        System.out.println("또 공부하고 싶은 언어가 있나요?");
//        String want = sc.nextLine();


        System.out.println("언어 : " + lang);
        System.out.println("느낀점 : " + feeling);
       // System.out.println("공부하고싶은 언어 : " +want );



    }
}
