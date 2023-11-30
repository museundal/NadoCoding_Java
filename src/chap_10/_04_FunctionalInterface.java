package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    //함수형 인터페이스 : 함수형 인터페이스는 하나의 추상메소드가 존재해야 한다는 조건이 있습니다.
    /*
    convertUSD 에 전달하는 람다식을 메소드 내에서는 다음과 같이 Convertible 인터페이스로 받으며 Convertible 인터페이스 내에서 하나만 존재하는 convert() 라는 추상 메소드에 동작이 정의
     */
    public static void main(String[] args) {
        //객체를 만들어서 인자를 사용하는 방법 말고 !!
        // KRWConverter converter = new KRWConverter();
        // krwConverter.convert(1);
        //convertUSD(krwConverter,2); 잘 생각해보면 krwConverter 하는 일이 밑에 한줄뿐이니 편하게 람다식 ,krwConverter 에 있는 메소드 복사해오기

        //람다식을 이용해서 해당 Interface의 추상 메소드를 람다식으로 구현
        /*
        Convertble 인터페이스는 함수형 인터페이스로, 하나의 추상 메소드만을 가지고 있습니다.
        이러한 인터페이스를 람다식으로 구현하여 Convertible 타입의 객체를 생성하고, 이 객체를 convertUSD() 메소드의 인자로 전달합니다.
        람다식을 사용하면 Convertible 인터페이스를 구현하는 별도의 클래스를 생성할 필요 없이, 인터페이스의 추상 메서드를 간편하게 구현할 수 있죠.
        따라서 이 코드는 람다식을 이용하여 Convertible 인터페이스의 추상 메소드를 구현하고, 이를 convertUSD() 메소드의 인자로 전달하는 코드가 맞습니다 😊
         */

        /*
         public void convert(int USD) {
         System.out.println(USD +"달러 = " + (USD * 1400)+ "원");
           } 이걸 람다식으로
         */

        /*
        네, 맞습니다. `(USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원")` 이 부분은 실제로 인터페이스 `Convertible`의 구현체가 됩니다.
        함수형 인터페이스는 정확히 하나의 추상 메소드를 가지는 인터페이스입니다. 자바에서는 람다식을 사용하여 이러한 함수형 인터페이스의 구현체를 간결하게 작성할 수 있습니다
        여기서 `Convertible` 인터페이스는 하나의 추상 메소드, 즉 `convert(int USD)`를 정의하고 있습니다. 이 메소드는 달러를 원화로 변환하는 로직을 담고 있을 것입니다.
        `convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 1);` 이 코드 라인에서는 `convertUSD` 메소드에 두 개의 인자를 전달합니다.
        첫 번째 인자는 `Convertible` 인터페이스의 구현체인데, 여기서 람다식을 사용하여 이 구현체를 제공합니다. 이 람다식은 `convert` 메소드의 구현을 대신합니다.
        즉, 람다식 `(USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원")`는 `convert` 메소드를 구현하는 코드입니다
        두 번째 인자 `1`은 변환할 달러의 양을 나타냅니다.
        따라서 이 람다식은 `Convertible` 인터페이스의 구현이며, `convertUSD` 메소드에 전달될 때, `convert` 메소드의 내용으로 사용됩니다.
        이렇게 람다식을 사용하면 별도의 클래스를 만들지 않고도 인터페이스의 구현을 간단하고 깔끔하게 제공할 수 있습니다.
         */
        //convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"), 1); // 한줄이니까 중괄호,세미콜론 생략가능
        Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원"); // 인터페이스의 동작을 변수처럼 전달
        // 이러한 인터페이스를 함수형 인터페이스라고 부릅니다.
        convertUSD(convertible,1);
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
