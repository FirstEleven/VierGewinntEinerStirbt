package Informatik2;

public class Arrays {

	public static void main(String[] args) {
		int x[];
		double y[];
		x=new int[2];
		y=new double[3];
		x[0]=1;
		x[1]=1;
		y[0]=0.1;
		y[1]=1.4;
		y[2]=4.8;
		int z=x[0]+x[1]+1;
		double v=y[0]+y[1];
		System.out.println(x[0] + "+" + x[1] + "=" + z);
		System.out.println(y[0] + y[1] + y[2] + "=" + v);
		//extra falsch
	}

}
