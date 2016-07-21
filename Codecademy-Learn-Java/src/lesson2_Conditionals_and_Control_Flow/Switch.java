/* The conditional statements that we have covered so far require Boolean 
 * expressions to determine which code block to run. Java also provides a way to
 *  execute code blocks based on whether a block is equal to a specific value.
 *   For those specific cases, we can use the switch statement, 
 *   which helps keep code organized and less wordy. */

//Za vise slucajeva koristimo switch petlju, ako je jedna od njih tocna izvest ce se,
//ako nije nijedna tocna, onda ce se izvesti kod pod default
package lesson2_Conditionals_and_Control_Flow;

public class Switch {
	
	public static void main(String[]args){
		
		char penaltyKick = 'C';
		
		switch(penaltyKick){
		
		case 'L': System.out.println("Messi shoots to the left and scores!");
		break;
		case 'R': System.out.println("Messi shoots to the right and misses the goal!");
		break;
		case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
		break;
		default:  System.out.println("Messi is in possition!");
		
		}
	}

}
