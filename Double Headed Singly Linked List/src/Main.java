public class Main {
 
    public static void main(String[] args) {
        
        
           LinkedList linkedList = new LinkedList();
           
           Node n1 = new Node(2);
           Node n2 = new Node(26);
           Node n3 = new Node(7);
           Node n4 = new Node(9);
           Node n5 = new Node(3);
          
           
           linkedList.addHead(n1);
           linkedList.print();
           linkedList.addHead(n2);
           linkedList.print();
           linkedList.addHead(n3);
           linkedList.print();
           linkedList.addHead(n4);
           linkedList.print();
           linkedList.addHead(n5);
           linkedList.print();
           
           linkedList.deleteHead();
           linkedList.print();
           linkedList.deleteHead();
           linkedList.print();
           
           
           System.out.println("\n\n\n\n");
           
           LinkedList linkedList1 = new LinkedList();
           
           
           linkedList1.addEnd(n1);
           linkedList1.print();
           linkedList1.addEnd(n2);
           linkedList1.print();
           linkedList1.addEnd(n3);
           linkedList1.print();
           linkedList1.addEnd(n4);
           linkedList1.print();
           linkedList1.addEnd(n5);
           linkedList1.print();
           
           linkedList1.deleteEnd();
           linkedList1.print();
           linkedList1.deleteEnd();
           linkedList1.print();
           
        
    }
    
}
