package chap_07.camera;

public class FactoryCam extends Camera {// // 부모 클래스를 상속받은 자식 클래스


    public FactoryCam() {
        this.name = "공장카메라";
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    @Override //애노테이션 , 코드에 부가 정보를 제공하는 태그
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진촬영, 화재감지");
    }
}
