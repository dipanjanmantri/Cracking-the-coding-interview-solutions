package algo;

import java.util.Scanner;

public class Sort_array_ascending {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Stack_4 stack=new Stack_4(5);
		Stack_4 helper=new Stack_4(5);
		
		int temp;
		int temp1;
		int index=0;;
		
		for(int i=1;i<=stack.size;i++)
		{
			System.out.println("enter the number that you want to push");
			int num=s.nextInt();
			stack.push(num);
		}
		
		stack.display();
	    int max=stack.max();
	    //int v1=stack.size;
	    System.out.println(max);
	    
		temp=stack.pop();
		helper.push(temp);
		temp=stack.pop();
		if(temp>helper.arr[helper.top]){
			helper.push(temp);
		}else{
			temp1=helper.pop();
			helper.push(temp);
			helper.push(temp1);
			
		}
		
		helper.display();
		if(stack.arr[stack.top]>helper.arr[0]){
			index++;
		}
		if(stack.arr[stack.top]>helper.arr[helper.top]){
			index++;
		}
		if(index==0){
			temp=stack.pop();
			stack.push(helper.pop());
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			helper.push(stack.pop());
		}else if(index==1){
			temp=stack.pop();
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			
		}else if(index==2){
			helper.push(stack.pop());
		}
		
		helper.display();
		stack.display();
		index=0;
		int index1=0;
		if((stack.arr[stack.top])>helper.arr[index]){
			index1++;
		}
		if((stack.arr[stack.top])>helper.arr[++index]){
			index1++;
		}
		if((stack.arr[stack.top])>helper.arr[++index]){
			index1++;
		}
		
		if(index1==3){
			helper.push(stack.pop());
		}else if(index1==2){
			temp=helper.pop();
			helper.push(stack.pop());
			helper.push(temp);
		}else if(index1==1){
			temp=stack.pop();
			stack.push(helper.pop());
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			helper.push(stack.pop());
		}else if(index1==0){
			temp=stack.pop();
			stack.push(helper.pop());
			stack.push(helper.pop());
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			helper.push(stack.pop());
			helper.push(stack.pop());
		}
		
		helper.display();
		stack.display();
		
		index=0;
		index1=0;
		if(stack.arr[stack.top]>helper.arr[index]){
			++index1;
		}
		if(stack.arr[stack.top]>helper.arr[++index]){
			++index1;
		}
		if(stack.arr[stack.top]>helper.arr[++index]){
			++index1;
		}
		if(stack.arr[stack.top]>helper.arr[++index]){
			++index1;
		}
		
		if(index1==4){
			helper.push(stack.pop());
		}else if(index1==3){
			temp=helper.pop();
			helper.push(stack.pop());
			helper.push(temp);
		}else if(index1==2){
			temp=stack.pop();
			stack.push(helper.pop());
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			helper.push(stack.pop());
		}else if(index1==1){
			temp=stack.pop();
			stack.push(helper.pop());
			stack.push(helper.pop());
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			helper.push(stack.pop());
			helper.push(stack.pop());
			
		}else if(index1==0){
			temp=stack.pop();
			stack.push(helper.pop());
			stack.push(helper.pop());
			stack.push(helper.pop());
			stack.push(helper.pop());
			helper.push(temp);
			helper.push(stack.pop());
			helper.push(stack.pop());
			helper.push(stack.pop());
			helper.push(stack.pop());
		}
		
		stack.display();
		helper.display();
		
		
		//algorithm for the above code
		
		//int index2=0;
		//int index3=0;
        //int index4=0;
        //for(int i=1;i<=stack.size;i++)
        //{
        	//int k=0;
        	//while(k<=helper.top){
    			//if(stack.arr[stack.top]>helper.arr[k]){
    				//++index2;
    			//}
    			//k++;
    		//}
        	//while(k+1>=1){
        		
        	//}
        	
        //}
		
		
	}
}
