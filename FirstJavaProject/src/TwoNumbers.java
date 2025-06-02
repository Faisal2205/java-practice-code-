import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s1 = new Scanner(System.in);
       System.out.print("Enter First no : ");
         int no1= s1.nextInt();
       Scanner s2= new Scanner (System.in);
       System.out.print("Enter Second no : ");
        int no2 = s2.nextInt();
        
        int add = no1 + no2;
        int subs = no1-no2;
        int mult = no1*no2;
        int div = no1/no2;
        int mod = no1 % no2;
        
       System.out.println("Addition is : "+ add);
       System.out.println("Substraction is : "+ subs);
       System.out.println("Multiplication is : "+ mult);
       System.out.println("divide is : "+ div);
       System.out.println("modulous is : "+ mod);
       System.out.println("Thanks You ");
       
	}

}
