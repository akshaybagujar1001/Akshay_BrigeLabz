package day14assignment.learningproblam;



public class LinkedList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next != null)
                    System.out.print(temp.data + " -> ");
                else
                    System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertInBetween(Node previousNode, Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }

    public Node pop() {
        Node tempNode = this.head;
        this.head = this.head.next;
        return tempNode;
    }

    public void popLast() {
        Node tempNode = head;
        while (!tempNode.next.equals(tail)) {
            tempNode = tempNode.next;
        }
        this.tail = tempNode;
        tempNode.next = null;
    }

    public void searchNode(int value) {
        Node tempNode = head;
        int index = 1;
        boolean flag = false;
        if (head == null)
            System.out.println("List is empty");
        else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    flag = true;
                    break;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        if (flag == true) {
            System.out.println("Value:" + value + " is present at index:" + index);
        } else {
            System.out.println("Element is not present");

        }
    }

    public Node insertAfter(int value, Node newNode) {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                if (temp.data == value) {
                    break;
                }
                temp = temp.next;

            }
            Node tempNodeNext = temp.next;
            temp.next = newNode;
            newNode.next = tempNodeNext;
        }
        return temp;
    }

    public void deleteNode(int value) {
        if (this.head == null) {
            System.out.println("LinkedList is empty ");
            return;
        }
        Node tempNode = head;
        while (tempNode.next.data != value) {
            tempNode = tempNode.next;
        }
        Node prevNode = tempNode;
        Node nextNode = prevNode.next.next;
        prevNode.next = nextNode;

    }

    public int size() {
        if (this.head == null) {
            System.out.println("Linked List is empty ");
            return 0;
        }
        Node tempNode = head;
        int size = 1;
        while (tempNode.next != null) {
            size++;
            tempNode = tempNode.next;
        }
        return size;
    }

    public void sort() {
        Node i = head, j = null;
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (i != null) {
            int flag = 0;
            j = i.next;
            while (j != null) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                    flag = 1;
                }
                j = j.next;
            }
            i = i.next;
        }

    }

}
