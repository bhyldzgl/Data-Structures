public class LinkedList {
    
    Node head;
    
    public LinkedList(){
        head = null;
    }
    
    public void addInOrder(Node n){
        if(head == null){
            head = n;
        } else if( head.data > n.data){
            n.next = head;
            head = n;
        } else {
            Node tmp = head;
            
            while(tmp.next != null && tmp.next.data < n.data){
                tmp = tmp.next;
            }
            n.next = tmp.next;
            tmp.next = n;
        }
    }
    
    public void delete(int n){
        if(head == null){
            System.out.println("This list is empty");
        } else if(head.data == n){
            head = head.next;
        } else {
            Node tmp = head;
            while(tmp.next != null){
                if(tmp.next.data == n){
                    tmp.next = tmp.next.next;
                }
                tmp = tmp.next;
            }
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
