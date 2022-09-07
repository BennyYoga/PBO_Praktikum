import java.util.Scanner;

//Author 	: Benny Yoga Suhardi
//Date	: 05 September 2022

public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		int Product = obj.nextInt();
		float bonus = 0;
		float Primary = 500000;

		if(Product > 80) {
			bonus = (Product*50000)*35/100;
			System.out.println(bonus);
		}
		else if(Product > 40 && Product <= 80) {
			bonus = (Product*50000)*25/100;
			System.out.println(bonus);
		}
		else if(Product > 15 && Product <= 40) {
			bonus = (Product*50000)*10/100;
			System.out.println(bonus);
		}
		else if(Product <=15) {
			Primary += (((Product-15)*50000)*15/100); 
		}
		System.out.print(Primary+bonus);
		
		
	}

}
