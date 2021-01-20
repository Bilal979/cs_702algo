import java.util.Arrays;

public class Quickfind{
int [] id;
int count;

public Quickfind(int n)
{
	count=n;
	id=new int[n];
	for(int i=0;i<n;i++)
	{
		id[i]=i;
	}
	//return id[1];
	//StdOut.println(id[4]);
	
}

 public int count() {
        return count;
    }
 public int find(int x)
 {
 	validate(x);
 	return id[x];
 }

 public void validate(int x)
 {
 	int n=id.length;
 	if(x<0 || x>=10)
 	{
 		throw new IllegalArgumentException("index " + x + " is not between 0 and " + (n-1));
 	}
 	
 }

 


    public void union(int p,int q)
    {
    	validate(p);
    	validate(q);
    	int pid=id[p];
    	int qid=id[q];
    	if(pid==qid)
    	{
    		return;
    	}
    	else
    	{
    		for(int i=0;i<id.length;i++)
    		{
    			if(id[i]==pid)
    			{
    				id[i]=qid;
    				
    			}
 
    		}
    		count--;
    	}

    }
public static void main(String[] args) {
	int n=StdIn.readInt();
	Quickfind obj=new Quickfind(n);
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
		}
		//int a=obj.find(p);
		//int b=obj.find(q);
		//StdOut.println(a+" "+b);
		StdOut.println(p+" "+q);

	}
	int c=obj.count();
	StdOut.println(c+"components");


	
}

}