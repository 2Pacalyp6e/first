public class Dog extends Animals {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
        color = "Brown";
    }

    public Dog(String name,String color, int age) {
        super(name,color,age);
    }

    @Override
    public void voice() {
        System.out.println("Ghaaaf");;
    }
}
