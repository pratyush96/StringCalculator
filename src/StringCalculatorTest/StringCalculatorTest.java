package StringCalculatorTest;
import stringCalculator.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {

	public StringCalculator stringCalculator;
	@Before
	public void init() {
		 stringCalculator= new StringCalculator();
	}
	
		
		@Test
		public  void emptyStringReturnZero() {
			Assert.assertEquals(stringCalculator.add(""),0);
			
		}
		
		@Test
		public  void singleValueStringReturnNumber() {
			Assert.assertEquals(stringCalculator.add("1"),1);
		}

		@Test
		public  void twoNubersUsingCommaDelimetrs() {
			Assert.assertEquals(stringCalculator.add("1,2"),3);
		}
		
		@Test
		public  void unkwonAmountOfNumberReturnValuesAreTheirSums() {
			Assert.assertEquals(stringCalculator.add("3,6,15,18,46,33"),3+6+15+18+46+33);
		}

		@Test
		public void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
			Assert.assertEquals(stringCalculator.add("3,6\n15"),3+6+15);
		}
		@Test
	    public void testOtherDelimiter(){
	    	Assert.assertEquals( stringCalculator.add("//;\n1;2"),3);
	    }
	}

