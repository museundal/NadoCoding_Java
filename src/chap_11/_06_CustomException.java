package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        //사용자 정의 예외
        //throw 보면 모든 예외를 Exception으로 하기엔 익셉션이 하는 일이 많아진다. 우리가 직접 예외를 만들자.
        int age = 17;
        try {
            if(age<19){
                // System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다."); // 예외 객체에 저장 , 예외가 발생했으니 catch 블록으로 이동
            }else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        }catch (AgeLessThan19Exception e){
            System.out.println("조금 더 성장한 뒤에 오세요");
        } catch (Exception e){
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}
class AgeLessThan19Exception extends Exception{
    public AgeLessThan19Exception(String message) { // 생성자 만들기를 누르면 선택할 수 있는게 여러개가 있다!
        super(message); //객체의 상위 클래스인 Exception 클래스의 생성자를 호출
    }
}
