package ProblemTwo;


public class DLinkedList implements MyList {
    public class Node {
        Object item;
        Node next;
        Node prev;
        int index;
    }

    int size = 1;
    Node head = new Node();

    public boolean insert(int index, java.lang.Object item) {
        if (index < 0 || index > this.size()) {
            return false;
        }
        if (index != this.size() && this.size() != -1) {
            Node n = new Node();
            n.item = item;
            n.next = head;
            n.prev = head.prev;
            head.prev.next = n;
        }
        size++;
        return true;
    }
    /* Checks if index is inside range if not returns false.
    Then checks if the index is the end and if the list is empty
    Then creates a node with the item as it's object it then sets the next pointer to the head and the previous pointer to the head's previous.
    It assigns the head.prev's next to the new node. Increases size*/
    //Time complexity is Θ(1)

    public boolean append(java.lang.Object item) {
        Node n = new Node();
        size++;
        n.next = null;
        n.prev = head;
        n.index = size();
        head.next = n;
        return true;
    }
    /* Creates a new node and extends the size first. Sets the next pointer of the new node to null
    Then sets the prev value of the new node to head. The index of this node is set to the new size
    The head's next pointer is then set to n*/
    //Time complexity is Θ(1)

    public void clear() {
        head.next = null;
        head.prev = null;
        head.item = null;
        size = 0;
    }
    /*Sets all pointers to tull and size to -1*/
    //Time complexity Θ(1)

    public boolean isEmpty() {
        if (this.size() == -1) {
            return true;
        } else {
            return false;
        }
    }
    /*Check with size() method and if -1 is returned then true is returned*/
    //Time complexity Θ(1)

    public int size() {
        if (size > 0) {
            return size;
        } else {
            return -1;
        }
    }
    //Returns size if not empty, returns -1 otherwise
    //Time complexity is Θ(1)

    public boolean replace(int index, java.lang.Object item) {
        if (index < 0 || index > this.size()) {
            return false;
        }
        if (index != this.size() && this.size() != -1) {
            head.item = item;
            head.index = index;
            return true;
        }else{
            return false;
        }
    }
    /* Checks if index is inside range if not returns false.
    Then checks if the index is the end and if the list is empty or not
    Then replaces node item and index with the given index and item from the parameters*/
    //Time complexity is Θ(1)

    public boolean remove(int index) {
        if(index > 0 && index < this.size()){
        head.prev.next = head.next;
        head.next.prev = head.prev;
        head = head.next;
        return true;
    }else{
        return false;
        }
    }
    /*Check if the removal integer is outside of range. Sets the head prev's next to the head's nexr
    Assign head next's previous to the head's previous
    Assign head to head's next*/
    //Time complexity is Θ(1)

    public java.lang.Object get(int index) {
        if(index > 0 && index < this.size()){
            Node node = head.next;
            for(int i = 0; i < index; i++){
                node = node.prev;
            }
            return node;
        }else {
            return null;
        }
    }
    /*Checks if index is inside range. Then creates new node and assigns head.next to it
    Created iteration until index which sets node to previous. At the end of lopp returns node which is at index*/
    //Time complexity is Θ(N)
}

