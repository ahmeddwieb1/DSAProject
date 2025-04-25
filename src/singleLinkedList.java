public class singleLinkedList {
    Node Head;

    int counter = 0;
    boolean found = false;

    singleLinkedList() {
        Head = null;
    }

    boolean isempty() {
        return (Head == null);
    }

    void inesrtFirst(int newvalue) {

        Node newnode = new Node();
        newnode.Data = newvalue;
        if (Head == null) {
            newnode.Next = null;
            Head = newnode;
        } else {
            newnode.Next = Head;
            Head = newnode;
        }
        counter++;
    }

    void append(int newvalue) {
        Node newnode = new Node();
        newnode.Data = newvalue;
        if (Head == null) {
            newnode.Next = null;
            Head = newnode;
        } else {
            Node temp = Head;
            while (temp.Next != null) {
                temp = temp.Next;
            }
            newnode.Next = null;
            temp.Next = newnode;
        }
        counter++;
    }

    int count() {
        Node temp = new Node();
        while (temp != null) {
            counter++;
            temp = temp.Next;
        }
        return counter;
    }

    boolean isfound(int x) {

        Node temp = Head;
        while (temp != null) {
            temp = temp.Next;
            if (temp.Data == x) {
                found = true;
                break;
            }

        }
        return found;
    }

    void insertatpos(int pos, int newvalue) {
        Node newnode = new Node();
        newnode.Data = newvalue;
        Node temp = Head;
        if (pos > counter || pos < 0) {
            System.out.println("you can not ");
        }
        if (pos == 0) {
            inesrtFirst(newvalue);
            return;
        } else {
            for (int i = 1; i < pos - 1 && temp != null; i++) {
                temp = temp.Next;
            }
            newnode.Next = temp.Next;
            temp.Next = newnode;
        }
    }

    public void add(int data, int position) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (position == 0) { // If adding at the beginning
            newNode.Next = Head; // New node points to the current head
            Head = newNode; // Update head to the new node
        } else {
            Node current = Head; // Start from the head
            // Traverse to the node just before the desired position
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.Next;
            }
            if (current != null) { // If the position is valid
                newNode.Next = current.Next; // New node points to the next node
                current.Next = newNode; // Current node points to the new node
            }
        }
    }

    public void deleteAtPosition(int position) {
        if (Head == null) { // If list is empty
            System.out.println("List is empty");
            return;
        }
        if (position == 0) { // If deleting the first node
            Head = Head.Next;
        } else {
            Node current = Head;
            // Traverse to the node just before the desired position
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.Next;
            }
            if (current != null && current.Next != null) { // If position is valid
                current.Next = current.Next.Next;
            } else {
                System.out.println("Invalid position");
            }
        }
    }

    void insertbefore(int oldvalue, int newvalue) {
        //todo
        //        if (isfound(oldvalue)) {
        Node newnode = new Node();
        newnode.Data = newvalue;
        Node temp = Head;
        while (temp != null && temp.Next.Data != oldvalue) {
            temp = temp.Next;
        }
        newnode.Next = temp.Next;
        temp.Next = newnode;
        //todo
        //        }else {System.out.println("sorry item not found ");}
    }

    void delete(int delvalue) {

        Node temp = Head;
        Node prev = Head.Next;
        if (isfound(delvalue)) {
            if (temp != null) {
                while (temp.Next != null) {
                    while (temp.Next.Data != delvalue) {
                        temp = temp.Next;
                        prev = prev.Next;
                    }
                    temp.Next = prev.Next;
                }
            } else {
                System.out.println("sorry item not found ");
            }
        }
    }

    void inesrtLast(int newvalue) {
        Node newnode = new Node();
        newnode.Data = newvalue;
        if (isempty()) {
            Head = newnode;
            newnode.Next = null;
        } else {
            //todo
//            last.Next = newnode;
//            newnode.Next = null;
//            last = newnode;
        }
    }

    public int search(int index) {
        Node temp = Head;
        int pos = 0;
        while (temp != null) {
            if (temp.Data == index)
                return pos;
            temp = temp.Next;
            pos++;
        }
        return -1;
    }

    void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.Data + " ");
            temp = temp.Next;
        }
    }

}
