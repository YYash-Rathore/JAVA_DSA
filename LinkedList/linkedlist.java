class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // Insertion of the newNode at the very begining in the Linked List
    public void insertAtBegining(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Insertion of a newNode After any Node in a Linked List
    public void insertAfterNode(Node prev_node,int newData){
        if(prev_node == null){
            System.out.println("Please Enter a Valid Node as it contains null value");
        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        // Node temp = head;
        // while(temp.data != data){
        //     temp = temp.next;
        // }
        // newNode.next = temp.next;
        // temp.next = newNode;
    }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);
        llist.insertAtEnd(19);
        System.out.println("Linked List after successful insertion of all the nodes:");
        llist.printNodes();
        System.out.println();

        llist.insertAtBegining(10);
        System.out.println("Linked List after successful insertion of a node at begining");
        llist.printNodes();
        System.out.println();

        llist.insertAfterNode(llist.head.next.next, 9);
        System.out.println("Linked List after successful insertion after any node");
        llist.printNodes();
    }
}