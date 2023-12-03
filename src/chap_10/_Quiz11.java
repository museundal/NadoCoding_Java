package chap_10;

import java.util.ArrayList;
import java.util.Arrays;

public class _Quiz11 {
    public static void main(String[] args) {
        ArrayList<Customer2> list = new ArrayList<>();
        list.add(new Customer2("챈들러",50));
        list.add(new Customer2("레이첼",42));
        list.add(new Customer2("모니카",21));
        list.add(new Customer2("벤자민",18));
        list.add(new Customer2("제임스",5));

        System.out.println("미술관 입장료");
        System.out.println("===========");
        // 삼항 연산자 이용
        list.stream().map(x-> x.age>=20? x.name + " 5000원" : x.name + " 무료" ).forEach(System.out::println);

    }
}
class Customer2{
    String name;
    int age;

    public Customer2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

