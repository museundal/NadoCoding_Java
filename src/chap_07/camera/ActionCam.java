package chap_07.camera;

public final class ActionCam extends Camera{
    public final String lens;// = "광각렌즈";

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo(){
        //this.lens = "표준렌즈"; final 이어서 값변경이 안된다.
        System.out.println(this.name+": " + this.lens+"로 촬영한 영상을 통해  멋진 비디오를 제작합니다");
    }
}