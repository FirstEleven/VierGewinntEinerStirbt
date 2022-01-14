package If;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b= false;
if(a=true) {
	a=true;
	if(b=true) {
		b=true;
	}
	else {
		if(a=false) {
			b=true;
		}
		else {
			a=false;
		}
	}
}
else {
	a=true;
	if(b=false) {
		a=true;
	}
}
System.out.println(a);
System.out.println(b);
	}

}


