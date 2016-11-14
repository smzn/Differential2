package differential;

public class Differential_lib implements Differential_if{
	
	private double a,h;

	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		double rx = 2*this.a;
		return rx;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		double dx = (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
		return dx;
	}
	
}
