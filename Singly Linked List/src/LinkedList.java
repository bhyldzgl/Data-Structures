public class LinkedList {

    Node head; 
    int nof;
    
    public LinkedList(){
        head = null;
        nof = 0;
    }
    
    public void add(Node n){
        if(head == null){
            head = n;
        } else {
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = n;
        }
    }
    
    public void print(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data + " - ");
            tmp = tmp.next;            
        }
        System.out.println();
    }
    
}
