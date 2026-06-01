import java.util.*;
public class adddeletecol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
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
		int pos=sc.nextInt();
		int newcol[]=new int[n];
		for(i=0;i<n;i++)
		{
			newcol[i]=sc.nextInt();
		}
		int b[][]=new int[n][n+1];
		for(i=0;i<n;i++)
		{
			int k=0;
			for(j=0;j<n+1;j++)
			{
				if(j==pos)
				{
					b[i][j]=newcol[i];
				}
				else
				{
					b[i][j]=arr[i][k++];
				}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n+1;j++)
			{
				System .out.print(b[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
