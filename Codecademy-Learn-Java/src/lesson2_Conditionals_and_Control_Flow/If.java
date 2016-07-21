/*Let's get familiar with how relational, equality, and Boolean operators can be used
 *  to control the flow of our code.
We'll start by exploring the if statement.
In Java, the keyword if is the first part of a conditional expression.
It is followed by a Boolean expression and then a block of code.
 If the Boolean expression evaluates to true, the block of code that follows will be run.*/


/*If statement ili if petlja  se koristi boolean izrazom true,
tj. ako je boolean izraz true, onda ce se izvoditi kod unutar zagrade*/
package lesson2_Conditionals_and_Control_Flow;

public class If {
	
	public static void main(String[]args){
		
		if(1>0){
			System.out.println("Access granted! ");
		}
	}

}
