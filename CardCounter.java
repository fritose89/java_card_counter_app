import java.util.Scanner;

public class CardCounter {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double numberOfCards = 416.0;
        double decks = numberOfCards / 52.0;
        
       
        
        while(true){
            
            System.out.println("Enter + - . or 1 to exit");
            String input = scanner.nextLine();

            if(input.equals("+")){
                ++count;
                --numberOfCards;
                decks = numberOfCards / 52.0;
                
            }
            else if(input.equals("-")){
                --count;
                --numberOfCards;
                decks = numberOfCards / 52.0;
                
            }
            else if(input.equals(".")){
                --numberOfCards;
                decks = numberOfCards / 52.0;
                
            }
            else if (input.equals("1")){
                System.out.println("Exiting the programs");
                break;
            }
            else{
                System.out.println("invaid input");
                continue;
            }
            
            double trueCount = count / decks; 
            System.out.printf("The true count is : %.3f%n", trueCount);
            System.out.printf("Amount of Decks Remaining: %.3f%n", decks);
            System.out.printf("Amount of Cards Remaining: %.1f%n", numberOfCards);
        }
        
        
    }
    
}
