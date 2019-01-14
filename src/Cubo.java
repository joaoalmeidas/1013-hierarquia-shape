
public class Cubo extends FormaTridimensional {

	public Cubo(double x) {
		super(x, x, x);
	}

	@Override
	public double getVolume() {
		return getX() * getY() * getZ();
	}

	@Override
	public double calculaArea() {
		return 6 * Math.pow(getX(), 2);
	}

	
	
}
