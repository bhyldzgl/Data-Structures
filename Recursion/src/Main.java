public class Main {
   
    public static void main(String[] args) {
        
        
        System.out.println(fibonacci(9));
        
    }
    
    public static int fibonacci(int number){
        if( number == 1 )
            return 0;
        else if( number < 4 )
            return 1;
        
        return fibonacci(number-1)+fibonacci(number-2);
    }
    
}
