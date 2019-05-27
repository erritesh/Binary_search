package org.binary;

public class BST {

	     private BSTNode root;
	     /* Constructor */
	     public BST()
	     {
	         root = null;
	     }
	     /* Functions to insert data */
	     public void insert(int data)
	     {
	         root = insert(root, data);
	     }
	     /* Function to insert data recursively */
	     private BSTNode insert(BSTNode node, int data)
	     {
	         if (node == null)
	             node = new BSTNode(data);
	         else
	         {
	             if (data <= node.data)
	                 node.left = insert(node.left, data);
	             else
	                 node.right = insert(node.right, data);
	         }
	         return node;
	     }
	     /* Function to return least value */
	     public int minValue()
	     {
	         return minValue(root);          
	     }
	     /* Function to return least value recursively */
	     
	     private int minValue(BSTNode r)
	     {
	         if (r.left == null)
	             return r.data;
	         return minValue(r.left);        
	     }

	 

	     public void inorder()
	     {
	         inorder(root);
	     }
	     private void inorder(BSTNode r)
	     {
	         if (r != null)
	         {
	             inorder(r.left);
	             System.out.print(r.data +" ");
	             inorder(r.right);
	         }
	     }

	     /* Function for preorder traversal */

	     public void preorder()
	     {
	         preorder(root);
	     }

	     private void preorder(BSTNode r)
	     {
	         if (r != null)
	         {
	             System.out.print(r.data +" ");
	             preorder(r.left);             
	             preorder(r.right);
	         }
	     }

	     /* Function for postorder traversal */

	     public void postorder()
	     {
	         postorder(root);
	     }

	     private void postorder(BSTNode r)
	     {
	         if (r != null)
	         {
	             postorder(r.left);             
	             postorder(r.right);
	             System.out.print(r.data +" ");
	         }

	     }     

	 }

	 
