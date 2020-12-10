import java.util.Arrays;
//import java.io.*;


public class Binarysearch
{
	public static int indexOff(int[] a,int key)
	{
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi)
		{
			int mid=lo+(hi-lo)/2;
			if(key<a[mid])
			{
				hi=mid-1;
			}
			else if(key>a[mid])
			{
				lo=mid+1;
			}
			else
			{
				return mid;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		In in=new In(args[0]);
		int[] allowlist= in.readAllInts();
		Arrays.sort(allowlist);

		while(!StdIn.isEmpty())
		{
			int key=StdIn.readInt();
			int x=Binarysearch.indexOff(allowlist,key);
			if(x==-1)
			StdOut.println(key+ " not found");
			else{
				StdOut.println(key+ " found at index "+x);
			}

			//if(Binarysearch.indexOff(allowlist,key)==1)
			//{
			//	StdOut.println(key);
			//}

		}

		
	}
}