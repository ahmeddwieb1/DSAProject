import java.util.Scanner;

public class Array {
    private int lenght;
    private int size;
    public Node[] ptr;

    public Array(int arraysize) {
        ptr = new Node[arraysize];
    }

    Scanner sc = new Scanner(System.in);

    public boolean isempty(int index) {
        return ptr[index] == null;
    }

    //display array with linkedlist
    public void display2() {
        for (int x = 0; x < ptr.length; x++) {
            System.out.print("index " + x + ": ");
            Node temp = ptr[x];
            while (temp != null) {
                System.out.print(temp.Data + "->");
                temp = temp.Next;
            }
            System.out.println("null");
        }
    }

    public int search(int key) {
        int index = -1;
        for (int x = 0; x < lenght; x++) {
            if (ptr[x].equals(key))
                index = x;
        }
        return index;
    }


    public void insert(int index, int newitem) {
        Node newnode = new Node(newitem);
        Node temp =ptr[index];
        if (ptr[index] == null) {
            ptr[index] = newnode;
        } else {
            while (temp.Next!=null){
                temp= temp.Next;
            }
             temp.Next=newnode;
            newnode=null;
        }
    }

    public void delete(int index) {
        if (index > 0 && lenght < size) {
            for (int x = index; x < lenght; x++) {
                ptr[x] = ptr[x + 1];
            }
            lenght--;
        } else System.out.println("you can not");
    }
}
