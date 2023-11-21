package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 기본 자료형 Primitive Data Types
        // 기본 자료형은 우리가 사용할 수 있는 메소드가 없다.
        int [] i = new int[3];
        System.out.println(i[0]); // 기본값 0

        double[] d = new double[3];
        System.out.println(d[0]); // 기본값 0.0

        // 참조 자료형 Reference Data Type
        //String BlackBox Camera ...
        // 기본값이 null
        // 우리가 사용할 수 있는 메소드가 있다.

        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true 인걸 보니 null
        System.out.println("=============================");
        int a= 10;
        int b =20;

        b=a;
        System.out.println(a); // 10
        System.out.println(b); // 10

        b=30;
        System.out.println(a); // 10
        System.out.println(b); // 30

        System.out.println("=============================");

        Camera c1 = new Camera(); //c1 풍선
        Camera c2 = new Camera(); // c2 풍선
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); //카메라1
        System.out.println(c2.name);//카메라2
        c2 = c1; // c2 풍선을 잡고있는 손을 놓고 ,  c1이 가리키는 풍선을 잡는다. , 이 코드 라인이 실행되면 c2가 더 이상 "카메라2" 객체를 가리키지 않게 됩니다
        //이제 c1과 c2는 동일한 객체를 가리키게 되었고, 그 객체의 name 속성은 "카메라1"입니다.
        //c1 의 값을 c2에 복사하는게 아니라 , 이제 같은 풍선을 잡고 있어서 값이 계속 동일하게 바뀌니 주의합시다.
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1
        // c2.name = "고장난 카메라";
        System.out.println(c1.name);//고장난 카메라
        System.out.println(c2.name); //고장난 카메라

        // 기본 자료형은 값이 복사가 되지만, 참조형은 가리키는 대상이 달라져 버린다

        changeName(c2);
        // 이는 c1과 c2가 동일한 객체를 가리키고 있기 때문에 c1.name도 "잘못된 카메라"로 바뀌게 됩니다.
        System.out.println(c1.name); //잘못된 카메라
        System.out.println(c2.name); //잘못된 카메라
        System.out.println("============");
        // 관계를 끊으려면
        c2 = null;
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // null point exception
    }

    public static void changeName(Camera camera){
            camera.name = "잘못된 카메라";
    }
}
