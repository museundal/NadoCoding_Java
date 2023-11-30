package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        //이터레이터 , 컬렌션을 순회 하는 것 ,
        // 커서에 해당하는 글자를 차례로 가져 오는 것 , 필요없는 데이터라면 바로 삭제도 가능
        List<String> list = new ArrayList<>(); // List 는 인터페이스 ArrayList 는 클래스  , 다형성에 의해서 가능하다
        // List<String> list2 = new LinkedList<>(); 다형성에 의해서 가능하다
        //잘못된 데이터가 함께 들어와 버림
        list.add("아이유");
        list.add("(알수없음)");
        list.add("수지");
        list.add("(알수없음)");
        list.add("한지민");
        list.add("(알수없음)");
        list.add("전여빈");
        list.add("(알수없음)");
        list.add("박보영");

        for (String s : list
        ) {
            System.out.println(s);
        }
        System.out.println();
        //ctrl alt v  -> 변수 자동완성
        Iterator<String> iterator = list.iterator(); // 커서가 맨 앞으로 이동합니다.
        System.out.println(iterator.next());// 한칸씩 이동
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //hasNext() ->  데이터가 있냐 없냐 boolean 반환
        System.out.println();
        iterator = list.iterator(); // 커서를 다시 처음으로 이동
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        // 잘못된 데이터는 삭제
        iterator = list.iterator(); // 커서를 다시 처음으로 이동
        while (iterator.hasNext()) {
            String delete = iterator.next();
            if (delete.contains("(알수없음")) {
                iterator.remove();
            }
        }
        iterator = list.iterator(); // 커서를 다시 처음으로 이동, 작업을 수행하고 나면 커서가 맨 뒤에 있음
        System.out.println("데이터 필터링 후 ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        HashSet<String> set = new HashSet<>();
        set.add("조규성");
        set.add("손흥민");
        set.add("이강인");
        set.add("박지성");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("이강인", 10);
        // map.iterator(); 제공되지 않음
        map.keySet().iterator(); // 이건 가능 !
        map.values().iterator();
        Iterator<String> mapKey = map.keySet().iterator();
        while (mapKey.hasNext()) {
            System.out.println(mapKey.next());
        }
        System.out.println();

        Iterator<Integer> mapValues = map.values().iterator();
        while (mapValues.hasNext()) {
            System.out.println(mapValues.next());
        }
        System.out.println();
//키와 값 한번에 출력하기
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            System.out.println(entryIterator.next());
        }
        System.out.println();

    }
}
