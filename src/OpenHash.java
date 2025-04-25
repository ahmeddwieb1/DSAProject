import java.util.Scanner;

public class OpenHash {
    Array array;

    public OpenHash(int size) {
        array = new Array(size);
    }

    public OpenHash() {
         array = new Array(10);
    }



    public void insert(int newitem) {
        int index = newitem % 10;
        array.insert(index, newitem);

    }

    public void display() {
        array.display2();
    }

//    Scanner sc = new Scanner(System.in);
//
//    //if doc want insert value by scanner
//    public void insertv2() {
//        System.out.println("enter the number you want put Hash ");
//        int newitem = sc.nextInt();
//        System.out.println("enter the number you want mod it ");
//        int the_Number_you_want_mod = sc.nextInt();
//        int index = newitem % the_Number_you_want_mod;
//         array.insert(index, newitem);
//    }

}
