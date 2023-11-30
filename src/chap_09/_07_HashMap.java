package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //map 키와 값 쌍으로 이루어진 형태 < 키, 밸류>
        // 열쇠와 사물함은 1대1 관계
        HashMap<String, Integer> map = new HashMap<>();

        //데이터 추가
        map.put("온유", 10);
        map.put("민호", 5);
        map.put("태민", 10);
        map.put("키", 5);
        map.put("종현", 5);
        System.out.println("총 고객수 : " + map.size());
        System.out.println();
        //조회 : 포인트소진
        System.out.println("포인트 조회 : " + map.get("온유"));
        System.out.println("포인트 조회 : " + map.get("태민"));
        System.out.println();
        // 확인
        if (map.containsKey("키")) {
            int point = map.get("키");
            map.put("키", ++point);
            System.out.println("키 님의 누적 포인트는 " + map.get("키"));
        } else {
            System.out.println("신규 등록 (포인트 1 )");
        }
        System.out.println();
        // 삭제
        map.remove("샤이니");
        System.out.println(map.get("샤이니")); // null
        System.out.println();
        //전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("폐업합니다 ㅠㅠ");
        }
        System.out.println();
        // 고객들이 다시 찾아옴
        map.put("온유", 10);
        map.put("민호", 5);
        map.put("태민", 10);
        map.put("태민", 10);
        map.put("태민", 10);
        map.put("키범", 5);
        map.put("키범", 10);
        map.put("키범", 50);
        map.put("종현", 5);

        // 고객님 성함 확인 , HASHMAP 중복 허용도 안되고 , 순서 보장도 안된다. 그저 값 업데이트
        for (String key : map.keySet()
        ) {
            System.out.println(key);
        }
        System.out.println();
        // 고객님 포인트 확인
        for (int value : map.values()
        ) {
            System.out.println(value);
        }
        System.out.println();

        // 키 & 값 함께 확인
        for (String key : map.keySet()
        ) {
            System.out.println("고객이름 : " + key + "\t포인트 : " + map.get(key));
        }
        System.out.println();

        // 순서 보장하고 싶으면 LinkedHashMap

        HashMap<String, Integer> map2 = new LinkedHashMap<>();

        //데이터 추가
        map2.put("태일", 10);
        map2.put("유타", 5);
        map2.put("쟈니", 10);
        map2.put("태용", 5);
        map2.put("도영", 5);
        map2.put("재현", 5);
        map2.put("정우", 5);
        map2.put("마크", 5);
        map2.put("해찬", 5);
        //keySet  키 값, 한번에 출력하기
        for (String key : map2.keySet()
        ) {
            System.out.println("고객이름 : " + key + "\t포인트 : " + map2.get(key));
        }
        System.out.println();

    }
}
