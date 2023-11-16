package chap_07;
public class _10_AccessModifier {
    public static void main(String[] args) {
        //접근 제어자
        /*
        캡슐화 : 서로 연관된 것들만 모아 놓는다.
        정보은닉 : 아무나 접근하지 못하도록 해야함, 객체에서 허용해주는 형태 혹은 메서드만 접근 하도록 해야합니다 -> 접근제어자, 게터세터
        private : 해당 클래스내에서만 접근 가능
        public : 모든 클래스에서 접근 가능
        default : (아무 것도 적지 않을 때 ) 같은 패키지 내에서만 접근 가능
        protected : 같은 패키지 내에서 , 다른 패키지인 경우 자식 클래스에서 접근 가능

          변수, 메서드 , 클래스 다 접근 제어자 가능합니다~
        * */

       BlackBoxRefurbish b1 = new BlackBoxRefurbish();

        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.setPrice(20000);
        b1.color = "Black";

        b1.setPrice(-5000); // 할인행사인데 잘못 입력함 , 5천원을 주게 생김
        System.out.println("가격 : " + b1.getPrice());

        //고객문의
        System.out.println("해상도 : " + b1.resolution); // 올바른 답변이 안되는 경우 !!

        System.out.println("==========================");
        /*b1 블랙박스는 이미 실수니 , 새로운 객체를 만들자*/
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("캐스퍼");
        b2.setPrice(-50000);
        b2.setColor("하양이");

        System.out.println("가격 : "+ b2.getPrice());
        System.out.println("해상도 : " + b2.getResolution());
    }
}
