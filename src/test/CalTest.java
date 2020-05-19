package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pac1.Cal;

public class CalTest {
   Cal cal=new Cal();
   @Test
	public void testAdd() {
	   
		assertEquals(3, cal.add(1, 2));
		
		assertEquals(-3, cal.add(-1, -2));
		
		assertEquals(-1, cal.add(1, -2));
		
		assertEquals(3, cal.add(-1, 2));
        
		assertEquals(3, cal.add(0, 2));
        
		assertEquals(3, cal.add(-1, 0));
		
   }

	@Test
	public void testSub() {
		
		assertEquals(-1,cal.sub(1,2));
	
	}
	
}
