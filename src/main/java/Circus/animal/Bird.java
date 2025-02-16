package Circus.animal;

public class Bird extends Animal {
    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public String speak() {
        return "Chirp";
    }

    @Override
    public int getValue() {
        return 10;
    }
}
