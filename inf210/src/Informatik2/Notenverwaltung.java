package Informatik2;
import java.util.Scanner;

public class Notenverwaltung {

	public static void main(String[] args) {
		Scanner Eingabe=new Scanner (System.in);
		int x[]=new int[6];
		System.out.println("Schreiben sie die Anzahl der Einsen");
		x[0]=Eingabe.nextInt();
		System.out.println("Schreiben sie die Anzahl der Zweien");
		x[1]=Eingabe.nextInt();
		System.out.println("Schreiben sie die Anzahl der Dreien");
		x[2]=Eingabe.nextInt();
		System.out.println("Schreiben sie die Anzahl der Vieren");
		x[3]=Eingabe.nextInt();
		System.out.println("Schreiben sie die Anzahl der Fünfen");
		x[4]=Eingabe.nextInt();
		System.out.println("Schreiben sie die Anzahl der Sechsen");
		x[5]=Eingabe.nextInt();
		int z=x[0]+x[1]+x[2]+x[3]+x[4]+x[5];
		System.out.println("Ihr habt " + x[0] + " Einsen.");
		System.out.println("Ihr habt " + x[1] + " Zweien.");
		System.out.println("Ihr habt " + x[2] + " Dreien.");
		System.out.println("Ihr habt " + x[3] + " Vieren.");
		System.out.println("Ihr habt " + x[4] + " Fünfen.");
		System.out.println("Ihr habt " + x[5] + " Sechsen.");
		int Durchschnitt=(x[0]+x[1]+x[2]+x[3]+x[4]+x[5])/6;
		System.out.println("Euer Durchschnitt ist " + Durchschnitt);
	}

}
