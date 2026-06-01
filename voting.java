import java.util.*;
public class voting {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=1;
		Arrays.sort(arr);
		boolean found=false;
		for(i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				count=1;
			}
		
		
			if(count>n/4)
			{
				System.out.println(arr[i]);
				found =true;
				break;
			
			}
			else
			{
				System.out.println("No element found at n/4 element.");
			}
		}
			
			sc.close();	
			
		
		

	}

}
