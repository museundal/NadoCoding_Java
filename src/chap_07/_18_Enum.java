package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형 Enum
        //달력 : JAN FEB MAR
        //옷 사이즈 : S M L
        //OS 종류 :  Window Mac Linux

        Resolution resolution = Resolution.HD;
        //resolution 이라는 열거형은 HD 라는 값을 갖게된다.
        System.out.println(resolution); // HD

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        // 파일에서 데이터를 읽어온다고 생각해보자
        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for (Resolution myRes : Resolution.values()
        ) {
            System.out.println(myRes.name() +" : "+ myRes.ordinal());
        }

        System.out.println("==============");
        for (Resolution myRes:Resolution.values()) {
            System.out.println(myRes.name()+" : "+myRes.getWidth());
        }

    }
}
//Java에서 enum은 특별한 타입의 클래스
enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
