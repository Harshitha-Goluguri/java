package Num;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the elements:");
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
			count1++;
		}
		}
		System.out.println("enter the new array size");
		System.out.println(count1);
		int[] b=new int[count1];
		for(int j=i;j>=0;j--)
		{
			if(count==1)
			{
				count++;
			}
		}
		System.out.println(count1++);
		System.out.print("[");
		for(int  l : b){
			System.out.print(l +" ");
		}
		System.out.print("]");

	}

}
