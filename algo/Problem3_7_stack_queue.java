package algo;

import java.util.Scanner;

public class Problem3_7_stack_queue {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Stack_5 dog1=new Stack_5(4);
		Stack_5 cat1=new Stack_5(4);
		Stack_5 dog2=new Stack_5(4);
		Stack_5 cat2=new Stack_5(4);
		Stack_5 animals1=new Stack_5(4);
		Stack_5 animals2=new Stack_5(4);
		
		char ch;
		while(true){
		
			System.out.println("enter 1 for enqueue 2 for dequeueAny 3 for dequeueDog and 4 dequeueCat and 5 for break");
			
			int op=s.nextInt();
			if(op==1){
				System.out.println("enter d for dog or c for cat");
				ch=s.next().charAt(0);
				if(ch=='d'){
					dog1.push("dog");
					animals1.push("dog");
					
				}else if(ch=='c'){
					cat1.push("cat");
					animals1.push("cat");
				}
			}else if(op==2){
				animals2.push(animals1.pop());
				String str=animals2.pop();
				if(str=="dog"){
					dog1.top--;
				}else if(str=="cat"){
					cat1.top--;
				}
				System.out.println(str);
			}else if(op==3){
				dog2.push(dog1.pop());
				System.out.println(dog2.pop());
			}else if(op==4){
				cat2.push(cat1.pop());
				System.out.println(cat2.pop());
			}
			else if(op==5){
				break;
			}
		}
		
		
	}
}
