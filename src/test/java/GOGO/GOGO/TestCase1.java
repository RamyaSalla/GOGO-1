// This Test would shuffle and then show the card to be removed from the position
package GOGO.GOGO;
import com.qa.base.MainCard;

public class TestCase1 {
	public static void main(String[] args) throws Exception {
		
		MainCard obj = new MainCard();
		obj.shuffle();
		obj.RemoveCard();		
	}
}
