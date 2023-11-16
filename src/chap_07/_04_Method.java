package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoReport();

        System.out.println("지원 후");

        BlackBox.canAutoReport =true;
        b1.autoReport();
        b1.insertMemoryCard(256);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반영상 파일수는 " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트영상 파일수는 " + fileCount + "개");

    }
}
