package If;
import java.util.Scanner;
public class forSchleifenTraining4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Gebe die natürliche Zahl ein, für welche du die Fakultät wissen möchtest!");
		int n=sc.nextInt();
		int Ergebnis=1;
		for(;n>0;n--) {
			Ergebnis=Ergebnis*n;
		}
		System.out.println("Deine Fakultät liegt bei " + Ergebnis);
	}

}
