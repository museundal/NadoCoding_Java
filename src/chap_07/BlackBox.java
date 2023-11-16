package chap_07;

public class BlackBox {

    //static이 붙으면 클래스변수 , 클래스로부터 만들어지는 모든 객체에 똑같이 적용
    static boolean canAutoReport = false; // 자동신고기능
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 , 모든 객체에서 참고하는 변수
    // 4개의 인스턴스 변수 또는 필드
    String modelName;
    int price;
    String resolution; // 해상도
    String color;
    int serialNumber;

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다" + this.serialNumber);
    }

    BlackBox(String modelName, int price, String resolution, String color) { // 오버로드
//        this(); // 기본생성자의 동작을 수행 함!
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.price = price;
//        this.resolution = resolution;
//        this.color = color;
    }

    // 모든 객체에 공통적으로 사용되는 메소드
    static void callServiceCenter() {
        System.out.println("서비스 센터 1588 -0525 로 연결합니다.");
        //modelName = "test"; 인스턴스 변수는 객체가 만들어져야 만들어지기 떄문에 직접 접근이 불가능합니다.
        //canAutoReport =false; // 클래스변수는 바로 사용 가능
    }

    public void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동으로 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    //메소드 오버로드
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

//    void record() {
//        System.out.println("녹화를 시작합니다");
//        System.out.println("영상에 날짜정보가 표시됩니다.");
//        System.out.println("영상에 속도정보가 표시됩니다.");
//        System.out.println("영상은 5분 단위로 기록됩니다.");
//    }

    void record() {
        record(true, true, 5);
    }

    public void appendModelName(String modelName) {
        //modelName+=modelName , 이름이 똑같다 보니 전달받은 최신형 + 최신형 = ? 이 되버린다.
        //modelName+=modelName; // 까망이만 출력
        this.modelName += modelName;
        //클래스 인스턴스 변수 + 파라미터
    }

    //Getter & Setter


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 1000000;
        } else {
            this.price = price;
        }
    }

    public String getResolution() {

        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의 하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
