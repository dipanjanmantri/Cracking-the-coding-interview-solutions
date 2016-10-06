package algo;

public class Stack_2_implementation {

	public static void main(String[] args)
	{
		Stack_2 stack=new Stack_2(6);
		stack.push(12);
		stack.push(14);
		stack.push(20);
		stack.push(24);
		stack.push(10);
		//stack.push(2);
		stack.push(44);
		
		int e=stack.min();
		System.out.println(e);
		stack.display();
		int x=stack.pop();
		System.out.println(x);
		System.out.println(stack.top);
		stack.display();
	}
}
