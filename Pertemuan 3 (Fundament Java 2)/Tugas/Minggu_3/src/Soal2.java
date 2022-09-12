import java.util.Scanner;

//Author 	: Benny Yoga Suhardi
//Date	: 07 September 2022

public class Soal2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String str[] = new String[255];
		String Part[];
		
		for(int i=0;;i++) {
			str[i] = obj.nextLine();
			if(str[i] == "") {
				break;
			}
		}
		
		System.out.println("========================");
		for(int i =0;i<str.length;i++) {
			int j = 0;
			Part = str[i].split(" ");
			if(str[i] == "") {
				break;
			}
			int value = Integer.valueOf(Part[j+1]);
			System.out.println(String.format("%-15s", Part[j]) + 
					String.format("%03d",value));
			j+= 2;
		}
		System.out.println("========================");
	}

}
