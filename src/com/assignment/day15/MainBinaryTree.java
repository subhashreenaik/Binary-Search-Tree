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
     /*This method is a recursive function to search a  key in binary search tree
      * First it will check whether tree is empty or not.If it is empty,then it will return false value
      * If key of the root value is the key then it will return truee.Otherwise it will recur down to tree.
      * And each time it will go right or left tree and search the value.
      */
     public boolean searchLeaf(Node<K> root, K x)
	 {
	     
	     if (root==null) {
	    	 return false;
	         }
	     if	 (root.key==x) {
	         return true;
	         }
	     int y = x.compareTo(root.key);
	     if (y > 0)
	        return searchLeaf(root.right, x);
	        return searchLeaf(root.left, x);
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
 	
 	/*print method is calling the searchLeaf method */ 
 	public boolean search(K key)
 	{
		return this.searchLeaf(root, key);
		
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
		* 3.Searching leaf in the binary tree
		*/
		
	MainBinaryTree<Integer> tree =new MainBinaryTree<Integer>();
	       tree.add(56);
	       tree.add(30);
	       tree.add(70);
	       tree.add(80);
	       tree.add(15);
	       tree.print();
	       System.out.println();
	       System.out.println(tree.search(63));
           
	}

}
