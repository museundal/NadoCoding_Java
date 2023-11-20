package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {

        //다형성
        // 학생은 사람이다, 선생님은 사람이다  오케이
        // 사람은 학생이다. 사람은 선생님이다  노노 ~ , 모든 사람이 다 학생이고 선생님인건 아니니까
        // 상속은 IS A 관계다

        Camera camera = new Camera();
        Camera factorycamera = new FactoryCam();
        Camera speedcam = new SpeedCam();

        camera.showMainFeature();
        factorycamera.showMainFeature();
        speedcam.showMainFeature();

        System.out.println("===============");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras
        ) {
            cam.showMainFeature();
        }

        System.out.println("=====================");
        // 객체가 Camera 를 참조 하고 있어서 오버라이드된 부모메서드만 사용 가능하다.
        //factorycamera.detectFire();
        // speedcam.checkSpeed();
        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        //인스턴스 임을 확인하고, 형변환을 통해 객체가 가지는 주요기능을 쓸 수 있다.
        if (factorycamera instanceof FactoryCam) {
            ((FactoryCam) factorycamera).detectFire();
        }
        if (speedcam instanceof SpeedCam) {
            ((SpeedCam) speedcam).checkSpeed();
            ((SpeedCam) speedcam).recognizeLicensePlate();
        }

        //자바는 Object 라는 클래스를 상속하고 있다.
        Object [] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}