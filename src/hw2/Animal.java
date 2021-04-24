package hw2;

public class Animal {
    public int age;
    public String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public void isMammal() {
        System.out.println("I am mammal");
    }

    public void mate() {
        System.out.println("I am mate");
    }

}