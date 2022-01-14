package Informatik2;
import java.util.Scanner;
public class Stundenplaner {

	public static void main(String[] args) {
	String y[][] = {{"Mo	","Di	","Mi	","Do	","Fr	"},{"M	","If	","M	","E	","Ph	"},{"M	","Sp	","M	","E	","Ph	"},{"E	","D	","Sp	","M	","E	"},{"E	","D	","Sp	","F	","E	"},{"Ph	","F	","K	","If	","K	"},{"	","F	","	","If	","K	"}};
		System.out.println(y[0][0] + y[0][1] + y[0][2] + y[0][3] + y[0][4] + "\t");
		System.out.println("-----------------------------------");
		System.out.println(y[1][0] + y[1][1] + y[1][2] + y[1][3] + y[1][4] + "\t");
		System.out.println(y[2][0] + y[2][1] + y[2][2] + y[2][3] + y[2][4] + "\t");
		System.out.println(y[3][0] + y[3][1] + y[3][2] + y[3][3] + y[3][4] + "\t");
		System.out.println(y[4][0] + y[4][1] + y[4][2] + y[4][3] + y[4][4] + "\t");
		System.out.println(y[5][0] + y[5][1] + y[5][2] + y[5][3] + y[5][4] + "\t");
		System.out.println(y[6][0] + y[6][1] + y[6][2] + y[6][3] + y[6][4] + "\t");
	int Tag, Stunde;
	Scanner sc= new Scanner(System.in);
	System.out.println("Tage: 1=Mo\t2=Di\t3=Mi\t4=Do\t5=Fr");
	System.out.println("Stunden: 1-6");
	System.out.println("Welcher Tag soll verändert werden?");
	Tag = sc.nextInt();
	System.out.println("Tag:"+Tag);
	System.out.println("Welche Stunde soll verändert werden?");
	Stunde = sc.nextInt();
	System.out.println("Stunde:"+Stunde);
	System.out.println("Fach:");
	y[Stunde-1][Tag-1] = sc.next();
	System.out.println(y[0][0] + y[0][1] + y[0][2] + y[0][3] + y[0][4] + "\t");
	System.out.println("-----------------------------------");
	System.out.println(y[1][0] + y[1][1] + y[1][2] + y[1][3] + y[1][4] + "\t");
	System.out.println(y[2][0] + y[2][1] + y[2][2] + y[2][3] + y[2][4] + "\t");
	System.out.println(y[3][0] + y[3][1] + y[3][2] + y[3][3] + y[3][4] + "\t");
	System.out.println(y[4][0] + y[4][1] + y[4][2] + y[4][3] + y[4][4] + "\t");
	System.out.println(y[5][0] + y[5][1] + y[5][2] + y[5][3] + y[5][4] + "\t");
	System.out.println(y[6][0] + y[6][1] + y[6][2] + y[6][3] + y[6][4] + "\t");
	}

}
