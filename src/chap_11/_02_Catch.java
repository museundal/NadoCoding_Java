package chap_11;

public class _02_Catch {
    public static void main(String[] args) {

        try {
            //System.out.println(3/0);
            //int[] arr = new int[3];
            //arr[5] = 100;
            // Object obj = "test";
            // System.out.println((int)obj);
            String s = null;
            s.toLowerCase();
        } catch (ArithmeticException e) { // 특정 예외에 대한 처리 !
            System.out.println("뭔가잘못 계산하셨네요");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 잘못 설정했어요 ");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형변환입니다.");
        } catch (Exception e) { // 예외들의 조상클래스인 Exception, 0번을 누르면 상담원 연결이라고 생각하면 편하다!
            System.out.println(e.getMessage());
            System.out.println("그 외의 모든 예외처리는 이곳에서 이뤄집니다.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        // 종류가 다른 예외처리도 묶을 수 있습니다.
        try {
            String s = null;
            s.toLowerCase();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ // 특정 예외에 대한 처리 !
            System.out.println("뭔가 실수 하셨네요");
        } catch(ClassCastException e){
            System.out.println("잘못된 형변환입니다.");
        } catch(Exception e){ // 예외들의 조상클래스인 Exception, 0번을 누르면 상담원 연결이라고 생각하면 편하다!
            System.out.println(e.getMessage());
            System.out.println("그 외의 모든 예외처리는 이곳에서 이뤄집니다.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
