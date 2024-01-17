public class BinarySearchTree {
    
    Node root;
     
    public BinarySearchTree(){
         root = null;
    }
     
    public void add(int a){
        root = addRecursive(root,a);
    }
    
    private Node addRecursive(Node current,int a){
        
        if( current == null ){
            current = new Node(a);
            return current;
        } else if ( current.data > a ){
            current.leftChild = addRecursive(current.leftChild, a);
         } else if ( current.data < a ){
             current.rightChild = addRecursive(current.rightChild, a);
         }
        return current;
    }
    
    public Node search(int searchNumber){
        return searchRecursive(root, searchNumber);
    }
    
    private Node searchRecursive(Node current, int searchNumber){
        if( current == null ||current.data == searchNumber){
            return current;
        } 
        if( current.data < searchNumber){
            return searchRecursive(current.rightChild, searchNumber);
        }
        return searchRecursive(current.leftChild, searchNumber);
    }
    
    public void preOrder(){
        preOrderRecursive(root);
    }
    
    private void preOrderRecursive(Node current){
         
        if( current != null ){
            System.out.print(current.data + " ");
            preOrderRecursive(current.leftChild);
            preOrderRecursive(current.rightChild);
            
        }
    }
    
    public void inOrder(){
        inOrderRecursive(root);
    }
    
    private void inOrderRecursive(Node current){
          if( current != null ){
              inOrderRecursive(current.leftChild);
              System.out.print(current.data + " ");
              inOrderRecursive(current.rightChild);
          }
    }
    
    public void postOrder() {
        postOrderRecursive(root);
    }
    
    private void postOrderRecursive(Node current) {
        if ( current != null ) {
            postOrderRecursive(current.leftChild);
            postOrderRecursive(current.rightChild);
            System.out.print(current.data + " ");
        }
    }
    
    
    public void print(){
        printRecursive(root,"");
    }
    
    private void printRecursive(Node current, String indent){
        System.out.println( indent + current.data );
        if( current.leftChild != null ){
            printRecursive(current.leftChild, indent + "    ");
        }
        if( current.rightChild != null ){
            printRecursive(current.rightChild, indent + "    ");
        }
    }
}
