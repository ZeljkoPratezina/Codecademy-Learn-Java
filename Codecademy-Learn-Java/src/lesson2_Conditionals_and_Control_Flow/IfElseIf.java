/*Good work! In some cases, we need to execute a separate block of code depending on different Boolean expressions.
 *  For that case, we can use the if/else if/else statement in Java.

If the Boolean expression after the if statement evaluates to true, 
it will run the code block that directly follows.
Otherwise, if the Boolean expression after the else if statement evaluates to true,
 the code block that directly follow will run.
Finally, if all previous Boolean expressions evaluate to false, 
the code within the else block will run.*/


package lesson2_Conditionals_and_Control_Flow;

public class IfElseIf {

	public static void main(String[]args){
		int round=6;
		 
		if(round>12) {
			
				System.out.println("The match is over!");        //round>12 je false, nece se izvesti
			
			} else if(round>7){
		
				System.out.println("The match is underway!");   //round>7 je false, nece se izvesti
			}else{
		
				System.out.println("The boxing match didn't started yet!");	//posto su oba boolean izraza pod if i ifelse false,
				                                                            //izvest ce se kod pod else petljom
			}
	}
}
