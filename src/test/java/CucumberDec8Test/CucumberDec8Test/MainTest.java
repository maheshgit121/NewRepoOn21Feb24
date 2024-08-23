package CucumberDec8Test.CucumberDec8Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("Maven test is passed");
    }
    
    @Test
    public void shouldAnswerWithTrueOne()
    {
       
        System.out.println("Addition of two numbers 2 and 3 is: " + (2+3));
        assertTrue( true );
    }
}
