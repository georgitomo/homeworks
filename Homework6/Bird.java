package Homework6;

public class Bird extends Animal {
    int numberOfBirds;

    public Bird(String name, int numberOfBirds) {
        super(name);
        this.numberOfBirds = numberOfBirds;
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(name + " chirps.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void sing() {
        System.out.println(name + " sings in a " + (numberOfBirds > 1 ? "rocking" : "normal") + "way!");
    }

    @Override
    public void play() {
        System.out.println(name + " flies in zig zag.");
    }
}

