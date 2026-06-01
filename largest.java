import java.util.*;
public class largest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int arr[]=new  int[n];
	int i;
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int max=0;
	max=arr[0];
	for(i=0;i<n;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("largest elemet "+max);
	sc.close();
	}

}
