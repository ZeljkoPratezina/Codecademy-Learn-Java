/*
 * Fantastic! For loops will be useful when reading and manipulating Java data structures. 
 * Let's talk about a few data structures that are built into Java. The first data structure
 *  we will explore is called the ArrayList.

The ArrayList stores a list of data of a specified type. Let's go through an example of how to create,
 or declare, an ArrayList of type Integer.

ArrayList<Integer> quizGrades = new ArrayList<Integer>();
ArrayList is a pre-defined Java class. To use it, we must first create an ArrayList object.

In the example above, we create an ArrayList object called quizGrades that will store data 
types belonging to the <Integer> class (whole numbers).
Instructions
1.
Inside of the main method, create an ArrayList object called weeklyTemperatures that will store Integer data types.
 * */


/*
 * You created an ArrayList in the last exercise to store temperature data, 
 * but it does not contain any values yet.

Let's add some values of type Integer to the ArrayList, one by one, like this:

ArrayList<Integer> quizGrades = new ArrayList<Integer>();
quizGrades.add(95);
quizGrades.add(87);
quizGrades.add(83);
In the example above, we call the add method on quizGrades. 
The add method adds integers to the ArrayList.
 The values 95, 87, and 83 are added to the list.
Instructions
1.
Add some temperatures to weeklyTemperatures. First, add a temperature value of 78.
2.
Next, add a temperature of 67.
3.
Add another temperature of 89.
4.
Finally, add a temperature of 94.
 * */

/*
 * Great! Now we can start accessing the temperatures that our ArrayList stores.

We can access the elements of weeklyTemperatures by using an element's index, or position, in the list.

An element's index refers to its location within an ArrayList. ArrayLists in Java are zero-indexed, which means that the first element in an ArrayList is at a position of 0.

Here is an example of accessing the element in the first position of the list:

ArrayList<Integer> quizGrades = new ArrayList<Integer>();
quizGrades.add(95);
quizGrades.add(87);
quizGrades.add(73);

System.out.println( quizGrades.get(0) );
The example above will print out the grade value of 95.

The index of the element containing the value 95 is at position 0 in the ArrayList. We access the value by providing its index to the get method.
Instructions
1.
Use the get method to print out the lowest temperature contained in weeklyTemperatures.
 * */

package lesson4_data_structures;

import java.util.ArrayList;

public class Temperatures {
	
	public static void main(String[] args) {
//ArrayList - lista podataka , moramo kreirati i objekt koje ce spremiti podatke tipa integer
	ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
//ako zelimo dodati neke vrijednosti tipa integer, koristimo metodu add
    weeklyTemperatures.add(78);
    weeklyTemperatures.add(67);
    weeklyTemperatures.add(89);
    weeklyTemperatures.add(94);
   //da bi isprintali odredenu vrijednost , koristimo get metodu i broj indexa te vrijednosti - get(1) 
    System.out.println( weeklyTemperatures.get(1) );
    
	}
}