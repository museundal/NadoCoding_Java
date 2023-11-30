package chap_09;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_09 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("김도연","파이썬"));
        list.add(new Student("이규희","자바"));
        list.add(new Student("김미리","자바"));
        list.add(new Student("이예진","자바스크립트"));
        list.add(new Student("김범수","C언어"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");
        for(Student student : list){
            if(student.certification.equals("자바") ){
                System.out.println(student.getName());
            }
        }
    }

    static class Student {
        public String name;
        public String certification;

        public Student(String name, String certification) {
            this.name = name;
            this.certification = certification;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCertification() {
            return certification;
        }

        public void setCertification(String certification) {
            this.certification = certification;
        }




    }
}
