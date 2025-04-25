public class Main {
    public static void main(String[] args) {
        OpenHash oh = new OpenHash();
        oh.insert(10);
        oh.insert(100);
        oh.insert(1);
        oh.insert(2);
        oh.insert(20);
        oh.insert(5);
        oh.insert(15);
        oh.insert(25);
        oh.insert(3);
        oh.insert(13);
        oh.display();
    }
}