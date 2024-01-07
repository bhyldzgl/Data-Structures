import java.util.Arrays;
public class stack {

     int[] array;
     int nof;
     
     public stack(int dimension){
         array = new int[dimension];
         nof = 0;
     }
     
     public void push(int number){
         if(nof == array.length){
             System.out.println("Stack full ! ");
         } else {
             array[nof++] = number;
         }
     }
     public int pop(){
         int tmp = array[nof-1];
         
         array[--nof] = 0;
         
         return tmp;
     }
     
     public void print(){
         System.out.println(Arrays.toString(array));
     }
}
