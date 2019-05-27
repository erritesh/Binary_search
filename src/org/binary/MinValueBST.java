package org.binary;

import java.util.Scanner;

public class MinValueBST {
	public static void main(String args[]) {
		
		
		
		
        Scanner scan = new Scanner(System.in);
        /* Creating object of BST */
        BST bst = new BST(); 
        System.out.println("Minimum Value of Binary Search Tree Test\n");          
        char ch;
        /*  Accept input  */
        do    
        {
            System.out.println("Enter integer element to insert");
            bst.insert( scan.nextInt() );                     
            /*  Display tree  */ 
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : "); 
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder(); 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y'); 
        System.out.println("\nMnimum value of the Binary Search Tree is : "+ bst.minValue());              
    }
}