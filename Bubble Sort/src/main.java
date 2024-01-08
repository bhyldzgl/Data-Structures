
import java.util.Random;

public class main {

    public static void main(String[] args) {
         
        
        int[] d = new int[10];
        
        Random r = new Random();
        
        for(int i = 0 ; i < 10 ; i++){
            d[i] = r.nextInt(100);
        }
        
        BubbleSort bubbleSort = new BubbleSort(d);
        
        bubbleSort.print();
        
        bubbleSort.Sort();
        
        bubbleSort.print();
        
        
        
    }
    
}
