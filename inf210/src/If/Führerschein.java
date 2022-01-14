package If;
import java.util.Scanner;

public class Führerschein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Eingabe=new Scanner (System.in);
		System.out.println("Alter?");
		int Alter = Eingabe.nextInt();
		System.out.println("Du darfst fahren:");
		
		if(Alter<=14) {
			System.out.println("Nichts");
		}
		else
			if(Alter>=15) {
				System.out.println("Mofa");
				if(Alter>=16) {
					System.out.println("A1\nM\nL\nT");
					if(Alter>=17) {
						System.out.println("B");
						if(Alter>=18) {
							System.out.println("A\nC\nC1");
							if(Alter>=21) {
								System.out.println("D\nD1");
							}
						}
					}
				}
			}

	}

}
