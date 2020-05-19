package test;



import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pac1.Cal;

@RunWith(Parameterized.class)
public class AddTest {
	int result;
	int num1;
	int num2;
	private Cal addTest;
	
	@Before
	public void initialize() {
		 addTest =new Cal();
	}
	
	public AddTest(int result,int num1,int num2) {
		this.result=result;
		
		this.num1=num1;
		
		this.num2= num2;
		
		
	}
	@Parameterized.Parameters
	public static Collection addNumbers() {
		
		return Arrays.asList(new Object[][] {
			
			{4,2,2},
			{5,3,2},
			{6,4,2}
		});
	}
	//@Hepeng
	@Test
	public void testAddNumber() {
		
		System.out.println("Parameterized Number is:" + " "+result+" "+num1+" "+num2);
	
		assertEquals(result, addTest.add(num1,num2));
		}

	
}
