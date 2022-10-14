import java.util.*;
import java.io.*;

class countdistance
{
	public static void main(String ar[])
	{
		System.out.println("Enter amount in array : ");
		Scanner sc=new Scanner(System.in); // use scanner to take array element from user
		int[] arr=new int[10]; // set array length 10
		int dis=0;
		for(int i=0;i<10;i++) // to take element for array from user
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0],max=arr[0]; // set default value for maximum and minimum value of the array
		for(int j=0;j<10;j++) // take array element one by one
		{
			if(arr[j]>max) // find maximum value of the array
			{
				max=arr[j];
			}
		}
		for(int k=0;k<10;k++) // take array element one by one
		{
			if(arr[k]<min) // find maximum value of the array
			{
				min=arr[k];
			}
		}
		dis=max-min; // after find maximun and minimum value find the distance of array
		System.out.println("Your array distance is : "+dis);
	}
}
