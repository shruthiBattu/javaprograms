import java.util.Scanner;

public class CCul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub import java.util.Scanner;

         int count=0,count2=0,i;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the string");
         String s = scan.nextLine();
        
		int n = s.length();
         for( i=0; i<n;i++)
			 {
             if(Character.isUpperCase(s.charAt(i)))
                 count++;
             if(Character.isLowerCase(s.charAt(i))) 
             count2++;
         }
             System.out.println(count);
             System.out.println(count2);
         }



}
   
