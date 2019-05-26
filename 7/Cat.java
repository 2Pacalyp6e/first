package cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
       plate.decreaseFood(10);
        System.out.println(name+" eat...");
    }

    public void fear(Dog dog) {
        System.out.println(name+ " fear! " + dog.getName());
    }
}
