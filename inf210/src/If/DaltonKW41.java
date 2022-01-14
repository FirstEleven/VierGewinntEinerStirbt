package If;
import java.util.Scanner;

public class DaltonKW41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Nummer=new Scanner (System.in);		
		System.out.println("Geben Sie eine Ganzzahl für n1 ein:");
		int n1=Nummer.nextInt();
		System.out.println("Geben Sie eine Ganzzahl für n2 ein:");
		int n2=Nummer.nextInt();
		System.out.println("Geben Sie eine Ganzzahl für n3 ein:");
		int n3=Nummer.nextInt();
		System.out.println("Geben Sie eine Ganzzahl für n4 ein:");
		int n4=Nummer.nextInt();
		System.out.println("Geben Sie eine Ganzzahl für n5 ein:");
		int n5=Nummer.nextInt();
		System.out.println("Geben Sie eine Ganzzahl für max ein:");
		int max;
		int Betrag=Nummer.nextInt();
		
		if(n1<0)
			n1=0;
		if(n2>0) {
		n2=n2+n2/10;
		System.out.println("Der Wert von n2 ist jetzt gleich " + n2);
		}
		if(n3%2==0) 
			n3=n3/2;
			else
				n3=n3*2;
		if(n1>n2)
		System.out.println(n2 + "\n" + n1);
			else
				System.out.println(n1 + "\n" + n2);
	
			if(n1<0)
			n1=n1+1;
				if(n1>0)
					n1=n1-1;
			if(n2!=0)
				n2=n2-1;
		if(n1>n2||n3)
			max=n1;
		else if(n2>n3)
			max=n2;
			else 
				max=n3;
	}
}
