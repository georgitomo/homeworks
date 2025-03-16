package Homework6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(name + " barks.");
    }

    public void bringStick() {
        System.out.println(name + " is fetching.");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }
}

