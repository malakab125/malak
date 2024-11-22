package malak.malak;
//malak aboud 212684583
//aya kabha 213624471

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	q4 tester = new q4();

    @Test
    public void Test_1() {
        String expectedResult ="A";
        double a=5, b=3;  
        String mode= "regular";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    @Test
    public void Test_2() {
        String expectedResult ="A";
        double a=-7, b=-8;  
        String mode= "regular";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    @Test
    public void Test_3() {
        String expectedResult ="A";
        double a=8, b=8;  
        String mode= "regular";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    
    @Test
    public void Test_4() {
        String expectedResult ="B";
        double a=5, b=-2;  
        String mode= "negatives";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    
    @Test
    public void Test_5() {
        String expectedResult ="B";
        double a=-10, b=-51;  
        String mode= "negatives";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    
    @Test
    public void Test_6() {
        String expectedResult ="A";
        double a=5, b=0.5;  
        String mode= "reciprocals";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    @Test
    public void Test_7() {
        String expectedResult ="A";
        double a=0.5, b=0.2;  
        String mode= "reciprocals";
        String actualResult= tester.calculate(a, b, mode);
        assertEquals(expectedResult,actualResult );
    }
    
    @Test
    public void testReciprocals_ZeroValue() {
        String expectedResult = "Error";
        double a = 0.2, b = 0;  
        String mode = "reciprocals";
        String actualResult = tester.calculate(a, b, mode);
        assertEquals(expectedResult, actualResult);
   }
  
    @Test
    public void testInvalidMode() {
        String expectedResult = "Error: Invalid mode.";
        double a = 5, b = 3;  
        String mode = "invalid";
        String actualResult = tester.calculate(a, b, mode);
        assertEquals(expectedResult, actualResult);
    }
    
}
