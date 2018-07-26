package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String stringCheese) {
		String funkyString = "";
		for (int i = 0; i < stringCheese.length(); i++) {
			if (i % 2 == 1) {
				funkyString+=("" + stringCheese.charAt(i)).toUpperCase();
			}
			else{
				funkyString += ("" + stringCheese.charAt(i)).toLowerCase();
			}
		}
		return funkyString;
	}

}
