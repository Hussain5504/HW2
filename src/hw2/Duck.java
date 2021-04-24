package hw2;

public class Duck extends Animal {
    public String beakColor = "yellow";

    public Duck(int age, String gender) {
        super(age, gender);
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void quack() {
        System.out.println("I can quack");
    }
}
