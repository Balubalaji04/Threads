import java.util.Scanner;
public class SingleThreaded {

	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 1:Addition Operation started");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number:");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result is :"+res);
		System.out.println("Task 1:Addition Operation completed");
		System.out.println("Task 2:Printing Operation completed");
		for(int i=0;i<5;i++) {
			System.out.println("balaji");
			Thread.sleep(2000);
		}
		System.out.println("Task 2:Printing Operation completed");
		System.out.println("Task 3:Banking operation stared");
		System.out.println("Enter the account number:");
		int acc=sc.nextInt();
		System.out.println("Enter the pin code:");
		int pin=sc.nextInt();
		System.out.println("Account details recorded");
		System.out.println("Task 3:Banking operation completed");
	}

}
