package bfs_1;



public class Node1 {

	int data;
	Node1 left;
	Node1 right;
	
	public Node1(){
		left=right=null;
		data=0;
	}
	
	Node1(int data)
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
