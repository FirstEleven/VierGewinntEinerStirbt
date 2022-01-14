package Informatik2;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListe {

	public static void main(String[] args) {
		int Länge;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> Todo = new ArrayList<String>();
		System.out.println( "[1]=hinzufügen, [2]=löschen, [3]=überschreiben, [4]=suchen, [5]=Größe, [6]=ausgeben, [7]=gesamte Liste ausgeben, [8]=Beenden]");
		int Zahl = sc.nextInt();
		for(;Zahl <8 && Zahl>0; ) {
			if(Zahl == 1) {
				System.out.println("Geben Sie ein Wort ein:");
				String Hinzufügen = sc.next();
				Todo.add(Hinzufügen);
				System.out.println(Hinzufügen + " wurde hinzugefügt.");	
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 2) {
				System.out.println("Welches Wort willst du löschen?");
				String Löschen = sc.next();
				Todo.remove(Löschen);
				System.out.println(Löschen + " wurde gelöscht.");	
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
				Länge = Todo.size();
				System.out.println("Die Liste ist "+ Länge + " lang.");
				System.out.println("Geben sie eine neue Zahl ein:");
				Zahl = sc.nextInt();
			}
			if(Zahl == 6) {
				System.out.println("Geben Sie eine Zahl ein (Beginnend mit 0) :");
				int x = sc.nextInt();
				Länge = Todo.size();
				if(x<Länge) {
				String Ausgabe = Todo.get(x);
				System.out.println(Ausgabe);
			}else {	
					System.out.println("Die Liste ist nicht groß genug für diese Zahl.");
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



