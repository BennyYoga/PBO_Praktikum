import java.math.BigInteger;
import java.util.Scanner;

//Author 	: Benny Yoga Suhardi
//Date	: 05 September 2022

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		BigInteger A = obj.nextBigInteger();
		BigInteger B = obj.nextBigInteger();
		
		System.out.println(A + " + "+ B + " = "+ A.add(B));
		System.out.println(A + " x "+ B + " = "+ A.multiply(B));
	}

}
