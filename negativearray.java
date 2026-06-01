import java.util.*;
public class negativearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i+=2)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=-arr[i][j];
			}
		}
		for(j=0;j<n;j++)
		{
			
				int temp=arr[0][j];
				arr[0][j]=arr[n-1][j];
				arr[n-1][j]=temp;
				
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
