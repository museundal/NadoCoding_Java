package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 : 많은 데이터를 효과적으로 관리 , 클래스들의 모음(List,Set,Map)
//        int[] array = new int[3];
//        array[0] = 1;
//        array[1] = 2;
//        array[3] = 3;
        //배열은 만들 때 크기가 고정이지만 컬렉션은 원하는 만큼 얼마든지 넣을 수 있다!
        ArrayList<String> list = new ArrayList<>();

        //데이터 주가
        list.add("유재석");
        list.add("최민호");
        list.add("황런쥔");
        list.add("이제노");
        list.add("정재현");
        System.out.println("=======================");
        //데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3)); // 이제노
        System.out.println(list.get(4));
        System.out.println("=======================");
        // 제노가 이사를 감 , 삭제
        System.out.println("신청 학생수 : " + list.size()); //5
        list.remove("이제노");
        System.out.println("남은 학생수 : " + list.size());//4
        System.out.println("=======================");
        System.out.println(list.get(3));
        list.remove(0);// 또는 인덱스로 삭제도 가능 // 3
        System.out.println("남은 학생수 : " + list.size());
        for (String student : list
        ) {
            System.out.println(student);
        }
        System.out.println("=======================");
        // 몇명인지는 모르겠다고 치고 만약에 마지막 학생을 뺀다면
        list.remove(list.size() - 1); // 2
        System.out.println("남은 학생수 : " + list.size());
        //순회
        for (String student : list
        ) {
            System.out.println(student);
        }
        System.out.println(list.get(1));
        System.out.println("=======================");
        // 변경  (바꿀 위치, 바꿀 데이터)
        list.set(1, "김기범");
        System.out.println(list.get(1));
        System.out.println("=======================");
        // 몇번째에 위치하고 있는지
        System.out.println(list.indexOf("최민호"));

        if(list.contains("김기범")){ // 김기범이라는 데이터를 가지고 있어?
            System.out.println("수강신청 성공");
        }else {
            System.out.println("수강신청 실패 ");
        }

        // 전체삭제
        list.clear();
        System.out.println("=======================");
        if(list.isEmpty()){
            System.out.println("비어 있어요" + list.size());
            System.out.println("리스트가 비어있어요");
        }
        System.out.println("=======================");

        // 다음 학기에 새로운 공부 , 근데 가나다 순으로 정렬
        list.add("김도영");
        list.add("서영호");
        list.add("이태용");
        list.add("이해찬");
        list.add("나재민");

        Collections.sort(list);
        for (String s : list
             ) {
            System.out.println(s);
        }




    }
}
