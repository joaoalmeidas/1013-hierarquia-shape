
public class Circulo extends FormaBidimensional {

	public Circulo(double x) {
		super(x, x);
	}

	@Override
	public double calculaArea() {
		
		return Math.PI * Math.pow(getX()/2, 2);
		
	}
	
	@Override
	public String toString() {
		return String.format("%s"
				+ "Raio: %.1f%n", 
				super.toString(),
				getX()/2);
	}
}
