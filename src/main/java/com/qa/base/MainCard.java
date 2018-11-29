// This Package would have all the Basic functionality of the business
// git commit
//CHnage sadfaasfaf
//sadadsadsadadasdsadasads
package com.qa.base;
import com.qa.util.ConfigValues;

public class MainCard {
	int[] deckSize;
	int b;
	String[] symbols = {"Spades", "Heart", "Diamonds", "Clubs"};
    String[] type = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King"};

    
 //Constructor which loads the configuration properties file at start of the test   
   public MainCard() throws Exception
    {
	    ConfigValues obj1 = new ConfigValues();
	    int Count = obj1.TotalCards();
		//int Count=obj1.CardRemove();
		deckSize=new int[Count];		
		b= obj1.getValue("Card");
    }

// This method check no of cards in the deck and shuffle the card randomly   

        public void shuffle(){	 
        	System.out.println( "Size of the deck is " + deckSize.length );
		   for (int i = 0; i < deckSize.length; i++) {			   
			   int New = (int)(Math.random()* deckSize.length);
			    int Old = deckSize[i];
			       deckSize[i] = New;
			       New = Old;			      
			     }
// This method would display all the card after the shuffle
	}
    public void display(){
    	 for (int i = 0; i < deckSize.length; i++) {
    	  String Sym = symbols[deckSize[i] / 13];
          String Num = type[deckSize[i] % 13];
         System.out.println( Num +" of "+ Sym);
            }
  //This method would show the card to be removed from the deck mentioned in the 
   //card properties file
    }
    public void RemoveCard(){    	
    	 String Sym = symbols[deckSize[(b -1)] / 13];
         String Num = type[deckSize[(b-1)] % 13];
         System.out.println( "Card to be removed at position " + b + " is " );
        System.out.println( Num +" of "+ Sym);
       }
    
    
   }
	

