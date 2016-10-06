package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Union_array {

	//combines the arrays in a sorted order basically it does the union operation	
	public static void main(String[] args)
	{
		int[] a1={1,2,3,4,5};
		int[] b1={3,4,5,6,7};
		LinkedList<Integer> arr=new LinkedList<Integer>();
		int l1=a1.length;
		int l2=b1.length;
		int i=0,j=0;
		while(i<l1 && j<l2)
		{
			if(a1[i]<b1[j]){
				arr.add(a1[i]);
			}else if(a1[i]<b1[j]){
				arr.add(b1[j]);
			}else{
				arr.add(b1[j]);
			}
		}
		
		while(i<l1){
			arr.add(a1[i]);
		}
		while(j<l2){
			arr.add(b1[j]);
		}
		
		for(Integer k:arr)
		{
		   System.out.print(k.toString()+" ");	
		}
	}
}
