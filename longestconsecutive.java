import java.util.*;
public class longestconsecutive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxLen=1;
		int curlen=1;
		for(i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1]+1)
			{
				curlen++;
			}
			else
			{
				curlen=1;
			}
			maxLen=Math.max(maxLen,curlen);
		}
		System.out.println(maxLen);
		sc.close();
	}

}
