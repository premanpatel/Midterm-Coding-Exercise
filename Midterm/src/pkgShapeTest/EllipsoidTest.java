package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;
import pkgShape.Ellipsoid;

public class EllipsoidTest {

	@Test
	public void EllipsoidTest() throws Exception
	{
		Ellipsoid ell3d = new Ellipsoid(10.0,20.0,25.0);
		
		assertEquals(20943.95, ell3d.volume(), 0.01);	
	}

}
