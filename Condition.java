public class Condition
{
	public static String xyz(String a)
	{
		String b="aeiou";
		if(a==b)
		{
			
			return ("All Vowel Words!");
		}
		else
		{
			
				return ("Not All Vowel Words!");
		}
	}

	public static void main(String[] args) {
		String a=args[0];
		String x=xyz(a);
		System.out.println(x);

	}
}