package Practice;

public class Misc {

	static public void  main(String[] args) {
		
		
	}
	
	/* Reverse of a string  WO using string reverse*/
	public static void  stringRev()
	{
		String s1 = "System";
		String s2 = "";
		
		for(int i=1; i<=s1.length();i++) {
			s2= s2 + s1.charAt(s1.length()-i);
	}
		System.out.println(s2);
	}
	
	/* Reverse of an integer, using StringBuffer reverse */
	public static void intRev()
	{
		int num = 5789;
		int rev = 0;
	
	while (num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}			
	System.out.println(rev);
	}
	
	/* Removing the special characters using the regular expression*/
	public static void replaceSplChars()
	{
		String str = "<>?><Jaya";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	
	}
	
	/*Missing number in a sequence of array*/
	public static void missingNumber()
	{
		int n1[]= {1,2,4,5,6,7,8,9};
		int sum1 =0;
		int sum2 =0;
		int missing = 0;
		for (int i=0;i<n1.length;i++)
		{
			sum1 = sum1 + n1[i];
				
		}
		
		for (int i=n1[0];i<=n1.length+1;i++)
		{
			sum2 = sum2 + i;
					
		}
		
		missing = sum2-sum1;
		System.out.println(missing);
	}
	
	}


