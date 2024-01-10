public class main {
 
    public static void main(String[] args) {
     // This project was added to the linked list in the order we added it.   
        LinkedList linkedList = new LinkedList();
        
        Node n1 = new Node(5);
        Node n2 = new Node(4);
        Node n3 = new Node(9);
        Node n4 = new Node(2);
        
        linkedList.print();
        linkedList.add(n1);
        linkedList.print();
        linkedList.add(n2);
        linkedList.print();
        linkedList.add(n3);
        linkedList.print();
        linkedList.add(n4);
        linkedList.print();
        
    }
    
}
