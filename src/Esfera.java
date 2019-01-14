
public class Esfera extends FormaTridimensional{

	public Esfera(double x) {
		super(x, x, x);
	}

	@Override
	public double getVolume() {
		
		return (4/3) * Math.PI * Math.pow((getX()/2), 3);
		
	}

	@Override
	public double calculaArea() {
		
		return 4 * Math.PI * Math.pow(getX()/2, 2);
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%s"
				+ "Raio: %.1f%n", super.toString(), getX()/2);
		
	}
	
	
}
