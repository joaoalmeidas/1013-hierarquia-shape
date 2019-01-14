
public class Circulo extends FormaBidimensional {

	public Circulo(double x) {
		super(x, x);
	}

	@Override
	public double calculaArea() {
		
		return Math.PI * Math.pow(getX()/2, 2);
		
	}
	
	

}
