package breadth_first_search;

public class Node {

	int data;
	Node left;
	Node right;
	
	Node(){
		left=right=null;
		data=0;
	}
	
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	
	void setData(int v)
	{
		this.data=v;
	}
	
	int getData()
	{
		return data;
	}
}
