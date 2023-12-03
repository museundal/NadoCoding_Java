package chap_09;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        // Map 생성
        Map<String, Integer> fruitPrices = new HashMap<>();

        // 요소 추가
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        fruitPrices.put("Orange", 30);

        // 특정 키의 값 조회
        System.out.println("Apple의 가격: " + fruitPrices.get("Apple"));

        // Map에 있는 모든 요소 순회
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 키의 존재 여부 확인
        if (fruitPrices.containsKey("Grapes")) {
            System.out.println("Grapes의 가격: " + fruitPrices.get("Grapes"));
        } else {
            System.out.println("Grapes는 목록에 없습니다.");
        }

        // 값의 변경
        fruitPrices.put("Apple", 60); // "Apple"의 값을 60으로 변경

        // 키-값 쌍 삭제
        fruitPrices.remove("Orange"); // "Orange" 키-값 쌍을 삭제

        // 최종 Map 출력
        System.out.println("최종 목록: " + fruitPrices);
    }
}
