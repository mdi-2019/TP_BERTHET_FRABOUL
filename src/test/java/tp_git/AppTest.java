package tp_git;

import static org.junit.Assert.assertTrue;

import org.apache.commons.math3.analysis.function.Multiply;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void opBinaire(){
        double multiply=new Multiply().value(4,4);
        assertTrue( "multiply",multiply==16);
    }
}
