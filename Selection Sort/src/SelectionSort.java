import java.util.Arrays;

public class SelectionSort {
   
    int[] array;
    
    public SelectionSort(int[] d){
        array = d;
    }

 public void Sorting(){
        int min = 0; 
        int tmp = 0;
        
        for(int i = 0; i < array.length ; i++){
            min = i;
            
            for(int j = i+1 ; j < array.length ; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            
            if(min != i ){
                tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
        }  
    }
 
 public void print() {
        System.out.println(Arrays.toString(array));
    }
    
    
}
