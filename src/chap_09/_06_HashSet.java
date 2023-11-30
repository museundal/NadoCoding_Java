package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        //SET , 중복을 허용하지 않는다. 중복제거도 해줍니다. , 순서 고정도 안됩니다.

        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("제로콜라");
        set.add("소금");
        set.add("후추");
        set.add("깻잎");
        set.add("삼겹살");
        set.add("삼겹살");
        set.add("마늘");
        set.add("후추");
        //순회
        System.out.println("총 상품 수 : " + set.size());
        System.out.println();
        for (String s : set) {
            System.out.println(s);
        }

        //학인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println();
        // 삭제
        System.out.println("쇼핑 전 :" + set.size());
        set.remove("삼겹살");
        System.out.println("쇼핑 후 :" + set.size());
        System.out.println();
        //전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("다 먹었다");
        }
        // 세트는 중복허용 안하고 순서 보장 안함

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(127);
        intSet.add(9);
        intSet.add(1);
        intSet.add(1);
        intSet.add(1);
        intSet.add(1);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }
        System.out.println();
        // 순서를 보장하고 싶다
        HashSet<Integer> intSet2 = new LinkedHashSet<>();
        intSet2.add(1);
        intSet2.add(127);
        intSet2.add(9);
        intSet2.add(1);
        intSet2.add(1);
        intSet2.add(1);
        intSet2.add(1);
        intSet2.add(2);

        for (int i : intSet2) {
            System.out.println(i);
        }
    }
}
