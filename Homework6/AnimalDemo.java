package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        // Create one object of each type of animal
        Bird bird = new Bird("Chirpys", 2);
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Bengy");

        bird.play();
        bird.makeSomeNoise();
        bird.fly();
        bird.sing();

        cat.play();
        cat.makeSomeNoise();
        cat.climb();
        
        dog.play();
        dog.makeSomeNoise();
        dog.bringStick();
    }
}

