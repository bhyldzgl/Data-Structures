public class main {

     public static void main(String[] args) {
        
         stack Stack = new stack(5);
         
         Stack.push(5);
         Stack.print();
         Stack.push(6);
         Stack.print();
         Stack.push(8);
         Stack.print();
         Stack.push(2);
         Stack.print();
         Stack.push(7);
         Stack.print();
        
         Stack.pop();
         Stack.print();
         Stack.pop();
         Stack.print();
         
    }
       
    
}
