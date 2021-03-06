
public abstract class Forma {
	
	private double x;
	private double y;
	
	
	public Forma(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		
		return String.format("%s%n"
				+ "Altura: %.1f%n"
				+ "Largura: %.1f%n"
				+ "Area: %.1f%n",getClass().getSimpleName(),
				getY(), getX(), calculaArea());
		
	}
	
	
	public abstract double calculaArea();
	
}
