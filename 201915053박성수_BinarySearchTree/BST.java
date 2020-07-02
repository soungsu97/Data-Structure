class TreeNode {
   char data; 
   TreeNode left; 
   TreeNode right;
}

class BinarySearchTree {
      private TreeNode root = new TreeNode();

      public TreeNode insertKey(TreeNode root, char x){
         TreeNode p = root; 
         TreeNode newNode = new TreeNode(); 
         newNode.data = x; 
         newNode.left = null; 
         newNode.right = null;
         //
         if(p == null)
            return newNode; 
         else if(newNode.data < p.data){
            p.left = insertKey(p.left, x); 
            return p;
         }
         else if(newNode.data > p.data){
            p.right = insertKey(p.right, x); 
            return p;
          }
         else return p;
      }
      
      public void insertBST(char x) {
         root = insertKey(root, x);
       }
      //

      public TreeNode searchBST(char x){
         TreeNode p = root; 
         while(p != null){
            if(x < p.data) p = p.left; 
            else if (x > p.data) p = p.right; 
            else return p;
         }
         return p;
      }

      public void inorder(TreeNode root){ 
         if(root != null) {
                inorder(root.left); System.out.printf(" %c", root.data);
                   inorder(root.right);
        }
      }
      //

      public void printBST(){
         inorder(root); 
         System.out.println();
      }

}  
//
public class BST<Key extends Comparable<Key>, Value> {
    public Node<Key, Value> root; 
    public Node<Key, Value> getRoot() { return root; } 
    public BST(Key newld, Value newName) {
       // BST ������ // get, put, min, delete Min, delete 
        root = new Node<Key, Value>(newld, newName);
  }
    public Value get(key k) {return get(root k);} 
    public Value get(Node<Key, Value> n, Key k) { 
       if (n == null) return null; 
       int t = n.getKey().compare To(k); 
       if (t > 0) return get(n.getLeft(), k);
       
       else if (t < 0)  return get(n.getRight(), k);

       else             return (Value) n.getValue(); // k$ 71! LS2

    }
    public void put(key k, Value v) {root = put(root, k, v);} 
    public Node<Key, Value> put(Node<Key, Value> n, Key k, Value v){
        if (n == null) 
            return new Node<Key, Value>(k, v); 

        int t = n.getKey().compareTo(k); 
        
    	if (t > 0) n.setLeft(put(n.getLeft(), k, v)); 
    	
    	else if (t < 0) n.setRight(put(n.getRight(), k, v)); 
    	
    	else n.setValue(v); 
    	return n;
    }

        public Key min() {
            if (root == null) return null;
            return (Key) min(root).getKey();} 
        private Node<Key, Value> min(Node<Key, Value> n) {
            if (n.getLeft() == null) return n; 
            return min(n.getLeft());
    }

        public void delete Min() {
        	if (root == null) System.out.println("empty Ʈ��");
        	root = delete Min(root);
        }
        public Node<Key, Value> delete Min(Node<Key, Value> n) {
        	if (n.getLeft() == null) return n.getRight(); 
        	
        	n.setLeft(delete Min(n.getLeft())); 
        	
        	return n;
        }
        public void delteMax() {
        	if (root == null) System.out.println("empty Ʈ��");
        	        root = delete Max(root);
        }
        private Node<Key, Value> delete Max(Node<Key, Value> n) { 
        	if (n.getRight() == null)
        	return n.getLeft(); 
        	n.setRight(deleteMax(n.getRight())); 
        	return n;
        }
        public void delete(key k) {root = delete(root, k);} 
        public Node<Key, Value> delete(Node<Key, Value> n, Key k) {
        	if (n==null) return null; 
        	int t = n.getKey().compareTo(k); 
        	if (t > 0) n.setLeft(delete(n.getLeft(), k)); 
        	
        	else if (t < 0) n.setRight(delete(n.getRight(), k)); 
        	
        	else { 
        	        if (n.getRight() == null) return n.getLeft();
        	        if (n.getLeft() == null) return n.getRight(); 
        	        Node<Key, Value> target = n; 
        	        n = min(target.getRight(); 
        	        
        	        n.setRight( delete Min(target.getRight())); 
        	        n.setLeft(target.getLeft());
        	}return n;
        }
        public void print(Node<Key, Value> root) {
        	System.out.printf("\ninorder:\n"); 
        	inorder(root);
        }
        	public void inorder(Node<Key, Value> n){ 
        		if (n != null) {
        	inorder(n.getLeft()); 
        	System.out.print(n.getKey() + " "); 
        	inorder(n.getRight()); 
        		}
        	}
        	}


class BST{ 
   public static void main(String args[]){
         BinarySearchTree bsT = new BinarySearchTree(); 
         bsT.insertBST('G'); 
         bsT.insertBST('T'); 
         bsT.insertBST('H'); 
         bsT.insertBST('D'); 
         bsT.insertBST('B'); 
         bsT.insertBST('M'); 
         bsT.insertBST('N'); 
         bsT.insertBST('A'); 
         bsT.insertBST('J'); 
         bsT.insertBST('E'); 
         bsT.insertBST('Q');
         //

         System.out.printf("WnBinary Tree >>> "); 
         bsT.printBST();

         System.out.printf("Is There \"A\" ? >>> "); 
         TreeNode p1 = bsT.searchBST('A'); 
         if(p1 != null)
            System.out.printf("Searching Success! Searched key : %c \n", p1.data); 
         else   
            System.out.printf("Searching fail!! There is no %c \n", p1.data);


         System.out.printf("Is There \"Z\" ? >>> "); 
         TreeNode p2 = bsT.searchBST('Z'); 
         if(p2 != null)
            System.out.printf("Searching Success! Searched key : %c \n", p2.data); 
         else
            System.out.printf("Searching fail!! \n");
         
         

    }
}
//

