package day14assignment.practiseproblem;



public class StackQueue {
    Node head;
    Node tail;
    Node top;

    public Node push(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node tempNode = head;
            this.head = newnode;
            newnode.next = tempNode;
        }
        top = head;
        return newnode;
    }

    public int peek() {
        System.out.println("\nTop element is " + this.top.data);
        return top.data;
    }

    public void poptillend() {
        Node temp = top;
        while (temp != null) {
            Node tempNode = this.head;
            this.head = tempNode.next;
            temp = temp.next;
        }
    }

    public void queue(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            top = head;
        } else {
            Node tempNode = tail;
            this.tail = newnode;
            tempNode.next = tail;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("\nStack list is Empty");
            return;
        } else {
            System.out.print("\n The stack elements are ");
            Node tempNode = head;
            while (tempNode != null) {
                if (tempNode.next != null) {
                    System.out.print(tempNode.data + " -> ");
                    tempNode = tempNode.next;
                } else {
                    System.out.print(tempNode.data);
                    tempNode = tempNode.next;
                }
            }
        }

    }

}
