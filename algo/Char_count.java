package algo;

public class Char_count {

	public static void main(String[] args)
	{
		String s="apple";
		int i=0;
	    char[] c=s.toCharArray();
	    int[] count=new int[c.length];
	    while(i<c.length)
	    {
	    	int j=0;
	    	int x=1;
	    	while(j<c.length)
	    	{
	    		if(i==j)
	    			continue;
	    		if(c[i]==c[j]){
	    			x++;
	    		}
	    		j++;
	    	}
	    	count[i]=x;
	    	i++;
	    	
	    	System.out.print(x+" ");
	    }
	    
	    
	}
}
