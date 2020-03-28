package pkgShape;

public class Circle extends Shape implements Comparable {
	
	protected double Radius;
	
	public Circle(double Radius) 
	{
		this.Radius = Radius;
	}
	
	public double area() throws Exception 
	{
		if(Radius < 0.0)
		{
			throw new IllegalArgumentException("radius is negative");
		}
		
		return Math.PI * Math.pow(Radius, 2);

		
	}
		
	protected double getRadius() 
	{
		return Radius;
	}
		
	protected void setRadius(double radius) 
	{
		Radius = radius;
	}
		
	public int compareTo(Object o) 
	{
		if(this.Radius == ((Circle) o).getRadius())
		{
			return 0;
		}
		else if(this.Radius > ((Circle) o).getRadius())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
	}

}
