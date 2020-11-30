public class For
{
	public static void main(String[] args) {
		int j=2;
		for(int i=0;i<=9;i++)
		{
			if(i%j!=0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}