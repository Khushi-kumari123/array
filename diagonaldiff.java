import java.util.*;
public class diagonaldiff {

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
		int primary=0;
		int sec=0;
		for(i=0;i<n;i++)
		{
			primary=primary+arr[i][i];
			sec=sec+arr[i][n-1-i];
		}
		int diff=Math.abs(primary-sec);
		System.out.println(diff);
		sc.close();
	}

}
