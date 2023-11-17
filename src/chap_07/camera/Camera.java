package chap_07.camera;

public class Camera {

    public String name;

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        System.out.println("사진을 촬영합니다");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }
}
