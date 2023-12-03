package chap_10;

public class _Quiz_10 {
    public static void main(String[] args) {
    Customer customer = new Customer();
    customer.calculateFee("벤자민",25);

    }
}
class Customer{
    String name;
    int age;

    void calculateFee(String name,int age){
        int fee = 5000;
        if(age>=20){
            System.out.println(name+" "+ fee+"원");
        }else
            System.out.println(name+" "+ "무료");
    }
}
