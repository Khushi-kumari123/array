import java.util.*;
public class deletesmallest {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=0,index=0;
		 min=arr[0];
		 for(i=0;i<n;i++)
			{
			 if(arr[i]<min)
			 {
				 min=arr[i];
				 index=i;
			 }
			}
		 for(i=0;i<n;i++)
			{
			 if(i!=index)
			 {
				 System.out.println(arr[i]+" ");
			 }
		 sc.close();
	}
	}
}
