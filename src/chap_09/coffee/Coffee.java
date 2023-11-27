package chap_09.coffee;

public class  Coffee<T> {
    public T name; //name 인데 어떤 타입일지 모른다.

    public Coffee(T name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + name);
    }
}
