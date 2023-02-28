package array;
import java.util.Scanner;
public class evenno {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the integer elements:");
			a[i]=sc.nextInt();
		}
		int count1=0;
		for(int i=0;i<size;i++)
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
		if(count>0) {
			if(a[i]%2==0)
			{
				count1++;
			}
		}
		
	}
	System.out.println("new array length is:"+count1);
	int[] b=new int[count1];
	int k=0;
	for(int i=0;i<size;i++) {
		int count=0;
		for(int j=1;j>=0;j++) {
			if(a[i]==a[j])
			{
				count++;
			}
			if(count==1) {
				if(a[i]%2==0) 
				{
				b[k]=a[i];
				k++;
			}
		}
	}
	System.out.println("[");
	for(int l:b)
	{
		System.out.println(l+"");
	}
	System.out.println("]");

		}
	}
