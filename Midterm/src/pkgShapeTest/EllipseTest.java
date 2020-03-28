package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;
import pkgShape.Ellipse;

public class EllipseTest {

	@Test
	public void EllipseTest(){
		Ellipse ell = new Ellipse(10.0, 20.0);
		
		assertEquals(628.32, ell.area(), 0.01);	
		
	}

}
