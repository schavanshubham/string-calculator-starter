package calculator;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
class StringCalculatorShould {
	
	private StringCalculator stringCalculator;
	
	@BeforeTest
	public void init() {
		try {
			stringCalculator = new StringCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

   
   public void empty_string_should_return_0() throws Exception {
        assertEquals(stringCalculator.add(""),0);   
    }
   public void twoNumbersCommaDelimitedReturnSum()throws Exception {
	   	assertEquals(stringCalculator.add("1,2"),3);
	   }
   public void twoNumbersNewLineDelimitedReturnSum()throws Exception {
	   	assertEquals(stringCalculator.add("1\n2"),3);
	   }
   public void threeNumbersDelimitedBothWayReturnSum() throws Exception{
	   	assertEquals(stringCalculator.add("1,2,3"),6);
	   }
   public void multipleDelimiterReturnSum() throws Exception {
	   	assertEquals(stringCalculator.add("1;2"),3);
	   }
   @Test(expectedExceptions=Exception.class )
   public void  negativeInputReturnsException() throws Exception {
   	stringCalculator.add("-1");
   }
   public void ignoreNumbersGreaterThan1000() throws Exception {
	   	assertEquals(stringCalculator.add("10,10,1001"),20);
	   }
}