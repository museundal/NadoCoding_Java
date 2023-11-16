package chap_07;

public class _05_Overloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "캐스퍼";
        b1.record(false,false,10);
        System.out.println("======================");
        b1.record(true,false,3);
        System.out.println("======================");
        b1.record(true,true,5);
        System.out.println("======================");
        b1.record();

        //String , indexOf 도 오버로딩 중 하나이다.
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}
