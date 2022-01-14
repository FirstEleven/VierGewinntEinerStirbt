package If;
import java.util.Scanner;

public class forSchleifenTraining3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Gebe den Anfangswert ein.");
		int aw=sc.nextInt();
		System.out.println("Gebe den Endwert ein.");
		int ew=sc.nextInt();
		int ergebnis=-aw;
		for (;aw<ew;aw++) {
			ergebnis=ergebnis+aw;
		}
		System.out.println(ergebnis);
	}

}
