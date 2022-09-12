import java.util.Scanner;

//Author 	: Benny Yoga Suhardi
//Date	: 05 September 2022

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		String Word;
		String[] Part;
		
		do {	
			Word = obj.nextLine();
			Part = Word.split(" |\\!|\\,|\\!|\\?|\\.|\\_|\\'|\\@");
			if(Word.length() < 1 ) {
				System.out.println("Kata tidak boleh kosong");
			}
			System.out.println(Part.length);
			for(int i = 0; i < Part.length; i++) {
				System.out.println(Part[i]);
			}
			
		}while(Word.length() <= 1);
	}

}
