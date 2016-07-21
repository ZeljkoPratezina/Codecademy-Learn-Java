/*Java is an object-oriented programming (OOP) language, which means that we can design classes, objects, and methods that can perform certain actions. These behaviors are important in the construction of larger, more powerful Java programs.

In this lesson, we will explore some fundamental concepts of object-oriented programming to take advantage of the power of OOP in Java.
Instructions
1.
Check out the code in the editor. It incorporates classes, objects, and methods. After this lesson, you'll be able to read and write Java programs that use the OOP model.

Click Run to run the code.*/

package lesson3_object_oriented_programming;

public class Mouse extends Rodentia {

	String name;

	public Mouse(String name) {

		this.name = name;

	}

	public void eat() {

		System.out.println(name + " ate some cheese pizza!");

	}

	public void solveMaze(int minutes) {

		System.out.println(name + " solved the maze in " + minutes + " minutes!");

	}

	public static void main(String[] args) {

		Mouse ratly = new Mouse("Ratly");
		ratly.eat();
		ratly.solveMaze(3);
		ratly.order();

	}

}