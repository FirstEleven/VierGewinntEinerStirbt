package If;
import java.util.Scanner;
public class forSchleifenTraining4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Gebe die nat�rliche Zahl ein, f�r welche du die Fakult�t wissen m�chtest!");
		int n=sc.nextInt();
		int Ergebnis=1;
		for(;n>0;n--) {
			Ergebnis=Ergebnis*n;
		}
		System.out.println("Deine Fakult�t liegt bei " + Ergebnis);
	}

}
