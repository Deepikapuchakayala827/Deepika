package CodingExam;

import java.util.Scanner;

public class Switch 
{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int a[]=new int[] {110,123};
		int a1[]=new int[] {124,675};
		{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				System.out.println("Enter the case:");
				int Add=Sc.nextInt();
				
			switch(Add)
			{
			case 1:
				System.out.println("Add Employee objects"+a[i]);
				break;
			case 2:
				System.out.println("Add student type objects:"+a[j]);
				break;
			default:
				System.out.println("No Data Found");
				break;
			}
			}
		}	
			
		}
	}

}
