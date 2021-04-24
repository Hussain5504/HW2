package hw2;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(30, "Male");
        duck.swim();
        System.out.println(duck.getBeakColor());
        System.out.println(duck.getAge());
        Fish fish = new Fish(3, "Female");
        fish.isMammal();
        System.out.println(fish.getGender());
        System.out.println(fish.getAge());
        Zebra zebra = new Zebra(44, "Male");
        zebra.run();
        System.out.println(zebra.getGender());
        System.out.println(zebra.getAge());
    }
}
