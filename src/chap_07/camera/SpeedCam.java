package chap_07.camera;

public class SpeedCam extends Camera { // 부모 클래스를 상속받은 자식 클래스


    @Override
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public SpeedCam() {
        //this.name = "과속단속카메라";
        super("과속단속카메라");
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진촬영, 속도측정, 차량번호 인식");
    }
}
