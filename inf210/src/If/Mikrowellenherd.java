package If;
import java.util.Scanner;
public class Mikrowellenherd {

	public static void main(String[] args) {
		System.out.println("Anzahl Posten");
		Scanner eingabe = new Scanner(System.in);
		int Posten= eingabe.nextInt();
		
		if( Posten > 0) {
			if( Posten == 1) {
				System.out.println("Wählen Sie die normlae Erhitzungszeit!");
			}
			else 
				if (Posten == 2) {
					System.out.println("Wählen Sie 50% mehr Erhitzungszeit!");
				}
				else 
					if(Posten == 3) {
						System.out.println("Wählen sie die doppelte Erhitzungszeit!");
					}
					else
						System.out.println("Erhitzen von mehr als 3 Posten nicht empfohlen");
		}
		else 
			System.out.println("Gib eine positive Zahl ein!");
	}

}
