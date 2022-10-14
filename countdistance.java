import java.util.*;
import java.io.*;

class countdistance
{
	public static void main(String ar[])
	{
		System.out.println("Enter amount in array : ");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int dis=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0],max=arr[0];
		for(int j=0;j<10;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		for(int k=0;k<10;k++)
		{
			if(arr[k]<min)
			{
				min=arr[k];
			}
		}
		dis=max-min;
		System.out.println("Your array distance is : "+dis);
	}
}