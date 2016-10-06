package recursion;



public class Node_2 {

	public int data;
	public Node_2 left;
	public Node_2 right;
	
	public Node_2(){
		left=right=null;
		data=0;
	}
	
	public Node_2(int data)
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
