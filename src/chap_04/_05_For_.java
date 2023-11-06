package chap_04;

public class _05_For_ {
    public static void main(String[] args) {
        //반복문 사용 for
        /*
            for(선언; 조건; 증감){
                수행명령
            }
         */

        for(int i=0; i<8; i++){
            System.out.println("안녕하세요 NCT 드림입니다." + i);
        }

        //짝수만 출력
        for(int i =0;i<10;i++){
            if(i%2==0)
                System.out.print(i);
        }

        System.out.println();

        for(int i =0;i<10;i+=2){
            System.out.print(i);
        }

        System.out.println();

        //홀수만 출력
        for(int i =0;i<10;i++){
            if(i%2==1)
                System.out.print(i);
        }

        System.out.println();

        for(int i =1;i<10;i+=2){
            System.out.print(i);
        }

        System.out.println();

        //거꾸로 숫자 5 4 3 2 1
        for(int i =5;i>0;i--){
            System.out.print(i);
        }

        System.out.println();

        //1부터 10까지 수들의 합
        int sum = 0;

        for(int i =0; i<11 ; i++ ){
            sum+=i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
            System.out.println(sum);
        System.out.println();

        sum=0;
        for(int i =1; i <= 10 ; i++ ){
            sum+=i;
        }
        System.out.println(sum);

    }
}
