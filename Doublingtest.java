public class Doublingtest{

private static final int MAXIMUM_INTEGER = 1000000;


	public static double timetrial(int n)
		{
			int[] a=new int[n];
			for(int i=0; i<n; i++)
			{
				 a[i] = StdRandom.uniform(-MAXIMUM_INTEGER, MAXIMUM_INTEGER);
			}
			Stopwatch obj=new Stopwatch();
			Threesum.count(a);
			 double time=obj.elapsedTime();
			 return time;
		}


	public static void main(String[] args) {

		for(int n=250; true; n+=n)
		{
			double time=timetrial(n);
			StdOut.println(n+"  "+time);

		}
	}
}