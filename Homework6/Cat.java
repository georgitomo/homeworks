package Homework6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(name + " meows.");
    }

    public void climb() {
        System.out.println(name + " is climbing.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing with another cat.");
    }
}

