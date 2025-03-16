package Homework6;

public abstract class Animal implements IAnimal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " This animal is playing");
    }
}

