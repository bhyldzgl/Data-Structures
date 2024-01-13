public class LinkedList {
  
     Node head;
     Node tail;

    public LinkedList() {
          head = null;
          tail = null;
    }
     
   public void addHead(Node n){
       if(head == null){
           tail = n;
       } else {
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
               head = head.next;
           }
       } else {
           System.out.println("This list is empty !");
       }
   }
   
   public void addEnd(Node n) {
    if (head == null) {
        head = n;
        tail = n;
    } else {
        tail.next = n;
        tail = n;
        tail.next = null;  
    }
}


   
   public void deleteEnd(){
        if(head == null){
            System.out.println("This list is empty !");
        } else  {
            if( head == tail ){
                head = null;
                tail = null;
            } else {
                Node t = head;
                while(t.next != tail){
                    t = t.next;
                }
                t.next = null;
                tail = t;
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
