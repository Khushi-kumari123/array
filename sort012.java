import java.util.*;
public class sort012 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int c=sc.nextInt();
	int arr[][]=new int[r][c];
	int i,j;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	int zero=0,one=0,two=0;
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(arr[i][j]==0)
			{
				zero++;
			}
			else if(arr[i][j]==1)
				one++;
			else
				two++;
			
		}

	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(zero>0)
			{
				arr[i][j]=0;
				zero--;
			}
			else if(one>0)
			{
				arr[i][j]=1;
				one--;	
			}
			else
			{
				arr[i][j]=2;
				two--;
			}
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
	sc.close();
	}
}
