package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class SetOfStacks {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int index=0;
		ArrayList<Stack_2> stack_pile=new ArrayList<Stack_2>();
		if(stack_pile.isEmpty())
		{
			Stack_2 stack1=new Stack_2(5);
			//index++;
			stack_pile.add(stack1);
			
		}
		
		
		while(true)
		{
			System.out.println("say if you would like to push to the top stack of the pile");
			char c=s.next().charAt(0);
			if(c=='y')
			{
				if(stack_pile.get(index).top>=stack_pile.get(index).size-1)
				{
					System.out.println("the top stack is full and we need to create another stack");
					stack_pile.add(new Stack_2(5));
					index++;
					System.out.println("enter the data that you want to push");
					int d=s.nextInt();
					stack_pile.get(index).push(d);
				}else{
					System.out.println("enter the data that you want to push");
					int d=s.nextInt();
					stack_pile.get(index).push(d);
				}
				
				
				
			}else{
				break;
			}
		}
		stack_pile.get(index).display();
		
		System.out.println("say if you want to perform pop opearation on a specific sub-stack");
		char ch1=s.next().charAt(0);
		if(ch1=='y')
		{
		   System.out.println("enter the index of the stack on which you want to perform pop");
		   int id=s.nextInt();
		   int n=popAt(id,stack_pile);
		   System.out.println(n);
		}
		
		
		
		
	}

	private static int popAt(int id, ArrayList<Stack_2> stack_pile) {
		// TODO Auto-generated method stub
		
		int n=stack_pile.get(id).pop();
		return n;
	}

	
}
