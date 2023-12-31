package chap_08.camera;

import chap_08.Detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {


    private Detectable detector;


    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {

        reporter.report();
    }

//    public  void detect(){
//        System.out.println("화재를 감지함");
//    }
//
//    public  void report(){
//        System.out.println("화재 신고를 진행합니다.");
//    }
}
