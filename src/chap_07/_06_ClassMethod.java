package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        BlackBox b2 = new BlackBox();
        // b1.callServiceCenter();
        // b2.callServiceCenter();
        BlackBox.callServiceCenter();
        String s = String.valueOf(3); // 바로 접근 가능한거 보니 클래스 메소드 구나 !
    }
}