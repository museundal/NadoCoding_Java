package chap_06;

public class _03_Return {
        //반환값이 있는 메소드 , 다양한 타입도 다 가능합니다~
    public static String getPhoneNumber(){
        String phoneNumber = "010-1234-0718";
        return phoneNumber;
    }
    public static String getAddress(){
        String address = "광주 어딘가";
        return address;
    }
    public static String getActivities(){
      return "동전노래방, 공원, 도서관";
    }
    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호는 " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소는 " + address);

        System.out.println("호텔 주변 시설은 " + getActivities());
    }
}
