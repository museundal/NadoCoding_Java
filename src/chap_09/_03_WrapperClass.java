package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        //래퍼 클래스
        // int double float char  기본자료형을 객체형태로 !
        //Integer , Float, Double, Characterc

        Integer i = 127;
        Double d = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("++++++++++++");
        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());
        System.out.println("++++++++++++");

        String s = i.toString();
        System.out.println(s);
    }
}
