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

    // Implementation of deletion of a node in a Linked List
    public void deleteNode(int pos){
        // Linked list is empty
        if(head == null){
            return;
        }
        
        Node temp = head;
        if(pos == 0){
            head = temp.next;
            return;
        }
        else{
            for(int i = 0; i< pos-1 && temp != null; i++){
                temp = temp.next;
            }
            if(temp == null && temp.next == null){
                return;
            }
            else{
                temp.next = temp.next.next;
                return;
            }
        }
    }

    // Implementation of reversal of nodes in a linked list
    public void reversell(){
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return;
    }

    // Reversal using Recursion
    public void reverseRec(Node current, Node prev){
        if(current.next == null){
            head = current;
            current.next = prev;
            return;
        }
        Node nextPtr = current.next;
        current.next = prev;
        reverseRec(nextPtr, current);
    }

    // Implementation to find the middle element in a linked list
    public void middleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element is : "+slow.data);
    }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    // Implementation of detectng loops in a linked list
    // Floyd's Cycle Detection Algorithm
    public void detectLoop(){
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Loop Detected");
        }
        else{
            System.out.println("No Loop Detected");
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(52);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);
        llist.insertAtEnd(19);
        llist.insertAtEnd(20);
        llist.insertAtEnd(30);
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
        System.out.println();

        llist.deleteNode(1);
        System.out.println("Linked List after sucessful deletion of a node");
        llist.printNodes();
        System.out.println();

        llist.reversell();
        System.out.println("Linked List after reversal");
        llist.printNodes();
        System.out.println();

        llist.middleNode();

        // creating a circular linked list
        // Node temp = llist.head;
        // while(temp.next != null){
        //     temp = temp.next;
        // }
        // temp.next = llist.head;
        llist.detectLoop();
    }
}