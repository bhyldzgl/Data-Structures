public class main {

    public static void main(String[] args) {
        
        
        Array array = new Array(5);
        
        array.print();
        array.add(4);
        array.print();
        array.add(8);
        array.print();
        array.add(2);
        array.print();
        array.add(5);
        array.print();
        array.add(1);
        array.print();
        
        array.delete(3);
        
        array.delete(2);
        array.print();
        
        array.upDate(8, 9);
        array.print();
       
    }
    
}
