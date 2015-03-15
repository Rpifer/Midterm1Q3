package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//Project Midterm 1 is in build path for this project
public class Question3Test
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test()
	{	
		assertTrue("This should return true", MyClass.ReturnTrue());
		assertEquals("4 + 5 should be 9", 9, MyClass.AddTwoNumbers(4,5));
	}

}
