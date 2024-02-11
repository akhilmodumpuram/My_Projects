import java.util.Scanner;
class Tours_Travels
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println("	   AKHIL'S TOURS AND TRAVELS");
		System.out.println("--------------------------------------------------");
		System.out.println("TRIP TO MANALI...."+(char)3);
		System.out.println("Select mode of Transportation");
		System.out.println("--------------------------------------------------");
		System.out.println(" "+(char)4+" Enter 1 for AIRLINES");
		System.out.println(" "+(char)4+" Enter 2 for TRAIN");
		System.out.println(" "+(char)4+" Enter 3 for BUS");
		System.out.println(" "+(char)4+" Enter 4 for CAR");
		System.out.println(" "+(char)4+" Enter 5 for BIKE");
		System.out.println("--------------------------------------------------");
		System.out.println("Enter your Choice");
		int choice = scan.nextInt();
		if (choice == 1)
		{
			System.out.println("Selected mode of Transportation is AIRLINES");
			System.out.println("--------------------------------------------------");
			System.out.println(" "+(char)4+" Enter 1 for First Class tickets");
			System.out.println(" "+(char)4+" Enter 2 for Second Class tickets");
			System.out.println(" "+(char)4+" Enter 3 for Business Class tickets");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your Choice");
			int choice1 = scan.nextInt();
			if (choice1 == 1)
			{
				System.out.println("You have selected for First Class tickets");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*75000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*75000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*75000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*75000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*75000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*75000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*75000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*75000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*75000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your First Class ticket/tickets to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 2)
			{
				System.out.println("You have selected for Second Class tickets");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*60000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*60000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*60000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*60000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*60000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*60000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*60000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*60000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*60000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
					System.out.println("Do you want to continue with Booking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If yes press 1");
					System.out.println("If no press 2");
					System.out.println("For refund(if paid) press 3");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int booking = scan.nextInt();
					if (booking == 1)
					{
						System.out.println("Congratulations... Your Second Class ticket/tickets to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 3)
			{
				System.out.println("You have selected for Business Class tickets");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*100000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*100000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*100000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*100000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*100000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*100000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*100000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*100000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*100000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
					System.out.println("Do you want to continue with Booking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If yes press 1");
					System.out.println("If no press 2");
					System.out.println("For refund(if paid) press 3");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int booking = scan.nextInt();
					if (booking == 1)
					{
						System.out.println("Congratulations... Your Business Class ticket/tickets to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
		}
			else if (choice == 2)
			{
			System.out.println("Selected mode of Transportation is TRAIN");
			System.out.println("--------------------------------------------------");
			System.out.println(" "+(char)4+" Enter 1 for AC tickets");
			System.out.println(" "+(char)4+" Enter 2 for NON-AC tickets");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your Choice");
			int choice1 = scan.nextInt();
			if (choice1 == 1)
			{
				System.out.println("You have selected for AC tickets");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*10000+" Rupees" );
			System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*10000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*10000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*10000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*10000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*10000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*10000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*10000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*10000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your AC ticket/tickets to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 2)
			{
				System.out.println("You have selected for NON-AC tickets");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*8000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*8000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*8000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*8000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*8000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*8000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*8000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*8000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*8000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your NON-AC ticket/tickets to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else
				{
				System.out.println("Enter a valid choice");
				}
		}
		else if (choice == 3)
		{
			System.out.println("Selected mode of Transportation is BUS");
			System.out.println("--------------------------------------------------");
			System.out.println(" "+(char)4+" Enter 1 for Hired Transport");
			System.out.println(" "+(char)4+" Enter 2 for Govt. Transport");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your Choice");
			int choice1 = scan.nextInt();
			if (choice1 == 1)
			{
				System.out.println("You have selected for Hired Transport");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*15000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*15000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*15000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*15000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*15000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*15000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*15000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*15000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*15000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your Hired Transport to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 2)
			{
				System.out.println("You have selected for Govt. Transport");
				System.out.println("--------------------------------------------------");
				System.out.println("How many members you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*12000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*12000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*12000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*12000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*12000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*12000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*12000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*12000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*12000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your Govt. Transport to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else
			{
				System.out.println("Enter a valid input");
			}
		}
		else if (choice == 4)
		{
			System.out.println("Selected mode of Transportation is CAR");
			System.out.println("--------------------------------------------------");
			System.out.println(" "+(char)4+" Enter 1 for XUV Car");
			System.out.println(" "+(char)4+" Enter 2 for SUV Car");
			System.out.println(" "+(char)4+" Enter 3 for Mini Car");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your Choice");
			int choice1 = scan.nextInt();
			if (choice1 == 1)
			{
				System.out.println("You have selected for XUV Car");
				System.out.println("--------------------------------------------------");
				System.out.println("How many days you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*30000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*30000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*30000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*30000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*30000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*30000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*30000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*30000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*30000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your XUV Car to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 2)
			{
				System.out.println("You have selected for SUV Car");
				System.out.println("--------------------------------------------------");
				System.out.println("How many days you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*25000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*25000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*25000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*25000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*25000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*25000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*25000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*25000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*25000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your SUV Car to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 3)
			{
				System.out.println("You have selected for Mini Car");
				System.out.println("--------------------------------------------------");
				System.out.println("How many days you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*24000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*24000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*24000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*24000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*24000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*24000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*24000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*24000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*24000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your Mini Car to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else
			{
				System.out.println("Enter a valid input");
			}
		}
		else if (choice == 5)
		{
			System.out.println("Selected mode of Transportation is BIKE");
			System.out.println("--------------------------------------------------");
			System.out.println(" "+(char)4+" Enter 1 for 400CC and Above CC bikes");
			System.out.println(" "+(char)4+" Enter 2 for 200CC to 389CC bikes");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your Choice");
			int choice1 = scan.nextInt();
			if (choice1 == 1)
			{
				System.out.println("You have selected for 400CC and Above CC bikes");
				System.out.println("--------------------------------------------------");
				System.out.println("How many days you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*5000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*5000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*5000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*5000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*5000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*5000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*5000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*5000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*5000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your bike with 400CC to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else if (choice1 == 2)
			{
				System.out.println("You have selected for 200C to 389CC bikes");
				System.out.println("--------------------------------------------------");
				System.out.println("How many days you are travelling?");
				int x = scan.nextInt();
				System.out.println("The amount to be paid is : "+x*4000+" Rupees" );
				System.out.println("--------------------------------------------------");
				System.out.println("Select mode of Payment");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter 1 for UPI");
				System.out.println("Enter 2 for Net banking");
				System.out.println("Enter 3 for Debit/Credit card");
				System.out.println("Enter 4 for Phone pay/Gpay/Paytm");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int mode = scan.nextInt();
				if(mode == 1)
				{
					System.out.println("Are you sure? Do you want to pay "+x*4000+"/- with UPI?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*4000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 2)
				{
					System.out.println("Are you sure? Do you want to pay "+x*4000+"/- with Net banking?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*4000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 3)
				{
					System.out.println("Are you sure? Do you want to pay "+x*4000+"/- with Debit/Credit card?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*4000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else if(mode == 4)
				{
					System.out.println("Are you sure? Do you want to pay "+x*4000+"/- with pay/Gpay/Paytm?");
					System.out.println("--------------------------------------------------");
					System.out.println("If Yes press 1");
					System.out.println("If No press 2");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter your choice");
					int payment = scan.nextInt();
					if (payment == 1)
					{
						System.out.println("Your Transaction of "+x*4000+"/- is successful");
					}
					else if (payment == 2)
					{
						System.out.println("You have cancelled your Payment");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
				}
				else
				{
					System.out.println("Enter a valid mode of payment");
				}
				System.out.println("Do you want to continue with Booking?");
				System.out.println("--------------------------------------------------");
				System.out.println("If yes press 1");
				System.out.println("If no press 2");
				System.out.println("For refund(if paid) press 3");
				System.out.println("--------------------------------------------------");
				System.out.println("Enter your choice");
				int booking = scan.nextInt();
				if (booking == 1)
					{
						System.out.println("Congratulations... Your Bike with 200CC to MANALI has booked");
						System.out.println("Happy Journey..."+(char)3+(char)2);
					}
					else if (booking == 2)
					{
						System.out.println("You have cancelled your booking");
					}
					else if (booking == 3)
					{
						System.out.println("Your Amount will be Refunded within 24 hours");
					}
					else
					{
						System.out.println("Enter a valid choice");
					}
			}
			else
			{
				System.out.println("Enter a valid input");
			}
		}
	}
}