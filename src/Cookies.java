import java.util.Scanner;
public class Cookies {
	public static void main(String[] args) {
		double numberOfCookies;
		Scanner sc= new Scanner(System.in);
		double cpc=75;//calories per cookie
		System.out.println("Enter the number of cookies ate:");
		numberOfCookies =sc.nextDouble();
		double caloriesConsumed= numberOfCookies*cpc;//compute the calories consumed 
		System.out.println("Calories consumed:"+ caloriesConsumed);
		sc.close();
	}

}
