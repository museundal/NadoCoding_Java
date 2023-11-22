package chap_07.camera;

public class SlowActionCam {
    //public class SlowActionCam extends ActionCam  -> 액션캠 클래스가 final 이어버림
    public String name;
    /*
     * SlowActionCam이 ActionCam을 확장하고 있고,
     * ActionCam이 다시 Camera를 확장한다면,
     * SlowActionCam은 Camera 클래스의 모든 공개(public) 및 보호된(protected) 필드와 메서드를 상속받습니다.
     * */
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo(){
        System.out.println("자체 개발한 비디오 제작기능");
    }

//    @Override
//    public void makeVideo(){ //액션캠 주인이 이 기능을 final로 선언해서 오버라이드가 안된다.
//        //this.lens = "표준렌즈"; final 이어서 값변경이 안된다.
//        System.out.println(this.name+": "
//                + this.lens+"로 촬영한 영상을 통해  슬로우모드 비디오를 제작합니다");
//    }
}