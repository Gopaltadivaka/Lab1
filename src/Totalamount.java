import java.util.Scanner;
public class Totalamount {
public static void main(String[] args) {
	double purchaseamount,Aacst,Aacct,totalsaleamount;
	double statetax=0.04;
	double countrytax=0.02;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the purchase amount:");//ask the user to enter the purchase amount
	purchaseamount= sc.nextDouble();
	 Aacst =purchaseamount*statetax;//compute the state tax
	 Aacct =purchaseamount*countrytax;//compute the country tax
	 totalsaleamount = purchaseamount+Aacst+Aacct;//compute the total sale amount
	System.out.println("purchaseamount:\t"+purchaseamount +"\nstatetax:\t"+Aacst+"\ncountrytax:\t"+Aacct +"\ntotalsaleamount:\t" + totalsaleamount);//display the purchase amount,state tax,country tax,sale amount
	sc.close();
}
}
