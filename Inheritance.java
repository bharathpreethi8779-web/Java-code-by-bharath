public class parent {
    void display() {
        System.out.println("This is the parent class");
    }

    public static void main(String[] args) {
        child obj = new child();
        parent ob = new parent();

        ob.display();
        obj.display();
    }
}

class child extends parent {
    void display() {
        System.out.println("This is the child class");
    }
}
