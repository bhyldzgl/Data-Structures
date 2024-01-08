
import java.util.Random;

public class main {

    public static void main(String[] args) {
        
        int[] d = new int[10];
        
        Random r = new Random();
        
        for(int i = 0 ; i < d.length ; i++){
            d[i] = r.nextInt(100);
        }
        
        InsertionSort insertionSort = new InsertionSort(d);
        
        insertionSort.print();
        insertionSort.Sort();
        insertionSort.print();
    }
    
}
