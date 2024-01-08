import java.util.Arrays;

public class BubbleSort {
    
      int[] array;
      
      public BubbleSort(int[] array2){
          
          array = array2;
      }
      
       public void Sort(){
           int tmp = 0;
           boolean isSwapped = true;
           
           for(int i = 0 ; i< array.length && isSwapped ; i++){
               isSwapped = false;
               for(int j = 0 ; j < array.length - 1  ; j++){
                   if(array[j] > array[j+1]){
                       tmp = array[j];
                       array[j] = array[j+1];
                       array[j+1] = tmp;
                       isSwapped = true;
                   } 
               }
           }
       }
       
       public void print(){
           System.out.println(Arrays.toString(array));
       }
}
