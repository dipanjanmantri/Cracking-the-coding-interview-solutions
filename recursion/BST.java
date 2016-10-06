package recursion;


public class BST {

	public Node_2 root;
	public BST()
	{
		root=null;
	}
	
	int visit()
	{
		return root.getData();
	}
	
	public void add(int v)
	{
		root=add(root,v);
	}
	
	Node_2 add(Node_2 root, int v)
	{
		if(root==null)
		{
			root=new Node_2(v);
		}else if(v<root.getData())
		{
			root.left=add(root.left,v);
		}else if(v>root.getData())
		{
			root.right=add(root.right, v);
		}
		return root;
		
		
	}
}
