import java.util.*;
public class rotate90degree {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[i][n-j-1];
				arr[i][n-j-1]=temp;
			}

	}
		for(i=0;i<n;i++)
		{
			int start=0;
			int end=n-1;
			while(start<end)
			{
				int temp=arr[i][start];
				arr[i][start]=arr[end][i];
				arr[end][i]=temp;
				start++;
				end--;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
