package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2;

        while (move+height<distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리" + move);
            move+=3;
        }
        System.out.println("도착했습니다.");

        System.out.println("=======반복문 #2========");

        move=0;
        //do-while 반복문 do 영역은 최소 한번은 실행! 조건에 맞으면 반복
        do{
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 " + move);
            move+=3;
        }while(move + height <distance);{
            System.out.println("도착했습니다.");
        }
    }
}
