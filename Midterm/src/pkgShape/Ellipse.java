package pkgShape;

public class Ellipse extends Circle implements Comparable {
	
	protected double MinorRadius;
	
	public Ellipse(double Radius, double MinorRadius) 
	{
		super(Radius);
		this.MinorRadius = MinorRadius;
	}
	
	public double getMinorRadius()
	{
		return MinorRadius;
	}
	
	public void setMinorRadius(double minorRadius)
	{
		MinorRadius = minorRadius;
	}
	
	public double area()
	{
		if(MinorRadius < 0 || Radius < 0)
		{
			throw new IllegalArgumentException("one or both of the radii is negative");
		}
		
		return Math.PI * MinorRadius * Radius;
	}
	
	public boolean isCircle()
	{
		if(Radius == MinorRadius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int compareTo(Object o)
	{
		if(this.area() == ((Ellipse) o).area())
		{
			return 0;
		}
		else if(this.area() > ((Ellipse) o).area())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
