package chap_03;

public class _04_String4 {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        // \n \t \\ \" \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t 탭
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t9000원");
        System.out.println("부추전\t\t9000원");

        // \\ 역슬래시
        System.out.println("C:\\Program Files\\Java");

        System.out.println("달몽이가 \"냐옹\" 이라고 했어요");
        System.out.println("달몽이가 '뭘 봐' 라는 표정을 지었어요");
        System.out.println("달몽이가 \'뭘 봐\' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }
}
