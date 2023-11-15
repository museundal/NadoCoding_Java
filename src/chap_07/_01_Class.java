package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체지향프로그래밍 OOP  object oriented programming
        // 객체 : 컴퓨터,모니터,마우스,책,선풍기 가방
        // 본체 안에 CPU,RAM 하드디스크, 그래픽 카드 하나하나 객체 어우려저셔 컴퓨터가 된다
        //객체들 끼리 어우러진 형태로 프로그래밍을 구성하며 객체지향프로그래밍이 자바가 지향하는 바
        //유지보수에 용이합니다. 높은 재사용성

        //첫 번째 제품 개발
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 20000;
        String color = "블랙";

        //두 번째 제품 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 30000;
        String color2 = "화이트";

        // 세 번째 제품 개발 ... 벌써 변수명 12개가 사용  -> 이럴 때 우리가 클래스를 쓸 수 있습니다.
        //클래스란 서로 다른 자료형이지만 비슷한 것 끼리 모아둔 하나의 형태라고 생각하자 ! 설계도와 같음
        // 블랙박스 라는 클래스로 부터 객체를 생성한 과정 !
        //blackBox 객체는 BlackBox 클래스의 인스턴스 이다.
        // 클래스 설계도 , 객체는 설계도로부터 만들어진 결과물
        // 종이접기 책 = 클래스 , 책을 바탕으로 만든 종이학이 객체 ! , 인스턴스,,,
        BlackBox blackBox = new BlackBox();





    }
}
