package Informatik2;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListe {

	public static void main(String[] args) {
		int L�nge;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> Todo = new ArrayList<String>();
		System.out.println( "[1]=hinzuf�gen, [2]=l�schen, [3]=�berschreiben, [4]=suchen, [5]=Gr��e, [6]=ausgeben, [7]=gesamte Liste ausgeben, [8]=Beenden]");
		int Zahl = sc.nextInt();
		for(;Zahl <8 && Zahl>0; ) {
			if(Zahl == 1) {
				System.out.println("Geben Sie ein Wort ein:");
				String Hinzuf�gen = sc.next();
				Todo.add(Hinzuf�gen);
				System.out.println(Hinzuf�gen + " wurde hinzugef�gt.");	
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 2) {
				System.out.println("Welches Wort willst du l�schen?");
				String L�schen = sc.next();
				Todo.remove(L�schen);
				System.out.println(L�schen + " wurde gel�scht.");	
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 3) {
				System.out.println("Welches Wort willst du ersetzen?");
				String Ersetzbar = sc.next();
				Todo.remove(Ersetzbar);
				System.out.println("Mit welchem Wort willst du das vorherige ersetzen?");
				String Ersetzen = sc.next();
				Todo.add(Ersetzen);
				System.out.println(Ersetzbar + " wurde mit " + Ersetzen + " ersetzt.");
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 4) {
				System.out.println("Geben Sie ein Wort ein:");
				String Suchen = sc.next();
				if (Todo.contains(Suchen))
				System.out.println(Suchen + " Ist vorhanden");	
				else {
					System.out.println(Suchen + " ist nicht vorhanden.");
			}
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 5) {
				L�nge = Todo.size();
				System.out.println("Die Liste ist "+ L�nge + " lang.");
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 6) {
				System.out.println("Geben Sie eine Zahl ein (Beginnend mit 0) :");
				int x = sc.nextInt();
				L�nge = Todo.size();
				if(x<L�nge) {
				String Ausgabe = Todo.get(x);
				System.out.println(Ausgabe);
			}else {	
					System.out.println("Die Liste ist nicht gro� genug f�r diese Zahl.");
				}
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
		}
			if(Zahl == 7) {
				System.out.println(Todo);
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
		}
		System.out.println("Das Programm ist beendet.");
			
	}

}



