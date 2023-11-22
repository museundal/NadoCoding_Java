package JavaBible;

import java.util.Scanner;

public class Quiz_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        String str;
        if(age>=20 &&age<30){
            str = "20대";
        } else if(age>=30 &&age<40){
            str = "30대";
        }else{
            str ="20대도, 30대도 아니다.";
        }
        System.out.println(str);

        // 프로그램이 인자를 받았는지 확인
        if (args.length > 0) {
            // args[0]의 첫 문자를 가져옴
            char firstChar = args[0].charAt(0);

            // 첫 문자가 소문자인지 확인
            if (Character.isLowerCase(firstChar)) {
                System.out.println(firstChar + "은(는) 소문자입니다.");
            }
            // 첫 문자가 대문자인지 확인
            else if (Character.isUpperCase(firstChar)) {
                System.out.println(firstChar + "은(는) 대문자입니다.");
            }
            // 첫 문자가 숫자인지 확인
            else if (Character.isDigit(firstChar)) {
                System.out.println(firstChar + "은(는) 숫자입니다.");
            }
            // 그 외의 경우
            else {
                System.out.println(firstChar + "은(는) 소문자, 대문자, 숫자가 아닙니다.");
            }
        } else {
            System.out.println("인자가 전달되지 않았습니다.");
        }
    }
}
