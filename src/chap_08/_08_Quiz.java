package chap_08;

import chap_08.Detector.AccidentDetector;
import chap_08.camera.SpeedCam;

public class _08_Quiz {
    public static void main(String[] args) {

        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.detect();

    }
}
