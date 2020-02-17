import java.util.Scanner;
public class Totalamount {
public static void main(String[] args) {
	double purchaseAmount,Aacst,Aacct,totalsaletax,totalSaleAmount;
	double stateTax=0.04;
	double countryTax=0.02;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the purchase amount:");//ask the user to enter the purchase amount
	purchaseAmount= sc.nextDouble();
	 Aacst =purchaseAmount*stateTax;//compute the state tax
	 Aacst =purchaseAmount*countryTax;//compute the country tax
	 totalsaletax = Aacst + Aacst;//totalsaletax
	 totalSaleSmount = purchaseAmount+Aacst+Aacct;//compute the total sale amount
	System.out.println("purchaseamount:\t"+purchaseamount +"\nstateTax:\t"+Aacst+"\ncountryTax:\t"+Aacct +"\ntotalsaletax:"+totalsaletax+"\ntotalSaleAmount:\t" + totalsaleAmount);//display the purchase amount,state tax,country tax,sale amount
	sc.close();
}
}
