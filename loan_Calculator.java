import java.util.Scanner;
class loan_Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an amount:");
		int amount = sc.nextInt();
		System.out.println("Enter number of months given for installments:");
		int months[] = new int[4];
		int payment = 0;
		for(int i=1;i<months.length+1;i++)
		{
			payment = ((amount*10)/100);
			amount -= payment;
			System.out.println("The amount to be paid on month " + i + " is: Rs. " + amount);
		}
	}
}