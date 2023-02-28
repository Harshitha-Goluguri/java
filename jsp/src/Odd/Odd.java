package Odd;
import java.util.Scanner;
public class Oddnewarray{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the elements");
			a[i]=sc.nextInt();
		}
		int count1=0;
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(a[i]==a[j]&&i>j)
				{
					break;
				}
				if(a[i]==a[j])
				{
					count++;
				}
			}
				if(count>0)
				{
					if(a[i]%2==1)
					{
					  count1++;
					}
				}
			}
				System.out.println("size of new array:");
				System.out.println(count1);
				int k=0;
				int[] b=new int[count1];
				for(int j=i; j>=0; j--)
					{
					 if(a[i]==a[j])
					 {
						 count++;
					 }
					 }
				if(count==1)
				{
				     if(a[i]%2==1)
					 {
						 b[k]=a[i];
						 k++;
					 }
					}
	}
	System.out.print("[");
					for(int l:b)
					{
						System.out.print(l +" ");
					}
					System.out.print("]");
		}
	}


