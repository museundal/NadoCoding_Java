package chap_09.coffee;

public class CoffeeByName {
    
    public Object name; // Integer, double, String, BlackBox 다 가능

    public CoffeeByName(Object name) {
        this.name = name;
    }
    
    public void ready(){ 
        System.out.println("커피 준비 완료 : " + name);
    }
}
