import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
public class MathTest {

    @Test
    public void MathRoundDownTest(){
       assertEquals(5,Math.round(5.432));
    }
    @Test
    public void MathRoundUpTest(){
        assertEquals(6,Math.round(5.632));
    }
     @Test
    public void MathMaxTest(){
        assertEquals(17, Math.max(3,17));
     }
    @Test
    public void MathMaxMinusTest(){
        assertEquals(-17, Math.max(-3,-17));
    }

    @Test
    public void MathMinTest(){
        assertEquals(4.4, Math.min(4.4,20.5));
    }
    @Test
    public void MathMinMinusTest(){
        assertEquals(-4.4, Math.min(-4.4,-20.5));
    }
    @Test
    public void MathFloorTest(){
        assertEquals(7.4, Math.floor(7.000000));

    }
    @Test
    public void MathSqrtTest(){
        assertEquals(200, Math.sqrt(14.1));
    }
    

}
