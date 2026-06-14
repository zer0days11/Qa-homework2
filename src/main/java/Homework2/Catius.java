package Homework2;

public class Catius extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }

    public static void main(String[] args) {
        Catius catSound = new Catius();
        catSound.makeSound();
    }
}
