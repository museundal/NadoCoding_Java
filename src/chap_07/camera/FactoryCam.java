package chap_07.camera;

public class FactoryCam extends Camera {// // 부모 클래스를 상속받은 자식 클래스


    public FactoryCam() {
        // 여기서 부모 클래스(Camera)의 name 필드에 "공장카메라"라는 값을 할당합니다.
       // this.name = "공장카메라";

        super("공장카메라"); // 부모클래스의 생성자에 접근
    }

    @Override // 부모 Camera 메서드를 오버라이드
    public void recordVideo() { //동영상 녹화와 동시에 불 감지
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    @Override //애노테이션 , 코드에 부가 정보를 제공하는 태그
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진촬영, 화재감지");
    }
}
