//Mozemo pisati java programe koje prate vise setova instrukcija - to se zove Control Flow
package lesson2_Conditionals_and_Control_Flow;

public class Conditionals {

	public static void main(String[]args){
		
		if(5<4 && 0<5){
			System.out.println("You ordered a cup of hot, mint tea.");
		} else if(18 <= 19 || 17 >= 17){
			System.out.println("You ordered freshly squeezed orange juice!");
		} else if (!(true == true)){
			System.out.println("You ordered hot cocoa");
		}
		
		char answerChoice = 'A';
		
		switch(answerChoice){
		
		case 'A': System.out.println("You answered: " + answerChoice + " . Please try again.");
		break;
		
		case 'B': System.out.println("You answered: " + answerChoice + " . Please try again.");
		break;
		
		case 'C': System.out.println("You answered: " + answerChoice + " . Please try again.");
		break;
		
		case 'D': System.out.println("You answered: " + answerChoice + " . Please try again.");
		break;
		
		default:
			System.out.println("Please select a valid answer choice. ");
		}
	}
}
