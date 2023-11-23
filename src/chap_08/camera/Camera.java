package chap_08.camera;

public abstract class Camera {
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다");
    }
    public abstract void showMainFeature();
    //추상 메소드는 선언만 합니다. , 자식클래스에서 메소드를 구현
}
