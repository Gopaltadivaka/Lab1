import java.util.Scanner;
public class Cookies {
	public static void main(String[] args) {
		double numberofcookies;
		Scanner sc= new Scanner(System.in);
		double Cpc=75;//calories per cookie
		System.out.println("Enter the number of cookies ate:");
		 numberofcookies =sc.nextDouble();
		double caloriesconsumed= numberofcookies*Cpc;//compute the calories consumed 
		System.out.println("Calories consumed:"+ caloriesconsumed);
		sc.close();
	}

}
