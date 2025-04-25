import java.util.Scanner;

public class OpenHash {
    Array array = new Array(10);
    singleLinkedList list = new singleLinkedList();

    public void insert(int newitem) {
        int index = newitem % 10;
        if (array.isempty(index)) {
            array.insert(index, newitem);
        } else {
            list.inesrtFirst(newitem);
        }
    }

    public void display() {
        array.display();
        System.out.println();
        list.display();
    }
    Scanner sc = new Scanner(System.in);
    //if doc want insert value
    public void insertv2() {
        System.out.println("enter the number you want put Hash ");
        int newitem = sc.nextInt();
        System.out.println("enter the number you want mod it ");
        int theNumberyouwantmod = sc.nextInt();
        int index = newitem % theNumberyouwantmod;
        if (array.isempty(index)) {
            array.insert(index, newitem);
        } else {
            list.inesrtFirst(newitem);
        }
    }
}
