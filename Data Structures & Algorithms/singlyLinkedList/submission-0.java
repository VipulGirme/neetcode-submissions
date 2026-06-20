
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    private Node head;
    private int size;
    public LinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size)
           return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
        } else {
            Node curr = head;
              while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size)
        return false;

    if (index == 0) {
        head = head.next;
    } else {
        Node curr = head;
        // stop one before the node to remove
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        // unlink the next node
        curr.next = curr.next.next;
    }
    size--;
    return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list =  new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            list.add(curr.data );
            curr = curr.next;
        }
        return list;
    }
}
