import java.util.Arrays;

public class InsertionSort {
 
      int[] array;
      int n;
      
      public InsertionSort(int[] d){
          array = d;
          n = d.length;
      }
      
      public void Sort(){
          int t = 0 , i = 0 , j = 0;
          
          for(i = 0 ; i < n ; i++){
              t = array[i];
              
              for(j = i; j > 0 && array[j-1] > t ; j--){
                  array[j] = array[j-1];
               }
              array[j] = t;
          }
      }
      
      public void print(){
          System.out.println(Arrays.toString(array));
      }
}
