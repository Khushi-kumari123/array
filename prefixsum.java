import java.util.*;
public class prefixsum {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		int prefix[]=new int[n];
		
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		prefix[0]=arr[0];
		for(i=1;i<n;i++)
		{
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.println(prefix[i]);
		}
		int l,r;
		l=sc.nextInt();
		r=sc.nextInt();
		int sum=0;
		if(l == 0) {
			sum = prefix[r];
		}
		else {
		sum = prefix[r] - prefix[l - 1];
	}

		System.out.println(sum);

		
		sc.close();
	}

}
