package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable{

	private double HeightRadius;
	
	public Ellipsoid(double Radius, double MinorRadius, double HeightRadius)
	{
		super(Radius, MinorRadius);
		this.HeightRadius = HeightRadius;
	}
	
	public double volume()
	{
		if(Radius < 0 || MinorRadius < 0 || HeightRadius < 0) 
		{
			throw new IllegalArgumentException("one or more of the radii is negative");
			
		}
	 
		return ((4.0/3.0) * Math.PI * (Radius * MinorRadius * HeightRadius));
		
		
	}
	
	public int compareTo(Object o)
	{
		
		if(this.volume() == ((Ellipsoid) o).volume())
		{
			return 0;
		}
		else if(this.volume() > ((Ellipsoid) o).volume())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	} 
	
}
