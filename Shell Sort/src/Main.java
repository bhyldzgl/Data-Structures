import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {
        
        int[] array = { 5, 2 , 7 , 8 , 10 , 6};
        System.out.println(Arrays.toString(array));
        Main.shellSort(array);
        System.out.println(Arrays.toString(array));
     
    }
    
    public static void shellSort(int[] array){
        
        int tmp = 0;
        int i = 0 , j = 0;
        int gap = 0;
        
        for(gap = array.length ; gap > 0 ; gap /= 2 ){
            for( i = gap ; i < array.length ; i += gap){
                tmp = array[i];
                for( j = i ; j > 0 && array[j-gap] > tmp ; j -=gap ){
                
                  array[j] = array[j-gap];
                }
                array[j] = tmp;
            }
        }
    }
         
}
