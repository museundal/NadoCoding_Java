package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final
        //public abstract static final

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈"; 액션캠 주인이 광각렌즈만 고집 , 이떄 광각렌즈에 Final
        //private 으로 안하는 이유는 get,set으로 또 설정할 수 있어서 Final로 한다
        actionCam.recordVideo();
        actionCam.makeVideo();
        System.out.println();

        SlowActionCam slowActionCam = new SlowActionCam();
        //slowActionCam.recordVideo(); 액션캠의 recordVideo 기능을 못쓰게 됨
        slowActionCam.makeVideo();
    }
}