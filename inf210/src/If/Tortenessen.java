package If;
import java.util.Scanner;
public class Tortenessen {

	public static void main(String[] args) {
		Scanner Gewicht= new Scanner(System.in);
		System.out.println("Gewicht in Pfund angeben:");
		int Pfund = Gewicht.nextInt();
		if( Pfund <= 265) {
			if(Pfund >=235)
				System.out.println("Sie sind zum Wettbewerb zugelassen!");
			else 
				System.out.println("Sie sind nicht zum Wettbewerb zugelassen!");
		}
		else 
			System.out.println("Sie sind nicht zum Wettbewerb zugelassen!");
		
	}

}
