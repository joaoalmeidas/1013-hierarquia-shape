
public class Triangulo extends FormaBidimensional {

	public Triangulo(double x) {
		super(x, x);

	}

	@Override
	public double calculaArea() {
		return getX() * getY() / 2;
	}
	
	

}
