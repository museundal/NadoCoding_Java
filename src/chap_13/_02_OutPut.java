package chap_13;

import java.sql.SQLOutput;

public class _02_OutPut {
    public static void main(String[] args) {
        //System.out.format()
        //System.out.printf();
        System.out.println("=======정수=======");
        System.out.printf("%d%n",5);
        System.out.printf("%d %d %d %n",5,9,7);
        System.out.printf("%d%n",1234);
        System.out.printf("%06d%n",1234);//6자리 공간을 확보하는데 빈 공간은 0으로 채워줘
        System.out.printf("%6d%n",1234);//6만큼의 공간을 확보하고 나서 1234 출력 _ _ 1234
        System.out.printf("%6d%n",-1234);//_-1234
        System.out.printf("%+6d%n",1234);//_+1234
        System.out.printf("%,15d%n",1000000000);// 쉼표는 천 단위 구분자
        System.out.printf("%-6d%n",1234);// 왼쪽정렬 , 1234_ _

        System.out.println("=======실수=======");
        System.out.printf("%f%n",Math.PI);
        System.out.printf("%.2f%n",Math.PI); //소수점 둘째자리까지만 나오도록
        System.out.printf("%6.2f%n",Math.PI);// _ _ 3 . 1 4
        System.out.printf("%-6.2f%n",Math.PI);//왼쪽정렬
        System.out.printf("%06.2f%n",Math.PI); // 빈공간은 0으로
        System.out.printf("%+6.2f%n",Math.PI); //+ 기호 표시
        System.out.printf("%6.2f%n",-Math.PI); //+ 기호 표시

        System.out.println("=======문자열=======");
        System.out.printf("%s%n","자바");
        System.out.printf("%6s%n","자바");//오른쪽 정렬
        System.out.printf("%-6s%n","자바"); //왼쪽 정렬
        System.out.printf("%6.2s%n","JAVA"); //앞에서 두글자까지만
        System.out.printf("%-6.2s%n","JAVA"); //앞에서 두글자까지만

        System.out.println("=======응용1=======");
        System.out.println("이름 영어 수학 평균");
        System.out.println("성찬 "+90+" "+80+" "+85.0);
        System.out.println("앤톤 "+100+" "+100+" "+100.0);
        System.out.println("타로 "+95+" "+100+" "+97.5);

        System.out.println("=======응용2=======");
        System.out.println("이름      영어   수학  평균");
        System.out.printf("%-6s %4d %4d %6.1f%n","성찬",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","앤톤",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","타로",95,100,97.5); //소수점 첫째자리까지만

        System.out.println("=======참고=======");
        //똑같은 일곱자리여도 좀 다름 크기가 다르니까
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");

    }
}
