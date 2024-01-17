public class Node {

  int data;
  Node leftChild;
  Node rightChild;
  
   public Node(int a){
       
       data = a;
       rightChild = null;
       leftChild = null;
   }
   
   public String toString(){
       return "Node{" +
               "data=" + data +
               ", leftChild=" + leftChild +
               ", rightChild=" + rightChild +
               "'}'";
   }
}
