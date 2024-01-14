public class LinkedList {
 
    Node head;
    Node tail;
     
     public LinkedList(){
         head = null;
         tail = null;
     }
     
    public void addHead(Node n){
        if(head == null){
            tail = n;
        } else {
            head.prev = n;
            n.next = head;
        }
        
        head = n;
    }
    
    public void deleteHead(){
        if(head != null){
            if(head == tail){
                head = null;
                tail = null;
            } else {
                head.next.prev = null;
                head = head.next;
            }
        } else {
            System.out.println("This list is empty ! ");
        }
    }
    
    public void addEnd(Node n){
        if(head == null){
            head = n;
        } else {
            tail.next = n;
            n.prev = tail;
        }
        
        tail = n;
    }
    
    public void deleteEnd(){
        if(head == null){
            System.out.println("This list is empty ! ");
        } else {
            if(head == tail){
                head = null;
                tail = null;
            } else {
                tail.prev.next = null;
                tail = tail.prev;
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
