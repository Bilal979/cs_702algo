import java.util.Arrays;
public class Threesum{

	public static int count(int[] a)
	{
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		In in=new In(args[0]);
		int [] a =in.readAllInts();
		Stopwatch obj=new Stopwatch();

		StdOut.println(count(a));
		StdOut.println("Time "+obj.elapsedTime());


	}
}