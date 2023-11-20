package Animal;

public class Pet {
    public static void makeDogSound(Dog dog) { // 인스턴스 생성하지 않고 클래스 레벨로 접근, public void 르 하려면 Pet pet = new Pet() 인스턴스 만들어서 접근해야함
        dog.speak();
    }

    public static void makeCatSound(Cat cat) {
        cat.speak();
    }

    public static void makeAnimalSound(Animal animal) {
        animal.speak();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        /* 이들을 전달 받아서 speak() 메소드를 호출하는 메소드를 만든다고 해보겠습니다.
        아마 아래와 같이 2개의 메소드를 만들어야 하겠죠.
        서로 다른 형태의 객체이기 때문에 메소드도 Dog, Cat 에 대해 각각 정의를 해야 하며,
        메소드를 호출할 때도 아래와 같이 dog, cat 에 대해 각각 다른 메소드를 호출하도록 해야합니다.
        */
        makeDogSound(dog);
        makeCatSound(cat);
        System.out.println("===================");

        //같은 상황에서 다형성을 이용하면 어떨까요?
        //dog 객체나 cat 객체 모두 Animal 이라는 클래스로 정의할 수 있습니다.
        //이 두 객체의 speak() 메소드를 호출하는 메소드는 아래와 같이 하나의 메소드로 충분할 겁니다.
        //다형성이 없었다면 동물이 추가될 때마다 똑같은 메소드를 수없이 추가해야 할 겁니다.
        // 메소드를 호출할 때도 신경을 써줘야 하구요. 하지만 다형성 덕분에 Animal 클래스를 상속하는 모든 클래스는
        // makeAnimalSound() 메소드 하나로 모두 같은 동작을 처리할 수 있습니다.

        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        makeAnimalSound(dog2);
        makeAnimalSound(cat2);


    }
}
