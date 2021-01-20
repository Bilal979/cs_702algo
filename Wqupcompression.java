import java.util.Arrays;
public class Wqupcompression{

	public int count;
	public int [] arr;
	public  int [] size;

	public Wqupcompression(int n)
	{
		
		count=n;
		arr=new int[n];
		size=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=i;
			size[i]=1;
		}
	}

	public int count()
	{
		return count;
	}

	public void validate(int x)
	{
		if(x<0 || x>=arr.length)
		{
			throw new IllegalArgumentException(x+" is not between 0 and "+arr.length);
		}
	}

	public int find(int x)
	{
		validate(x);
		while(x!=arr[x])
		{
			arr[x]=arr[arr[x]];
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
		else if(size[rootp]<size[rootq])
		{
			arr[rootp]=rootq;
			size[rootq]+=size[rootp];
		}
		else
		{
			arr[rootq]=rootp;
			size[rootp]+=size[rootq];
		}
		count--;

	}


	public static void main(String[] args) {
		int n = StdIn.readInt();
		Wqupcompression obj= new Wqupcompression(n);
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
				StdOut.println(p+" "+q);
			}
		}

		StdOut.println(obj.count()+" Components");

	}
}