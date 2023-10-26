package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열 변환
        System.out.println(s.replace("and",",")) ;
        System.out.println(s.substring(7)); //7부터 끝까지
        System.out.println(s.substring(s.indexOf("Java")));

        //시작하는위치, 마지막 빼고!
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        
        //공백제거
        s = "        I love Java.    ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1= "Java";
        String s2= "Spring";
        System.out.println(s1+s2);
        System.out.println(s1+" and "+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(",").concat(s2));

        


    }
}
