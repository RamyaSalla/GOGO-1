// This Test would shuffle and then display the card to User
package GOGO.GOGO;

import com.qa.base.MainCard;

public class TestCase2 {
	public static void main(String[] args) throws Exception {
		
		MainCard obj = new MainCard();
		obj.shuffle();
		obj.display();		
	}
}
