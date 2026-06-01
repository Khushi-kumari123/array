import java.util.*;
public class Leaderarray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
				System.out.println(max+" ");
			}
		}
		
		sc.close();
	}

}
