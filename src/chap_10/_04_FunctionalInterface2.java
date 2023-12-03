package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.ConvertibleWithNoParam;
import chap_10.converter.ConvertibleWithReturn;
import chap_10.converter.ConvertibleWithTwoParams;

public class _04_FunctionalInterface2 {
    public static void main(String[] args) {
        //객체를 만들어서 인자를 사용하는 방법 말고 !!
        // KRWConverter converter = new KRWConverter();
        // krwConverter.convert(1);
        //convertUSD(krwConverter,2); 잘 생각해보면 krwConverter 하는 일이 밑에 한줄뿐이니 편하게 람다식 ,krwConverter 에 있는 메소드 복사해오기

        Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + "원");
        convertUSD(convertible, 1);

        // 전달값이 없다면??
        ConvertibleWithNoParam noParam = () -> System.out.println("1달러는 1400원");
        noParam.convert();

        //두줄 이상의 코드가 있다면??
        noParam = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + "원");

        };
        noParam.convert();

        //전달값이 2개인 경우
        ConvertibleWithTwoParams twoParams = (USD, KRW) -> System.out.println(USD + "달러 = " + (USD * KRW) + "원");
        twoParams.convert(10, 1400);

        //반환값이 있는 경우 ,return 이 있다면 { } 생략 불가능
        ConvertibleWithReturn withReturn = (d, w) -> {
            return d * w;
        };
        ConvertibleWithReturn withReturn2 = (d, w) -> d * w;
        int result = withReturn2.convert(4,1400);
        System.out.println("결과 : " + result + "원");

    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
