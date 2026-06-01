import java.util.*;
public class frequencysort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int maxfreq=0;
		for(i=0;i<n;i++)
		{
			int count=1;
			int j=i+1;
			while(j<n && arr[j]==arr[i])
			{
				count++;
				
				j++;
			}
			maxfreq=Math.max(maxfreq, count);
			i=j;
			
		}
		for(int f=maxfreq;f>=1;f--)
		{
			for(i=0;i<n;i++)
			{
				int count=1;
				int j=i+1;
				while(j<n && arr[j]==arr[i])
				{
					count++;
					j++;
				}
				if(count==f)
				{
					for(int k=0;k<count;k++)
					{
						System.out.print(arr[i]+" ");
					}
				}
				i=j;
			}
		}

	}

}
