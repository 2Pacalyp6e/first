public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Snezhok");
        Dog dog = new Dog("Sharik");
        Dog dog1 = new Dog("Vulkan","orange",2);


//        Cat cat = new Cat();
//        Dog dog = new Dog();
//
//
//        dog.name = "sharik";
//        cat.name = "koshka";
        cat.jump();
        dog.run();
        dog.info();
        dog1.info();

        cat.voice();
        dog.voice();

        cat.liveCount = 2;
    }
}
