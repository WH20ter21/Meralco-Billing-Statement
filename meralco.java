import java.util.Scanner;
public class Prelim1{
	public static void main(String[] args){
	Scanner cs = new Scanner(System.in);


	//input

System.out.println("Enter Name: ");
String name = cs.nextLine();

System.out.println("Enter Address: ");
String Add = cs.nextLine();

System.out.println("Enter Postal Code: ");
String Postal = cs.nextLine();

System.out.println("Enter TEl. NO.: ");
String TEL = cs.nextLine();

System.out.println("Enter TIN: ");
String TIN = cs.nextLine();

System.out.println("Enter Previous Billing: ");
String Previous = cs.nextLine();

System.out.println("Enter Amount Due");
String Amount = cs.nextLine();

System.out.println("Enter Due Date: ");
String Due = cs.nextLine();

System.out.println("Enter Total Amount Due: ");
String Total = cs.nextLine();

System.out.println("Enter Service ID NO.: ");
String Service = cs.nextLine();

System.out.println("Enter Rate: ");
String Rate = cs.nextLine();

System.out.println("Enter Contract In The Name of: ");
String Contract = cs.nextLine();

System.out.println("Enter Bill Date: ");
String Bill = cs.nextLine();

System.out.println("Enter Meter Reading Date: ");
String Meter = cs.nextLine();

System.out.println("Enter KWH TOTAL: ");
String KWH = cs.nextLine();

System.out.println("Enter Next meter Reading: ");
String Next = cs.nextLine();





//output
System.out.println("\n\n-------------------------------------------------------------------------");
System.out.println("\t\t\tMERALCO ");
System.out.println("\n\n-------------------------------------------------------------------------");
System.out.println("\t\t\tANG LIWANAG NG BUKAS");
System.out.println("-------------------------------------------------------------------------\n");
System.out.println("For Inquiries Please Contact our Call Call Center 098979");
System.out.println("-------------------------------------------------------------------------\n");
System.out.println("Name: " +name);
System.out.println("Address: " +Add);
System.out.println("Postal Code: " +Postal);
System.out.println("TEl. NO.: " +TEL);
System.out.println("TIN: " +TIN);
System.out.println("Previous Billing: " +Previous);
System.out.println("Amount Due: " +Amount);
System.out.println("Due Date: " +Due);
System.out.println("Total Amount Due: " +Total);
System.out.println("\n\n\n\nPAGE 2 of 2----------------------------------------------------------\n");
System.out.println("\t\t\tSERVICE INFO");
System.out.println("Service ID NO.: " +Service);
System.out.println("Rate: " +Rate);
System.out.println("Contract In The Name of: " +name);
System.out.println("Service Address: " +Add);
System.out.println("------------------------------------------------------------------------------\n");
System.out.println("\t\t\tBILLING INFO");
System.out.println("Bill Date: " +Bill);
System.out.println("Meter Reading Date: " +Meter);
System.out.println("Due Date: " +Due);
System.out.println("Total Current Amount: " +Total);
System.out.println("Next Meter Reading: " +Next);
System.out.println("---------------------------------IMPORTANT NOTICE-------------------------------");
System.out.println("1. Your Meter Has Been Read This July Bill");
System.out.println("Reflects your Actual Consumption for the Month.");
System.out.println("2. Any Unpaid Balance From Your March to June");
System.out.println("Bills Will be Included In the Installment Plan");
System.out.println("Which will be Due Starting July 25, 2020");
System.out.println("You may also Opt to pay in Full to avoid Bills From Pilling up");
System.out.println("For more Details... Visit Facebook/meralco");



	}
	}
