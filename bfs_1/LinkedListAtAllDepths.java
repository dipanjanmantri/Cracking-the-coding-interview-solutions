package bfs_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import tree1.Node;

//import tree1.Node;



public class LinkedListAtAllDepths {

	public static void main(String[] args)
	{
		BST bst=new BST();
		bst.add(6);
		bst.add(2);
		bst.add(4);
		bst.add(1);
		bst.add(3);
		bst.add(7);
		bst.add(10);
		bst.add(9);
		bst.add(8);
		
		ArrayList<LinkedList<Node>> arr=result(bst.root);
		int i=0;
		while(i<arr.size())
		{
			int j=0;
			while(j<arr.get(i).size()){
				System.out.print(arr.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		
	}

	private static ArrayList<LinkedList<Node>> result(Node root) {
		// TODO Auto-generated method stub
		ArrayList<LinkedList<Node>> result=new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current=new LinkedList<Node>();
		
		if(root!=null){
			current.add(root);
			
		}
		while(current.size()>0){
			result.add(current);
			LinkedList<Node> parents=current;
			current=new LinkedList<Node>();
			for(Node parent:parents)
			{
				if(parent.left!=null){
					current.add(parent.left);
				}
				if(parent.right!=null){
					current.add(parent.right);
				}
			}
		}
		
		return result;
	}


	
}
