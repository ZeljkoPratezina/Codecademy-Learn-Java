/*Sometimes we execute one block of code when the Boolean expression after the if keyword is true.
 *  Other times we may want to execute a different block of code when the Boolean expression is false.
We could write a second if statement with a Boolean expression that is opposite the first,
 but Java provides a shortcut called the if/else conditional.
The if/else conditional will run the block of code associated with the if statement if 
its Boolean expression evaluates to true.
Otherwise, if the Boolean expression evaluates to false, 
it will run the block of code after the else keyword.*/

// Ako je boolean izraz za if petlju true, izvodi se blok koda unutar if petlje,
// Ako nije true, onda se izvodi blok koda unutar else petlje
package lesson2_Conditionals_and_Control_Flow;

public class IfElse {

	public static void main(String[]args){
		
	if(7<6){                                   //7<6 je false, sto znaci da se nece izvesti kod unutar if petlje,
		                                       //nego kod unutar else petlje
		System.out.println("Try again...");
		
	}else{
		
		System.out.println("Success!");
	}
	}
}
