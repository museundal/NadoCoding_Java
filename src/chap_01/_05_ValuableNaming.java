package chap_01;

public class _05_ValuableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        /* 1. 저장할 값에 어울리는 이름
         2. 밑줄(_), 문자 (a,b,c), 숫자 (123) 사용 가능 (공백 사용 불가)
         3. 밑줄 또는 문자로 시작 가능
         4. 한 단어 또는 2개 이상 단어의 연속
         5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
         6. 예약어 사용 불가 (public,static,void,int,double,float, ...)*/

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0 ;
        String s = "";
        String str = "";

        //입국신고서
        String nationality = "대한민국";
        String firstName = "시완";
        String lastName = "임";
        String dateOfBirth = "2001-12-31";
        String residentialAddress = "무슨 호텔";
        String purposeOfVisit = "관광";

        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";
        //String -flight_no_2 = "KE657";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1= "가방";
        String item2= "시계";
        //String 3item= "전자제품";

        final String CODE= "KR";




    }
}
