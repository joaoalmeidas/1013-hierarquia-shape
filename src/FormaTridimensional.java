
public abstract class FormaTridimensional extends Forma{
	
	private double z;

	public FormaTridimensional(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return String.format("%s"
				+ "Volume: %.1f%n", super.toString(), getVolume());
	}
	
	public abstract double getVolume();
	
	
}
