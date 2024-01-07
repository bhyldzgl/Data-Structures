public class Array {

    int[] array;
    int nof;
    
       public Array(int dimension){
           
           array = new int [dimension];
           nof = 0;
       }
       
       
       public void add(int number){
           if(nof >= array.length){
               System.out.println("Series full !");
           } else {
               int i = 0;
               for(i = (nof - 1) ; i >= 0 && array[i] > number ; i-- ){
                   array[i+1] = array[i];             
               }
               array[i+1] = number;
               nof++;
           }
       }
       
       public int search(int number){
           for(int i = 0; i < nof ; i++){
               if(array[i] == number ){
                   return i;
               }
           }
           return -1;
       }
       
       public void delete(int number){
           
           int indis = this.search(number);
           if(indis == -1){
              System.out.println("The number you want to delete could not be found ! ");
                             
           } else {
               for(int i = indis ; i < nof - 1 ; i++ ){
                   array[i] = array[i+1];
               }
               array[--nof] = 0; 
           }
       }
       
       public void upDate(int number1, int number2){
           int indis = this.search(number1);
           if(indis == -1){
               System.out.println("The number you want to update could not be found ! ");
           } else {
               array[indis] = number2;
           }
       }
       
       public void print(){
           System.out.print("[ ");
           for(int i = 0 ; i < array.length ; i++){
               System.out.print(array[i] + " ");
           }
           System.out.println("] \n");
       }
}
