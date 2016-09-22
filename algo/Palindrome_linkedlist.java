package algo;

public class Palindrome_linkedlist {

	public static void main(String[] args)
	{
		LinkedList a=new LinkedList(10,null);
		LinkedList temp=a;
		a.link=new LinkedList(20,null);
		a.link.link=new LinkedList(30,null);
		a.link.link.link=new LinkedList(30,null);
		a.link.link.link.link=new LinkedList(40,null);
		a.link.link.link.link.link=new LinkedList(10,null);
		
		a=temp;
		//boolean b=isPalindrome(a);
		
		//System.out.println(b);
		
		boolean b=true;
		
		int count=0;
		while(a!=null)
		{
			System.out.print(a.data+" ");
			a=a.link;
			count++;
		}
		System.out.println();
		System.out.println(count);
		
		int j=0;
		int[] arr=new int[count];
		
		a=temp;
		
		while(a!=null)
		{
			arr[j]=a.data;
			j++;
			a=a.link;
		}
		
		int k=0;
		while(k<arr.length)
		{
			System.out.print(arr[k]+" ");
			k++;
		}
		
		System.out.println();
		
		int m=arr.length-1;
		LinkedList end=new LinkedList(0,null);
		LinkedList temp1=end;
		while(m>=0)
		{
		    LinkedList end1=new LinkedList(arr[m],null);
		    end.link=end1;
		    end=end1;
		    m--;
		    
		}
		
		end=temp1;
		end=end.link;
		while(end!=null)
		{
			System.out.print(end.data+" ");
			end=end.link;
		}
		
		System.out.println();
		
		end=temp1;
		end=end.link;
		
		a=temp;
		
		int traverse=arr.length/2;
		int k4=0;
		
		while(k4<traverse)
		{
			if(a.data!=end.data)
			{
				b=false;
				break;
			}
			a=a.link;
			end=end.link;
			k4++;
		}
		
		
		System.out.println(b);
		
		
		
	}

	
		
		
}
