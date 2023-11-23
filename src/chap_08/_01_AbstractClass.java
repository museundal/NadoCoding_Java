package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화
        //abstract 키워드를 통해 추상클래스를 만들 예정
        //추상 클래스 = 아직 완성되지 않은 클래스! 객체를 만들 수 없습니다! , 추상메서드를 가지지 않을 수도 있어요!
        // 추상클래스를 상속받은 자식클래스는 객체 생성 가능
        //추상 메소드 ( 추상클래스 또는 인터페이스에서 사용 가능한 껍데기만 있는 메소드)

       //  Camera camera = new Camera();  Camera' is abstract; cannot be instantiated
       // FactoryCam factoryCam = new FactoryCam();
       // SpeedCam speedCam = new SpeedCam();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();


    }
}
