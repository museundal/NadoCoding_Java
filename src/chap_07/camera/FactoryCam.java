package chap_07.camera;

public class FactoryCam {
    public String name;

    public FactoryCam() {
        this.name = "공장카메라";
    }
    public void takePicture() {
        System.out.println("사진을 촬영합니다");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
}
