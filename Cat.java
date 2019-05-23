public class Cat extends Animals {
    int liveCount;

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String color, int age, int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;
    }

    @Override
    public void voice() {
        System.out.println("Meooooow");;
    }
}
