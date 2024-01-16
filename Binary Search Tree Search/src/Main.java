public class Main {
 
    public static void main(String[] args) {
      
         BinarySearchTree binarySearchTree = new BinarySearchTree();
         
         binarySearchTree.add(30);
         binarySearchTree.add(20);
         binarySearchTree.add(15);
         binarySearchTree.add(40);
         binarySearchTree.add(50);
         binarySearchTree.add(45);
         binarySearchTree.add(38);
         binarySearchTree.add(12);
         binarySearchTree.add(18);
         
         System.out.println(binarySearchTree.search(12));
         System.out.println(binarySearchTree.search(38));
         System.out.println(binarySearchTree.search(30));
         System.out.println(binarySearchTree.search(35));
         
         
         
    }
    
}
