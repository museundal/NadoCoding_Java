package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //어레이 리스트는 만약에 긴 의자 중간에 누가 앉으려고 하면 그 기준으로 뒤에 있는 모든 사람들이 일어나서 이동해야함
        //링크드 리스트 의자 없이 사람들이 손을 잡고 서있어서  중간에 한명 들어오면 그냥 잡았던 손을 놓고 다시 손을 맞잡기만 하면 됩니다.
        // 리스트는 중복 데이터를 허용합니다.

        LinkedList<String> list = new LinkedList<>();
        list.add("아이유");
        list.add("뉴진스");
        list.add("태연");
        list.add("에스파");
        list.add("레드벨벳");

        //데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println();
        //데이터 추가
        list.addFirst("권진아");
        for (String s : list
             ) {
            System.out.println(s);
        }
        list.addLast("르세라핌");
        System.out.println();
        for (String s : list
        ) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("학생 추가 전 " + list.get(1));
        System.out.println("학생 추가 전 " + list.get(2));
        list.add(1,"소녀시대"); // 원하는 위치에 값을 넣기
        System.out.println("학생 추가 후 (인덱스 1) "+list.get(1));
        System.out.println("학생 추가 후 (인덱스 2) "+list.get(2));
        System.out.println();
        //데이터 삭제
        System.out.println("남은 학생 (제외 전) "+list.size());
        list.remove(list.size()-1); // 마지막 학생 지우기 , 또 다른 기능이 있음
        System.out.println("남은 학생 (제외 후) "+list.size());
        System.out.println();

        System.out.println();
        // 처음학생, 마지막 학생이 전학을 간다.
        System.out.println("남은 학생 (전학 전) "+list.size());
        for (String s : list
        ) {
            System.out.println(s);
        }
        System.out.println();
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 학생 (전학 후) "+list.size());
        for (String s : list
        ) {
            System.out.println(s);
        }
        System.out.println();
        // 수강권을 양도
        list.set(0,"블랙핑크");
        System.out.println("수강권을 양도 : " + list.get(0));

      if(list.contains("블랙핑크")){
          System.out.println(" 블랙핑크에게 양도 완료");
      } else {
          System.out.println("양도 실패");
      }

        // 확인하는 법
        System.out.println("태연의 자리는 몇번? "+ list.indexOf("태연"));

      // 전체 삭제
        list.clear();

      // 확인해보자
        if(list.isEmpty()){
            System.out.println("전체 학생 수 " + list.size());
        }
        System.out.println();
        // 새로운 학기가 시작 , ㄱㄴㄷ 순으로 정렬
        list.add("아이브");
        list.add("르세라핌");
        list.add("츄");
        list.add("트와이스");
        list.add("아이들");

        Collections.sort(list);
        for (String s : list
        ) {
            System.out.println(s);
        }

    }
}
