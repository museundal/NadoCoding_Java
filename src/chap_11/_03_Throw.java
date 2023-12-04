package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
//        try{
//            System.out.println(3/0);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        // 때로는 우리가 원해서 에러를 낼 수도 있다.
        //미성년자에게 술을 팔 수가 없음 , 민증도 없고~
        //웹사이트 로그인 시도하려고 하는데 아이디를 찾을 수 없다고 예외 던지기
        int age = 17;
        try {
            if(age<19){
               // System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new Exception("만 19세 미만에게는 판매하지 않습니다.");  // 의도적으로 예외를 발생시킴, Exception을 던지면 catch 구문이 잡는다.
            }else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
