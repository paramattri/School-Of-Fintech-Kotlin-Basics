package junitjava.testcases;

import junitjava.logic.Calculation;
import org.junit.*;

public class CalculationTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("First method to be invoked");
    }
    @Before
    public void setUp() throws Exception{
        System.out.println("Before testFindMax method");
    }
    @Test
    public void testFindMax()
    {
        System.out.println("Welcome");
        Assert.assertEquals(7, Calculation.findMax(new int[]{4,5,6,7,1,2,4,3}));
        Assert.assertEquals(0, Calculation.findMax(new int[]{-4,-5,-6,-7,-1,-2,-4,-3}));
    }
    @After
    public void setClose() throws Exception{
        System.out.println("After testFind Max method");
    }

    @Test(timeout = 1000)
    public void testFindCube(){
        Assert.assertEquals(27, Calculation.findCube(3));
    }

    @Test
    public void testReverseString(){
        Assert.assertEquals("marap", Calculation.reverseString("param"));
    }

    @AfterClass
    public static void setUpAfterClass()
    {
        System.out.println("From after class Final method");
    }
}
