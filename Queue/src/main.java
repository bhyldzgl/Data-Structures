public class main {

    public static void main(String[] args) {
     
         Queue queue = new Queue(5);
         
         
         queue.push(5);
         queue.print();
         queue.push(4);
         queue.print();
         queue.push(7);
         queue.print();
         queue.push(2);
         queue.print();
         queue.push(9);
         queue.print();
         
         queue.pop();
         queue.print();
         queue.pop();
         queue.print();
         
    }
    
}
