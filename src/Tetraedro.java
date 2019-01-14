
public class Tetraedro extends FormaTridimensional {

	public Tetraedro(double x) {
		super(x, x, x);
	}

	@Override
	public double getVolume() {
		
		return Math.pow(getX(), 3) * Math.sqrt(2)/12;
		
	}

	@Override
	public double calculaArea() {
		
		return Math.pow(getX(), 2) * Math.sqrt(3);
		
	}

	
	
	
}
