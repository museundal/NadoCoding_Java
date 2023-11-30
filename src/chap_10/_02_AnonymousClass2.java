package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {

        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("-------------------");

        HomeMadeBurger nctBurger = getNctBurger();
        nctBurger.cook();
    }
/*
이제, getMomMadeBurger()와 getNctBurger()라는 두 개의 메서드(함수)가 있어요.
이 두 메서드는 각각 '엄마가 만든 버거'와 '태용이가 만든 버거'를 만드는 방법을 알려줍니다.
그런데 여기서 특별한 점은, 이 방법들을 별도의 클래스로 만들지 않고, 바로 HomeMadeBurger를 이용해서 만들어요. 이걸 '익명 클래스'라고 합니다.
'익명'이란 말 그대로 이름이 없다는 뜻이에요. 즉, 이 방법들은 일회용이고 다른 곳에서는 쓰이지 않아요.

예를 들어, getMomMadeBurger()는 엄마가 만드는 버거 방법을 알려주고, getNctBurger()는 태용이가 만드는 버거 방법을 알려줍니다.
각각의 방법에서는 버거를 만드는 재료와 순서가 조금씩 달라요.
요약하자면, 이 코드는 '버거 만드는 방법'을 예로 들어서,
 일반적인 방법(클래스) 대신 특별한 상황에 맞게 즉석에서 만들어진 방법(익명 클래스)을 사용하는 것을 보여줍니다.
 이런 식으로 프로그래밍에서는 때때로 빠르고 간단하게 특정 작업을 처리할 수 있는 방법을 사용하기도 해요.
 */
    private static HomeMadeBurger getNctBurger() { // 익명클래스를 그때그떄 만들어서 리턴~

        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("태용이가 만드는 수제버거");
                System.out.println("재료는 빵,새우패티,해쉬브라운,양상추,토마토,스윗칠리소스,피클");
            }
        };//익명클래스
    }

    public static HomeMadeBurger getMomMadeBurger() { // 엄마가 만든 햄버거는 우리집만 먹음! ㅋㅋ
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제버거");
                System.out.println("재료는 빵,소고기패티,해쉬브라운,양상추,토마토,스윗칠리소스,피클");
            }
        };//익명클래스
    }//메인
}//클래스

abstract class HomeMadeBurger { // 추상클래스로 바로 개체를 만들 수 없고 상속 해야 객체를 만들 수 있고
    //집집마다 재료가 달라서 클래스를 정의하기엔 애매합니다. -> 익명클래스를 이용해보자
    public abstract void cook();

    /*
    HomeMadeBurger는 '수제버거 만드는 방법'을 대표하는 큰 틀이에요.
    하지만 이 큰 틀은 구체적인 버거 만드는 방법이 없어요.
    여기서 '방법이 없다'는 말은, HomeMadeBurger에는 '어떻게 버거를 만들지'라는 세부 내용이 정해져 있지 않다는 뜻이에요.
     */
}
