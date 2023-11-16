package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "캐스퍼"; // public이라서 접근 가능
        // b1.resolution = "FHD"; // default 는 같은 패키지 내에서만 접근 가능
        //b1.price   // private 해당 클래스 내에서만 접근 가능
        // b1.color // protected는 같은 패키지 혹은 자식클래스에서만 ! , 여기는 자식클래스도 아니고 패키지도 다름
        // A a = new BlackBoxRefurbish에 정의된 클래스로, 퍼블릭이 없으니 디폴트! 디폴트는 같은 패키지 내에서만 가능~

    }
}
