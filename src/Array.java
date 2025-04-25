import java.util.Scanner;

public class Array {
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    Scanner sc = new Scanner(System.in);
    private int lenght;
    private int size;
    private int[] ptr;

    public Array(int arraysize) {
        ptr = new int[arraysize];
        lenght = 0;
        size = arraysize;
    }

    public void fill() {
        System.out.println("how many item you want fill ");
        int NumOfFill = sc.nextInt();
        if (NumOfFill > ptr.length) {
            System.out.println("you can not");
            fill();
            return;
        } else {
            System.out.println("number of fill " + NumOfFill);
            System.out.println("length of pointer" + ptr.length);
            System.out.println("enter the number you want put in array ");
            for (int x = 0; x < NumOfFill; x++) {
                int i = sc.nextInt();
                ptr[x] = i;
                System.out.println("value of index: " + x + " is: " + ptr[x]);
                lenght++;
            }
        }
    }

    void display() {
        System.out.print("Array contents:");
        for (int x = 0; x < lenght; x++) {
            System.out.print(ptr[x] + " ");
        }
        System.out.println();
        System.out.println("array size :" + size + "length of array :" + lenght);
    }

    int search(int key) {
        int index = -1;
        for (int x = 0; x < lenght; x++) {
            if (ptr[x] == key)
                index = x;
        }
        return index;
    }

    void insert(int index, int newitem) {
        if (lenght < size) {
            for (int x = lenght; x > index; x--) {
                ptr[x] = ptr[x - 1];
            }
            ptr[index] = newitem;
            lenght++;
        } else System.out.println("you can not");
    }

    void delete(int index) {
        if (index > 0 && lenght < size) {
            for (int x = index; x < lenght; x++) {
                ptr[x] = ptr[x + 1];
            }
            lenght--;
        } else System.out.println("you can not");
    }
}
