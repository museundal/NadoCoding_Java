package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 데이터가 흐른다,
        // 물이 들어오면 1차 필터, 2차필터를 거치는데 자바에서 스트림을 거치면 원하는 조건에 따라 필터링이 얼마든지 가능
        // 스트림은 1번만 사용 가능 !! , 다시 쓰려면 새로 만들어주세요 , 다시 만든다고 해서 원본데이터가 훼손되는게 아니니 맘껏 쓰세요
        // 데이터 가공이 편해집니다.
        // 스트림 생성 세가지 방법
        // 1. Arrays.stream 을 이용해서 만드는 방법
        int[] scores = {100, 95, 92, 85, 80, 75};
        IntStream scoreStream = Arrays.stream(scores);// 스트림 생성

        String[] langs = {"Java", "Python", "C#", "C", "JavaScript"};
        Stream<String> langStream = Arrays.stream(langs);

        //컬렉션도 스트림 생성 가능합니다.
        //2. Collection.stream()

        List<String> langList = new ArrayList<>();
        //langList.add("자바");
        // langList.add("파이썬");
        //초기화와 동시에 값을 넣는 방법, add가 된거와 똑같다
        langList = Arrays.asList("Java", "Python", "C#", "C", "JavaScript");
        System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();

        // 3. Stream.of() 로 스트림 만드는 방법
        Stream<String> langListOfStream = Stream.of("Java", "Python", "C#", "C", "JavaScript");

        // 스트림 사용방법
        //중간 연산 - Intermidiate Operation : filter, map , sorted, distinct, skip ...
        //최종 연산 - Terminal Operation  : count ,min , max, sum, forEach,anyMatch, allMatch ...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(num -> num > 90).forEach(num -> System.out.println("90점 이상인 점수 : " + num));
        Arrays.stream(scores).filter(num -> num > 90).forEach(System.out::println);
        System.out.println("--------------------------------");

        // 90점 이상인 사람의 수
        // long count = Arrays.stream(scores).filter(num->num>90).count(); // 반환형이 long이다.
        int count = (int) Arrays.stream(scores).filter(num -> num > 90).count(); // 반환형이 long이다.
        System.out.println(count + "명");
        System.out.println("--------------------------------");
        // 90점 이상인 사람들의 점수 합
        int sumScore = Arrays.stream(scores).filter(num -> num > 90).sum();
        System.out.println("점수 합은 : " + sumScore + "점");
        System.out.println("--------------------------------");
        // 80점 이상인 사람들의 점수 정렬
        Arrays.stream(scores).filter(num -> num >= 80).sorted().forEach(System.out::println);
        System.out.println("--------------------------------");
        //"자바", "파이썬", "C#", "C언어", "자바스크립트"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("--------------------------------");
        // Java 글자를 포함하는 경우
        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);
        System.out.println("--------------------------------");
        // 글자길이가 4 이하인 경우 이번엔 배열 말고 컬렉션으로 해보자~~
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("--------------------------------");
        // 4글자 이하인 경우에서 C를 포함하는 경우
        langList.stream() // 스트림 생성
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        // 4글자 이하인 경우에서 C를 포함하는게 있는지 알아보자
        //Java에서 스트림은 일회용으로 설계되었기 때문에, 한 번 사용된 스트림은 다시 사용할 수 없습니다.
        //       boolean anyMatch =  langListStream // 여기서 한번 스트림 사용해서 2번 못쓴다.
        //                .filter(x->x.length()<=4)
        //                .anyMatch(x->x.contains("C"));
        //        System.out.println(anyMatch);

        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);

        // 4글자 이하인 경우에서 모두 C를 포함하는게 있는지 알아보자
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("--------------------------------");
        // 4글자 이하의 언어들 중에서 C라는 글자를 포함한 언어 뒤에는 어려워요 라는 글자가 붙게 해보자
        // map ,  map 연산은 스트림의 각 요소에 함수를 적용하고, 그 결과로 새로운 스트림을 반환
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        // 결과물을 소문자로
        langList.stream()
                .filter(x -> x.contains("C"))
                .map(x -> x.toLowerCase())
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        // 가공된 데이터를 리스트로 저장해서 재사용하고 싶을 때 , J라는 언어를 포함하는 글자를 소문자로 저장
        List<String> newClangs = langList.stream()
                                .filter(x -> x.contains("J"))
                                .map(x -> x.toLowerCase())
                                .collect(Collectors.toList());

     newClangs.stream().forEach(System.out::println);


    }
}
