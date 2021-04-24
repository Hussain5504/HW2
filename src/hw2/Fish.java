package hw2;

public class Fish extends Animal {
    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender) {
        super(age, gender);
    }

    public int getSizeInFt() {
        return sizeInFt;
    }

    public void setSizeInFt(int sizeInFt) {
        this.sizeInFt = sizeInFt;
    }

    public boolean getCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    private void swim() {
        System.out.println("I can swim");
    }
}
