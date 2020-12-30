package stringCalculator;

public class StringCalculator {
	
	public  int add(String numbers) {
		String[] numberArray= numbers.split(",");
		if(numbers.isEmpty()) {
			return 0;
		}
		else if (numberArray.length==1) {
			return Integer.parseInt(numbers);
		}
		else {
			return (Integer.parseInt(numberArray[0])+Integer.parseInt(numberArray[1]));
		}
	}

}
