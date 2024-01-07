import java.util.Arrays;

public class Queue {
    
    int[] array;
    int nof;
    
    public Queue(int dimension){
        array = new int[dimension];
        nof = 0;
    }
    public void push(int number){
        if(nof >= array.length){
            System.out.println("Queue full ! ");
        } else {
            array[nof++] = number;
        }
    }
    
    public int pop(){
        int tmp = array[0];
        for(int i = 0 ; i < nof-1 ; i++){
            array[i] = array[i+1];
        }
        array[--nof] = 0;
        
        return tmp;
    }
    
    public void print(){
        System.out.println(Arrays.toString(array));
    }
     
}
