import java.util.Scanner;

class Animal {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(String food){
        System.out.println(this.name + " eats " + food + ". Nom nom nom.");
    }

    void getVoice(String voice){
        System.out.println(this.name + " says " + voice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class Mammal extends Animal {

    boolean egg_laying;

    public Mammal(String name, int age, int weight, boolean egg_laying) {
        super(name, age, weight);
        this.egg_laying = egg_laying;
    }

    void Swim (boolean canSwim){
        if (canSwim)
        {
            System.out.println(name + " can swim!");
        }
        else
        {
            System.out.println(name + " can't swim!");
        }
    }

    public boolean isEgg_laying() {
        return egg_laying;
    }

    public void setEgg_laying(boolean egg_laying) {
        this.egg_laying = egg_laying;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", egg_laying=" + egg_laying +
                '}';
    }
}

class Bird extends Animal {

    String featherColor;

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    void inPoland (boolean isInPoland){
        if (isInPoland)
        {
            System.out.println(name + " can be found in Polan!");
        }
        else
        {
            System.out.println(name + " can't be found in Polan!");
        }
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", featherColor='" + featherColor + '\'' +
                '}';
    }
}

class Fish extends Animal {

    String scalesColor;

    public Fish(String name, int age, int weight, String scalesColor) {
        super(name, age, weight);
        this.scalesColor = scalesColor;
    }

    void toxic (boolean isLeagueofLegendsPlayer){
        if (isLeagueofLegendsPlayer)
        {
            System.out.println(name + " is toxic and can kill you!");
        }
        else
        {
            System.out.println(name + " is not toxic and you can eat it!");
        }
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
