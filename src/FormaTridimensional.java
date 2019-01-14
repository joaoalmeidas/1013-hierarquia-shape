
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
	
	public abstract double getVolume();
	
	
}
