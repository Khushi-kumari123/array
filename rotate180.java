import java.util.*;
public class rotate180 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int [n][m];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=n-1;j>=0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}


