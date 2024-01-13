public class Main {
 
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        
        Node node = new Node(5);
        Node node1 = new Node(8);
        Node node2 = new Node(2);
        Node node3 = new Node(9);
        Node node4 = new Node(4);
        
        
        
        linkedList.print();
        linkedList.addInOrder(node);
        linkedList.print();
        linkedList.addInOrder(node1);
        linkedList.print();
        linkedList.addInOrder(node2);
        linkedList.print();
        linkedList.addInOrder(node3);
        linkedList.print();
        linkedList.addInOrder(node4);
        linkedList.print();
        
        linkedList.delete(8);
        linkedList.print();
        linkedList.delete(5);
        linkedList.print();
        
    }
    
}
