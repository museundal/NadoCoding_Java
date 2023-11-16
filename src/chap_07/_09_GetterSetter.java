package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "Black";

        b1.price = -5000; // 할인행사인데 잘못 입력함 , 5천원을 주게 생김
        System.out.println("가격 : " + b1.price);

        //고객문의
        System.out.println("해상도 : " + b1.resolution); // 올바른 답변이 안되는 경우 !!

        System.out.println("==========================");
        /*b1 블랙박스는 이미 실수니 , 새로운 객체를 만들자*/
        BlackBox b2 = new BlackBox();
        b2.setModelName("캐스퍼");
        b2.setPrice(-50000);
        b2.setColor("하양이");

        System.out.println("가격 : "+ b2.getPrice());
        System.out.println("해상도 : " + b2.getResolution());


    }
}
