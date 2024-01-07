public class main {
 
    public static void main(String[] args) {
         
         Array array = new Array(5);
         
         array.print();
         array.add(5);
         array.print();
         array.add(7);
         array.print();
         array.add(2);
         array.add(6);
         array.add(8);
         array.print();
         
         
         array.delete(6);
         array.print();
         
         System.out.println(array.search(3)); // Returns -1 because it is not in the array
         System.out.println(array.search(2));
    }
    
}
