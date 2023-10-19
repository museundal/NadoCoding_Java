package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술연산자

        //일반연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);//2.5 가 아니라 2
        System.out.println(2/4); // 0.5 가 아니라 0  , 정수나누기 정수는 정수
        System.out.println(2/(float)4); // 0.5

        System.out.println(4%2); // 나머지 0
        System.out.println(5%2); // 나머지 0

        //우선 순위
        System.out.println(2+2*2);//6
        System.out.println((2+2)*2);//8
        System.out.println(2+(2*2));//6

        //변수를 이용한 연산
        int a =20;
        int b =10;
        int c;

        c=a+b;
        System.out.println(c);

        c=a-b;
        System.out.println(c);

        c=a/b;
        System.out.println(c);

        c=a*b;
        System.out.println(c);

        c=a%b;
        System.out.println(c);

        //증감연산 ++, --
        int val;

        val =10;
        System.out.println(val); //10
        System.out.println(++val);//11
        System.out.println(val);//11

        val =10;
        System.out.println(val); //10
        System.out.println(val++);//10
        System.out.println(val);//11

        val =10;
        System.out.println(val); //10
        System.out.println(val--);//10
        System.out.println(val);//9

        val =10;
        System.out.println(val); //10
        System.out.println(--val);//9
        System.out.println(val);//9

        //은행 대기번호 표

        int waiting = 0;
        System.out.println("대기인원 : " + waiting++); //0
        System.out.println("대기인원 : " + waiting++);//1
        System.out.println("대기인원 : " + waiting++);//2
        System.out.println("대기인원 : " + waiting++);//3
        System.out.println("총 대기인원 : " + waiting);//4



    }
}
