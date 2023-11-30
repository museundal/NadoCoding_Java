package chap_10.converter;
@FunctionalInterface
public interface Convertible {
    //Convertble 인터페이스는 함수형 인터페이스
    void convert (int USD);
   // void convert2(int KRW);   //함수형 인터페이스의 추상메소드랑 람다식이 1:1이어야 되는데 뭘해야될지 몰라서 에러난다.
    //이런걸 방지하기 위해서 애노테이션 달기

    /*
    "1 : 1 매칭"이라는 표현은 여기서 함수형 인터페이스와 람다식 간의 관계를 설명하는 데 사용됩니다.
    함수형 인터페이스는 정확히 하나의 추상 메소드를 가집니다. 람다식은 이 하나의 추상 메소드를 구현하기 위해 사용됩니다.
    따라서, 람다식과 함수형 인터페이스의 추상 메소드 사이에는 1:1 관계가 있습니다.

    Convertible 인터페이스는 하나의 추상 메소드 convert(int USD)를 가지고 있습니다.
    람다식 (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원")은 이 convert 메소드의 구현체입니다.

    이 관계에서, 람다식은 Convertible의 convert 메소드와 정확히 매칭됩니다. 즉, 람다식의 매개변수
    (여기서는 USD)는 convert 메소드의 매개변수와 동일하고, 람다식의 바디 (여기서는 System.out.println(...))는 convert 메소드가 실행할 코드를 나타냅니다.
    이 1:1 매칭은 람다식을 사용해 함수형 인터페이스의 인스턴스를 간결하게 생성할 수 있게 해줍니다. 클래스를 별도로 정의하고 인스턴스화하는 대신, 람다식을 직접 전달함으로써 코드의 간결성을 유지할 수 있습니다.
     */
}
