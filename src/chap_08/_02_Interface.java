package chap_08;

import chap_08.Detector.AdvancedFireDetector;
import chap_08.Detector.Detectable;
import chap_08.Detector.FireDetector;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스 , 뼈대만 제공하는 구조
        //인터페이스는 implements , 그리고 여러개를 상속할 수 있다.

        //NormalReporter normalReporter = new NormalReporter();
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();
        //VideoReporter videoReporter = new VideoReporter();
        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("====================");
        Detectable fireDetector = new FireDetector();
        Detectable advancedDetector = new AdvancedFireDetector();
        fireDetector.detect();
        advancedDetector.detect();
        System.out.println("====================");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();

        System.out.println("====================");

        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(advancedDetector);
        speedCam.setReporter(videoReporter);
        speedCam.report();
        speedCam.detect();

    }
}
