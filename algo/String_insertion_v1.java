package algo;

public class String_insertion_v1 {

	public static void main(String[] args)
	{
		String s="Hi there watsupp   ";
		char[] c=s.toCharArray();
		int i=0;
		int j=0;
		while(i<c.length)
		{
			if(c[i]==' ' && c[i+1]==' ')
			{
				j=i;
				break;
			}
			
			i++;
		}
	    char[] ch=new char[j];
	    int k=0;
	    while(k<j)
	    {
	    	ch[k]=c[k];
	    	k++;
	    }
	    
	    String s2=new String(ch);
	    System.out.println(s2);
	    int m=0;
	    int space=0;
	    char[] ch1={'a','b','c','d'};
	    while(m<ch.length)
	    {
	    	System.out.print(ch[m]);
	    	m++;
	    }
	    int m1=0;
	    while(m1<ch.length)
	    {
	    	if(ch[m1]==' ')
	    	{
	    		space++;
	    	}
	    	m1++;
	    }
	    System.out.println();
	    System.out.println("space "+space);
	    
	    int m2=0;
	    space+=4;
	    
	    
	    //char[] ch4=new char[len];
	    String sub3="";
	    while(m2<s2.length())
	    {
	    	
	    	int c1=s2.charAt(m2);
	    	if(c1==' ')
	    	{
	    		String s1=s2.substring(0,m2);
	    		int m3=m2;
	    		++m3;
	    		String s4=s2.substring(m3);
	    		s2=s1+"%20"+s4;
	    	}
	    	
	    	
	    	m2++;
	    	
	    }
	    
	    System.out.print(s2);
	    
			
	}
}
