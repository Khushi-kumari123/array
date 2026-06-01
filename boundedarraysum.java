import java.util.*;
public class boundedarraysum {
public static void main(String args[])
{
	int r,c;
	Scanner sc=new Scanner(System.in);
	
	r=sc.nextInt();
	c=sc.nextInt();
	int arr[][]=new int[r][c];
	int i,j;
	System.out.println("array are..");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	int sum=0;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i==0||j==0||i==(r-1)||j==(c-1))
			{
				sum=sum+arr[i][j];
			}
		}
}
	System.out.println(sum);
	sc.close();
}
}
