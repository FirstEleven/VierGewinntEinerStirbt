package If;

public class forSchleifenTraining {

	public static void main(String[] args) {
		int Ergebnis=0;
		for(int Zahl = 1; Zahl<=100; Zahl++) {
			if(Zahl == 100) {
				System.out.print(Zahl);
				Ergebnis = Ergebnis+Zahl;
			}else {
					System.out.print(Zahl +"+");
					Ergebnis = Ergebnis+Zahl;
			}
		}
		System.out.println("="+Ergebnis);

	}

}
