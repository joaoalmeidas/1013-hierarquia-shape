
public class Quadrado extends FormaBidimensional {

	public Quadrado(double x) {
		super(x, x);
	}

	@Override
	public double calculaArea() {
		return getX() * getY();
	}
	
	
	
}
