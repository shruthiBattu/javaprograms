import java.util.*;
 public class Halfstring
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a string");
		String s= scan.nextLine();
		String res="";
		for(int i=(s.length()-1)/2;i>=0;i--)
		{
			res+=s.charAt(i);
		}
		System.out.println(res);

	}

}
