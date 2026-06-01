import java.util.*;
public class Vowelcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		int i;
		
		
		System.out.println("enter string");
		String s=sc.nextLine();
		int count=0;
		for(i=0;i<s.length();i++)
		{
			
			
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
			{
				count++;
			}
		}
		
		
		
			System.out.println("vowels are"+count);
			sc.close();
	}

}
