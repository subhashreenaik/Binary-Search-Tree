package com.assignment.day15;
public class MainBinaryTree <K extends Comparable<K>> {
	
     Node<K> root;
     
     MainBinaryTree()
      {
    	 this.root=null;
      }
     
     /*This method is a recursive function to insert a new key in binary search tree
      * First it will check whether tree is empty or not.If it is empty,then it will return
      * new node.Otherwise it will recur down to tree.
      */
 	
     public Node<K> insert(Node<K> root,K x) 
 	 {
 		if (root == null)
 		{
         return new Node<>(x);
 		}
 		int y = x.compareTo(root.key);
 		if (y == 0)
 	       return root;
 	    if (y < 0)
 	        {
 	     	root.left = this.insert(root.left, x);
 	        } 
        else
        {
 	      	root.right = this.insert(root.right, x);
 	    }
 	    return root;
 	}
     
     
     /*This method print the binary tree in inorder manner */
     
    void inorderPrint(Node<K> root)
	  {
	        if (root != null)
	        {
	        	inorderPrint(root.left);
	            System.out.print(root.key+"  ");
	            inorderPrint(root.right);
	        }
	  }
    
    /*Add method is calling the insert method */ 
    void add(K key)
 	  {
 	     this.root = this.insert(root, key);
 	  }
    
    /*print method is calling the inorderPrint method */ 
 	void print() 
 	{ 
 		this.inorderPrint(root); 
 	}
	
	public static void main(String[] args) {
		/**
		* Main method for manipulation Binary search tree
		*
		*/
		/*
		* PROCEDURE
		* 1.Adding leaf to the binary tree
		* 2.Printing the binary tree in inorder manner
		*/
		
	MainBinaryTree<Integer> tree =new MainBinaryTree<Integer>();
	       tree.add(56);
	       tree.add(30);
	       tree.add(70);
	       tree.add(80);
	       tree.add(15);
	       tree.print();
           
	}

}
