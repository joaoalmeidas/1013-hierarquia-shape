
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
		
		return String.format("Altura: %d%n"
				+ "Largura: %d%n"
				+ "Area: %d%%n",
				getY(), getX(), calculaArea());
		
	}
	
	
	public abstract double calculaArea();
	
}
