package algo;

public class Stack_5 {

	String[] s;
	int size;
	int top=-1;
	public Stack_5(int size)
	{
		this.size=size;
		s=new String[size];
	}
	
	void push(String str)
	{
		if(top+1>=size){
			System.out.println("sorry, stack is full");
		}else{
			++top;
			s[top]=str;
			
		}
	}
	String pop()
	{
		String str="";
		if(top<0){
			System.out.println("sorry stack is empty");
		}else{
			
			str=s[top];
			top--;
		}
		return str;
	}
}
