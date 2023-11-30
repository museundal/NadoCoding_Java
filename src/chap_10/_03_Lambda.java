package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        //람다식
        //(전달값1...)-> { 코드 정의}





    }
//    public void print(){
//        String s = "test";
//        System.out.println(s);
//    }
    //람다식은 접근제어자, 이름이 필요없음 , 리턴타입도 자동으로 전해줘서 void 도 필요없음
//      ()->{
//        String s = "test";
//        System.out.println(s);
//    }
//    public void print(String s){
//        System.out.println(s);
//    }

//    (String s) ->
//        System.out.println(s); // 한줄 일때는 중괄호 필요 없음

    // (String s) -> System.out.println(s) // 세미콜론도 필요없음 한줄일떄는

    //  (s) -> System.out.println(s) // 전달 되는 값이 String 이라는걸 컴파일러가 미리 알 수 있어서 생략 가능
    //  s -> System.out.println(s) // 전달값이 1개면 () 도 생략 가능 !

//    public int add(int x ,int y) {
//        return x+y;
//    }
//    (x,y) -> {
//        return x+y;
//    }  리턴이 포함되면 { } 중괄호 생략 안됩니다 !!!

    //   (x,y) -> x+y  // return 없애고 {} 없앨 수 있습니다.


}
