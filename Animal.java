abstract class Animal {
    abstract void Sound();
    void setup() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void Sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sound();
        d.setup(); 
    }
} 
