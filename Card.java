

public class Card{
	
	//Instance variables
	private double count = 0;
	private double numberOfCards = 416.0;
	private double decks = numberOfCards / 52.0; 


	//Method to update the count based on if the user inputs +,-,.
	public void processCard(String card){

			//+ is used for cards with a value >= 10
			if(card.equals("+")){
				++count;
				--numberOfCards;
				decks = numberOfCards / 52.0;
			}

			//- is used for cards with a value <=6
			else if(card.equals("-")){
				--count;
				--numberOfCards;
				decks = numberOfCards / 52.0;

			}

			//. is used for cards with a value > 6 and a value <=9
			else if(card.equals(".")){
				--numberOfCards;
				decks = numberOfCards / 52.0;
			}

		
	}

	//Method to get the running count
	public String getRunningCount(){
		String runStringValue = String.format("%.3f" ,count);
		return runStringValue;
	}


	//Method to get the true count
	public String getTrueCount(){
		double trueCount = count / decks;
		String trueStringValue = String.format("%.3f", trueCount);
		return trueStringValue;
	}

	//Num decks getter
	public String getNumDecks(){
		double numDecks = decks;
		String deckStringValue = String.format("%.2f", numDecks);
		return deckStringValue;
	}

	//Reset the counter method
	public void reset(){
		count = 0;
		numberOfCards = 416.0;
	}

	


	

	


}