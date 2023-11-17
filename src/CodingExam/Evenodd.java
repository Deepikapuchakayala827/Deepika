package CodingExam;

public class Evenodd 
{
	public static void main(String[] args)
	{
		int a[]=new int[]{1,3,2,4,5,2,8,0,1,0,3,7,8,9,0};
		{
		int Count=0;
		for(int i=0;i<=a.length;i++)
		{
			if(i%2==0)
			{
				Count++;
				System.out.println("Even numbers"+Count);
			}
			else if(Count==2)
			{
				System.out.println("odd numbers:"+Count);
			}
			else if(Count==0)
			{
				System.out.println("Zeroes:"+Count);
			}
		}
		}
	}
}


	


