package cats;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Kuki");
        Plate plate = new Plate(100);

        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);

        Dog dog = new Dog("Sobaken");
        dog.voice(cat);

        Dog dog1 = new Dog("Sharik");
        dog1.voice(cat);

    }

}
