package CodingExam;

public class Duplicate 
{
	public static void main(String[] args)
	{
		int a[]={1,4,2,6,8,2,3,1,3,5,1,2,1,4,5,1};
		{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int n=a.length;
		System.out.println("After removing duplicates");
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				System.out.print(a[i]+" ");
			}
			if(i==n-2)
			{
				if(a[n-2]!=a[n-1])
				{
					System.out.print(a[n-1]+" ");
				}
			}
		}
		}
	}

}
