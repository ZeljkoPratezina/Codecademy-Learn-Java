/*
 * In the previous lesson, you learned a few of the object-oriented programming concepts used in Java: 
 * classes, objects, methods, and inheritance. 
 * In this lesson, you will learn how to use some of the classes and methods built into Java to write
 *  programs to create, manipulate, and store information in data structures.
Instructions
1.
Take a look at the code in the editor below. You'll learn how to use them to create,
 store, and manipulate data in data structures.

Click Run to run the code.   
 *    */

package lesson4_data_structures;

import java.util.*;

public class Olympics {

	public static void main(String[] args) {

		//Some Olympic sports 

		ArrayList<String> olympicSports = new ArrayList<String>();
		olympicSports.add("Archery");
		olympicSports.add("Boxing");
		olympicSports.add("Cricket");
		olympicSports.add("Diving");

		System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");

		for (String sport: olympicSports) {
			System.out.println(sport);
		}

		//Host cities and the year they hosted the summer Olympics

		HashMap<String, Integer> hostCities = new HashMap<String, Integer>();

		hostCities.put("Beijing", 2008);
		hostCities.put("London", 2012);
		hostCities.put("Rio de Janeiro", 2016);

		for (String city: hostCities.keySet()) {
			
			if (hostCities.get(city) < 2016) {

				System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");

			} else {

				System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");

			}
		}

	}

}
