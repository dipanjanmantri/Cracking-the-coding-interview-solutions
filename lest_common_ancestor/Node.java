package lest_common_ancestor;


public class Node {

	public int data;
	public Node left;
	public Node right;
	
	public Node(){
		left=right=null;
		data=0;
	}
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	
	void setData(int v)
	{
		this.data=v;
	}
	
	public int getData()
	{
		return data;
	}
}
