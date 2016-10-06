package sort;

import java.util.Scanner;

public class P11_1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[] a=new int[8];
		int[] b=new int[4];
		
		for(int i=0;i<4;i++)
		{
			int k=i+1;
			a[i]=k;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("enter the value ");
			int v=s.nextInt();
			b[i]=v;
		}
		
		merge(a,b,a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}

	private static void merge(int[] a, int[] b, int[] A) 
	{
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				break;
			index++;
		}
		
		//System.out.println(index);
		int l=index;
		int r=b.length;
		int i=0,j=0,k=0;
		while(i<l && j<r)
		{
			if(a[i]<b[j])
			{
				A[k]=a[i];
				i++;
			}
			else
			{
				A[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<l)
		{
			A[k]=a[i];
			i++;
			k++;
		}
		while(j<r)
		{
			A[k]=b[j];
			j++;
			k++;
		}
	}
}
