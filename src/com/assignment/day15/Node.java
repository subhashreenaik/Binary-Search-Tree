package com.assignment.day15;

public class Node<K extends Comparable<K>> {
	
/*  Class containing left
    and right child of current node
    and key value*/	
 K key;
 Node<K> left,right;
 public Node(K x) {
	 this.key=x;
 }
 
 
}
