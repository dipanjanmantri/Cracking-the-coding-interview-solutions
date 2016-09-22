package algo;

public class String_insertion {

	public static void main(String[] args)
	{
		String s="Hi there how are you    ";
		char[] c=s.toCharArray();
		
		int i=0;
		int j=0;
		int space=0;
		while(i<c.length)
		{
			if(c[i]==' ' && c[i+1]==' '){
				j=i;
				break;
			}
			i++;
		}
		
		char[] ch=new char[j];
		int x=0;
		while(x<ch.length)
		{
			ch[x]=c[x];
			x++;
		}
		String s1=new String(ch);
		
		int k1=0;
		while(k1<ch.length)
		{
			if(ch[k1]==' ')
			{
				space++;
			}
			k1++;
		}
		
		
		char[] ch1=new char[ch.length+space];
		int y=0;
		while(y<ch.length)
		{
			if(ch[y]!=' ')
			{
				ch1[y]=ch[y];
			}
			if(ch[y]==' ')
			{
				ch1[y]='%';
				
			}
			y++;
			
			
		}
		String s6=new String(ch1);
		System.out.println(s6);
		
	
	}
}
