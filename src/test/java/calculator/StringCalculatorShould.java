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

  
}