package evendigitsum;

public class Evendigitsum {

	public static void main(String[] args) {
		System.out.println(evenDigit(123456789));
		System.out.println(evenDigit(-22));
		System.out.println(evenDigit(2));
		System.out.println(evenDigit(400));
		System.out.println(evenDigit(252));
		System.out.println(evenDigit(0));
		
	}
	public static int evenDigit(int number) {
		int sum=0;
		if(number < 0)
			return -1;
		while(number > 0) {
			int lastdigit = number%10;
			if(lastdigit%2==0) {
				sum= sum+lastdigit;
			}
			number= number/10;
		}
		return sum;
	}

}
