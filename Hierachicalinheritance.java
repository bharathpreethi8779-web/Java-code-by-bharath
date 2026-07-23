class Mydaddy {
    void display() {
        System.out.println("My father is a farmer");
    }
}

class mysister extends Mydaddy {
    void display() {
        System.out.println("My sister is a teacher");
    }
}

class me extends Mydaddy {
    void display() {
        System.out.println("I am a freelancer");
    }
}

public class Main { 
    public static void main(String[] args) {
        me obj = new me();
        obj.display();

        mysister sis = new mysister();
        sis.display();
        
        Mydaddy dad = new Mydaddy();
        dad.display();
    }
}
