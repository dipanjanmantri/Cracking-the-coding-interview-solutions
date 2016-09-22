package algo;

public class LinkedList__number_addition {

	public static void main(String[] args)
	{
		
		
		LinkedList a=new LinkedList(3,null);
		LinkedList b=new LinkedList(2,null);
		LinkedList c=new LinkedList(1,null);
		
		LinkedList temp1=a;
		
		
		LinkedList d=new LinkedList(6,null);
		LinkedList e=new LinkedList(5,null);
		LinkedList f=new LinkedList(4,null);
		
		LinkedList temp2=d;
		
		int sum1=f1(a,b,c,d,e,f);
		
		LinkedList node=f2(a,b,c,d,e,f);
		
		
		a.link=b;
		b.link=c;
		
		d.link=e;
		e.link=f;
		
		System.out.println("The linked lists are: ");
		while(a!=null)
		{
			System.out.print(a.data+"---->");
			a=a.link;
		}
		System.out.println("null");
		
		System.out.println();
		
		while(d!=null)
		{
			System.out.print(d.data+"---->");
			d=d.link;
		}
		System.out.println("null");
		
		String s1="";
		String s2="";
		
		a=temp1;
		d=temp2;
		
		while(a!=null)
		{
			s1+=a.data;
			a=a.link;
		}
		
		while(d!=null)
		{
			s2+=d.data;
			d=d.link;
	    }
		
		System.out.println(s1+" "+s2);
		
		//int n1=s1.length()-1;
		//int n2=s2.length()-1;
		
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		
		int num1_temp=num1;
		int num2_temp=num2;
		
		int rev1=0;
		int rev2=0;
		
		while(num1!=0)
		{
			rev1=rev1*10;
			rev1=rev1+num1%10;
		    num1/=10;
			
					
		}
		

		while(num2!=0)
		{
			rev2=rev2*10;
			rev2=rev2+num2%10;
		    num2/=10;
			
					
		}
		
		System.out.println(rev1);
		
		System.out.println(rev2);
		
		System.out.println("The sum of the two numbers: "+(rev1+rev2));
		System.out.println("The sum of the numbers without reversing: "+(num1_temp+num2_temp));
		
		
		
		System.out.println(sum1);
		
		
		while(node!=null)
		{
		
			System.out.print(node.data);
		
			
			node=node.link;
			if(node==null)
			{
				break;
			}
			System.out.print("---->");
		}
		
		
		
	}

	private static LinkedList f2(LinkedList a, LinkedList b, LinkedList c, LinkedList d, LinkedList e, LinkedList f) {
		// TODO Auto-generated method stub
		
		a.link=b;
		b.link=c;
		
		d.link=e;
		e.link=f;
		
        int digit1=a.data+d.data;
		
		int carry=0;
		if(digit1>=10)
		{
			carry=digit1%10;
			digit1=digit1/10;
		}
		
		int digit2=b.data+e.data+carry;
		if(digit2>=10)
		{
			carry=digit2%10;
			digit2=digit2/10;
		}
		
		int digit3=c.data+f.data+carry;
		
		
		LinkedList l1=new LinkedList(digit1,null);
		LinkedList l2=new LinkedList(digit2,null);
		LinkedList l3=new LinkedList(digit3,null);
		
		l3.link=l2;
		l2.link=l1;
		
		return l3;
		
	}

	private static int f1(LinkedList a, LinkedList b, LinkedList c, LinkedList d, LinkedList e, LinkedList f) {
		// TODO Auto-generated method stub
		
		a.link=b;
		b.link=c;
		
		d.link=e;
		e.link=f;
		
		int digit1=a.data+d.data;
		
		int carry=0;
		if(digit1>=10)
		{
			carry=digit1%10;
			digit1=digit1/10;
		}
		
		int digit2=b.data+e.data+carry;
		if(digit2>=10)
		{
			carry=digit2%10;
			digit2=digit2/10;
		}
		
		int digit3=c.data+f.data+carry;
		
		String s6=""+digit3+digit2+digit1;
		
		int sum1=Integer.parseInt(s6);
		
		return sum1;
		
		
	}
}
