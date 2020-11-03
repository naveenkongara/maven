package mavenjava.maven;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TrappedTest {
	
	@Test
	public void deathnote()
	{
	System.out.println("This is Death Note");
	}
	
	@Test
	public void deathnote1()
	{
	System.out.println("This is Death Note1");
    Assert.assertTrue(false);
	}
		

}
