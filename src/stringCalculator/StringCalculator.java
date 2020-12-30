package stringCalculator;

public class StringCalculator {
	
	public  int add( String numbers) {
		int returnValue = 0;
		String[] numbersArray = numbers.split(",|\n"); // Added |\n to the split regex
		for (String number : numbersArray) {
			if (!number.trim().isEmpty()) {
				returnValue += Integer.parseInt(number.trim());
			}
		}
		return returnValue;
	}

}
