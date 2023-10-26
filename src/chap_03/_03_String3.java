package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        String s1= "Java";
        String s2= "Spring";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같냐 다르냐

        // 대소문자 구별없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("spring"));
        System.out.println("=======================================");
        //문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2); //true

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true , 두 문자열의 내용이 같은지
        System.out.println(s1==s2); //false , 두 객체의 참조 메모리가 같은지



    }
}
