public class BinarySearchTree {
    
    Node root;
     
    public BinarySearchTree(){
         root = null;
    }
     
    public void add(int a){
        root = addRecursive(root,a);
    }
    
    public Node addRecursive(Node current,int a){
        
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
    
    public void print(){
        printRecursive(root,"");
    }
    
    public void printRecursive(Node current, String indent){
        System.out.println( indent + current.data );
        if( current.leftChild != null ){
            printRecursive(current.leftChild, indent + "    ");
        }
        if( current.rightChild != null ){
            printRecursive(current.rightChild, indent + "    ");
        }
    }
}
