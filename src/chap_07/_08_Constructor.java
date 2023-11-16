package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        //객체가 만들어 질때 자동으로 호출되는 메서드

        BlackBox b1 = new BlackBox();
        System.out.println();
        BlackBox b2 = new BlackBox("까망이",20000,"FHD","Black");
        System.out.println(b2.modelName);
        System.out.println(b2.price);
        System.out.println(b2.resolution);
        System.out.println(b2.color);


    }
}
