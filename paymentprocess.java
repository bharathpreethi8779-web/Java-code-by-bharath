abstract class Payment {
    abstract void pay();
    void receipt() {
        System.out.println("receipt Generated");
    }
}

class upi extends Payment {
    void pay() {
        System.out.println("Paid Using upi");
    }
}

class card extends Payment {
    void pay() {
        System.out.println("Paid Using card");
    }
}


public class Main {
    public static void main(String[] args) {
        Payment p1 = new upi();
        p1.pay();
        p1.receipt();

        Payment p2 = new card();
        p2.pay();
    }
}
