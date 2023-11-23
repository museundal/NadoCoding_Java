package chap_08.Detector;

public class AccidentDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("교통사고를 감지합니다");
        System.out.println("직전 30초 영상과 함께 사고를 진행합니다.");
    }
}
