package algo;

public class Stack_implementation {

	public static void main(String[] args)
	{
		Stack stack=new Stack(10);
		stack.push("Hi");
		stack.push(",");
		stack.push("how are you");
		stack.push("I am good. How about you");
		stack.display();
	}
}
