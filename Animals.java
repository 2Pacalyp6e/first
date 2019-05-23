public class Animals {
    String name;
    String color;
    int age;

    public Animals(){

    }

    public Animals(String name) {
        this.name = name;
    }

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void jump(){
        System.out.println(name + " jump...");
    }

    public void run(){
        System.out.println(name + " run...");
    }

    public void  voice(){
        System.out.println(name +" yeaahhooo");
    }

    public void info(){
        System.out.println(name+" "+color + " "+ age);
    }

}
