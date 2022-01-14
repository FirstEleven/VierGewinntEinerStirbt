package If;
import java.util.Scanner;
public class forSchleifeTraining5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Wie viel Pormille hast du?");
		double Promille=sc.nextInt();
		System.out.println("Wie Zeit (In Stunde)?");
		int Zeit=sc.nextInt();
		for(int Uhr=0;Promille>0 && Uhr!=Zeit;Uhr++) {
				if(Promille*0.2 < 0.1) {
					Promille=Promille-0.1;
				}else {
					Promille=Promille-Promille*0.2;
			}			
		}
		if (Promille<0) {
			Promille=0;
		}
		System.out.println("Dein Promille ist "+Promille);	
		
	}

}
