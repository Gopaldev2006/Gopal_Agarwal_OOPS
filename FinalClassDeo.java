final class Vehicle {
    public void display() {
        System.out.println("This is a final class Vehicle.");
    }
}

public class FinalClassDeo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}
