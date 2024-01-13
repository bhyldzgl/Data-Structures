public class LinkedList {

   Node head;
   
      public LinkedList(){
          head = null;
      }
      
      public void addInOrder(Node n){
          if(head == null){
              head = n;
          } else if(head.data > n.data){
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

     public void print(){
         Node tmp = head;
         while(tmp != null){
             System.out.print(tmp.data + " - ");
             tmp = tmp.next;
         }
         System.out.println();
     }      
}
