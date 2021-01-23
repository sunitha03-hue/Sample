package technology;

public class Program {
    public static void main(String[] args) {
        Laptop l = new Laptop("HHH", "lll");
        l.wave();
        l.display();

        Smartphone s = new Smartphone("tamil", "kkk");
        s.wave();
        s.display();
    }
}