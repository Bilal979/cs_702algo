import java.util.Arrays;

public class Quickunion{

	 int count;
	 int [] arr;

	public Quickunion(int n)
	{
		count=n;
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i;
		}
	}

	public void validate(int x)
	{
		if(x>=arr.length || x<0)
		{
			 throw new IllegalArgumentException("index " + x + " is not between 0 and " + (arr.length-1));
		}
	}

	public int find(int x)
	{
		validate(x);
		while(x!=arr[x])
		{
			x=arr[x];
		}
		return x;
	}

	public void union(int p, int q)
	{
		validate(p);
		validate(q);
		int rootp=find(p);
		int rootq=find(q);
		if(rootp==rootq)
		{
			return;
		}
		else
		{
			arr[rootp]=rootq;
			count--;
		}
	}
	
	public int count()
	{
		return count;
	}

	public static void main(String[] args) {
		int n=StdIn.readInt();
		Quickunion obj= new Quickunion(n);
		while(!StdIn.isEmpty())
		{
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			if(obj.find(p)==obj.find(q))
			{
				continue;
			}
			else
			{
				obj.union(p,q);
				StdOut.println(p + " " + q);
			}

		}
		StdOut.println(obj.count+ " components");
	}
}