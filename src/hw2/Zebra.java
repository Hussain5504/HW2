package hw2;

public class Zebra extends Animal {
    public boolean isWild;

    public Zebra(int age, String gender) {
        super(age, gender);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void run() {
        System.out.println("I can run");
    }
}
