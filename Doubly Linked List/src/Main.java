public class Main {
 
    public static void main(String[] args) {
         
         LinkedList linkedList = new LinkedList();
         
         Node node1 = new Node(5);
         Node node2 = new Node(8);
         Node node3 = new Node(3);
         Node node4 = new Node(7);
         Node node5 = new Node(4);
         
         linkedList.addHead(node1);
         linkedList.print();
         linkedList.addHead(node2);
         linkedList.print();
         linkedList.addHead(node3);
         linkedList.print();
         linkedList.addEnd(node4);
         linkedList.print();
         linkedList.addEnd(node5);
         linkedList.print();
         
         
         System.out.println("Delete Head");
         linkedList.deleteHead();
         linkedList.print();
         linkedList.deleteHead();
         linkedList.print();
         
         System.out.println("Delete end");
         linkedList.deleteEnd();
         linkedList.print();
         linkedList.deleteEnd();
         linkedList.print();
         
         
         
    }
    
}
