package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) { //메인 메소드 , 자바 시작할 때 제일 처음으로 진입한다.
        //메소드는 문자열을 여러개 가지고 있는  String 배열을 전달받는 메소드였다.

        for (String s : args
        ) {
            System.out.println(s);
        }

        //도서 조회
        //도서 대출
        //도서 반납

        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다");
                    break;
                case"2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default: // case로 지정된 값들과 일치하지 않는 경우 실행될 코드 블록을 지정
                    System.out.println("잘못 입력 하셨습니다.");
            }
        } else {
            System.out.println("사용법 : 1~3 메뉴중에서 골라 주세요");
        }


    }
}

