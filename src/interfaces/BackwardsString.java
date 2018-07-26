package interfaces;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String stringCheese) {
		String reverseStringCheese = "";
		for (int i = stringCheese.length()-1; i > -1; i--) {
			reverseStringCheese += ("" + stringCheese.charAt(i));
		}
		return reverseStringCheese;
	}

}
