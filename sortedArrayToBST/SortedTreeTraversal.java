package sortedArrayToBST;

public class SortedTreeTraversal {

	public static Node sortedArrayToBST(int[] arr, int start, int end)
	{
		
		if(start>end)
			return null;
		int mid=(start+end)/2;
		
	    Node root=newNode(arr[mid]);
	    root.left=sortedArrayToBST(arr,start,mid-1);
	    root.right=sortedArrayToBST(arr, mid+1, end);
		return root;
		
		
			
	}
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8};
		int n=arr.length;
		Node root=sortedArrayToBST(arr,0,n-1);
		System.out.println("Pre-order");
		preOrder(root);
		
		
		
	}
	
	private static void preOrder(Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}

	public static Node newNode(int data)
	{
		Node node=new Node();
		node.data=data;
		node.left=null;
		node.right=null;
		return node;
	}
}
