package algo;

public class String_compression {

	public static void main(String[] args)
	{
		StringCompression test = new StringCompression();

        test.compress("aabcccccaaa");
        test.compress("aaaaa");
        test.compress("aaaabbb");
        test.compress("aaabbbccc");
        test.compress("abc");
        test.compress("a");
        test.compress("");
	}
	
	
}
