package chap_07.camera;

public class SpeedCam {

    public String name;

    public SpeedCam() {
        this.name = "과속단속카메라";
    }

    public void takePicture() {
        System.out.println("사진을 촬영합니다");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

}
