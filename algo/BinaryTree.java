package algo;

import org.junit.Test;
import java.util.Scanner;

public class BinaryTree {

	static BinaryNode root;
	static BinaryNode focus;

	public static void main(String[] args){
		focus=root;
		Scanner s=new Scanner(System.in);
		System.out.println("say if you would like to add a node");
		char ch=s.next().charAt(0);
		if(ch=='A'){
			addNode(40);
		}
		root=focus;
		inOrderTraversal();
				
		
	}

	private static void inOrderTraversal() {
		
		while(root!=null){
			root=root.left;
			
		}
		
	}

	private static void addNode(int d) {
		if(root==null){
			 root=new BinaryNode(d);
		}else if(d<root.info){
		  root=root.left;
		  root.info=d;
		}else if(d>root.info){
			root=root.right;
			root.info=d;
		}
		
	}
}
