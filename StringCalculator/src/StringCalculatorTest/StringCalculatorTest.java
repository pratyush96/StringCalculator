package StringCalculatorTest;
import stringCalculator.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
			assertEquals(stringCalculator.add(""),0);
			
		}
		
		@Test
		public  void singleValueStringReturnNumber() {
			assertEquals(stringCalculator.add("1"),1);
		}

		@Test
		public  void twoNubersUsingCommaDelimetrs() {
			assertEquals(stringCalculator.add("1,2"),3);
		}

	}

