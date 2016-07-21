/*if/else statements can become lengthy even when you simply want to
 *  return a value depending on a Boolean expression. Fortunately, Java provides a 
 *  shortcut that allows you to write if/else statements in a single line of code.
 *   It is called the ternary conditional statement.

The term ternary comes from a Latin word that means "composed of three parts".

These three parts are:

A Boolean expression
A single statement that gets executed if the Boolean expression is true
A single statement that gets executed if the Boolean expression is false*/


package lesson2_Conditionals_and_Control_Flow;

public class Ternary {
	public static void main(String[] args) {
		
		int fuelLevel = 3;
//Izraz fuelLevel>0 je true, sto znaci da ce se ispisati prvi izraz poslije ?,a to je Y
		char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		System.out.println(canDrive);

	}
}
