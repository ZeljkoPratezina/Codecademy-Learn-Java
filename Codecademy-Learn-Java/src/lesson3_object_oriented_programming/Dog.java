/*
 
2.
 One fundamental concept of object-oriented programming in Java is the class.

A class is a set of instructions that describe how a data structure should behave.

Java provides us with its own set of pre-defined classes, but we are also free to create our own custom classes.

Classes in Java are created as follows:

//Create a custom Car class

class Car {

}
The example above creates a class named Car. We will define the behavior of the Car data structure in the next exercise.
Instructions
1.
In the code editor, create a Dog class. Use the example above to help you. For now, you can ignore the line(s) of code at the bottom. We will return to it later in this lesson.
 3.
 
 We're off to a good start! We created a Java class, but it currently does not do anything; we need to describe the behavior of the class for it to be useful.

Let's start by creating the starting state of our class. We can do this by adding a class constructor to it.

A class constructor will allow us to create Dog instances. With a class constructor, we can set some information about the Dog.
If we do not create a class constructor, Java provides one that does not allow you to set initial information.
The code below demonstrates how a class constructor is created:

class Car {

    //The class constructor for the Car class
    public Car() {

    }
}
In the example above, we created a class constructor for the Car class. This constructor will be used when we create Car instances later. The public keyword will be explained later in this course.
Instructions
1.
Add a class constructor called Dog to the class.

Note: If you're getting an error in the console about a main method, include the following code within the Dog class (it will be explained later in this lesson):

public static void main(String[] args) {

}
 
 4.
 When we create a new class, we probably have specific details that we want the class to include. We save those specific details into instance variables.

Here is an instance variable in the Car class that describes a detail that we might want to associate with a car:

class Car {

    //Using instance variables to model our Car class after a real-life car
    int modelYear;

    public Car() {

    }
}
In the example above, we created the instance variable named modelYear. Instance variables model real-world car attributes, such as the model year of a car. Finally, the instance variable is represented by the int data type.
Instructions
1.
Let's model the Dog class after a real-world dog. Create an int instance variable called age.
5.
Perfect! By adding a class constructor and creating instance variables, we will soon be able to use the Dog class. However, the class constructor Dog is still empty. Let's modify this by adding parameters to the Dog constructor.

You can think of parameters like options at an ice cream store. You can choose to order a traditional ice cream cone, but other times you may want to specify the size of the cone or the flavor of the ice cream.

For the Dog class, we can specify the initial dog age by adding parameters to the class constructor.

Parameters allow data types to be created with specified attributes.
Let's add parameters to our Car class constructor:

class Car {

    //Use instance variables to model our Car class after a real-life car
    int modelYear;

    public Car(int year) {

        modelYear = year;
    }
}
In the example above, we add the int parameter year to the Car constructor.

The value of modelYear will equal the int value that is specified when we first use this class constructor.
6.

We're almost ready to use our custom Dog class! But first, we need to understand how to structure and run our Java program.

You may have noticed a mysterious looking line of code in previous lessons that looks like this:

public static void main(String[] args) {

}
This is Java's built-in main method. We will learn more about methods and keywords around the main method later on, but first let's understand what the purpose of main is.

When Java runs your program, the code inside of the main method is executed.
For now, you can ignore the keywords in the main method that we have not yet covered. You will learn about them later in the course.
Instructions
1.
Your Dog class already has a main method. It should look like the following:

public static void main(String[] args) {

}
Do not include anything inside of the main method yet. Click Run to continue.

7.

Perfect! Now that we have a main method in our class, we're ready to start using the Dog class.

To use the Dog class, we must create an instance of the Dog class. An instance of a class is known as an object in Java.

The example below demonstrates how to create a Car object:

class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007);

    }
}
In the example above, we create a Car object named myFastCar. When creating myFastCar, we used the class constructor and specified a value for the required int parameter year.

2007 is the model year of myFastCar. Note that we declared the new object inside the main method.
Instructions
1.
Inside of main, use the Dog constructor to create a Dog object and assign it to the variable spike. Make sure that you specify the required int parameter age.
8.

Great work! We created a Dog object inside of the main method, but...nothing happened.

Although we created an object inside of main method, we did not print out anything about the spike object itself, nor did we instruct the class to perform any actions. Let's learn about how methods in Java are used to define actions.

A method is a pre-defined set of instructions. Methods are declared within a class. Java provides some pre-defined methods available to all classes, but we can create our own as well.

Let's create a new method:

class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    //Our new method to help us get "started"
    public void startEngine() {

        System.out.println("Vroom!");

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007);

    }
}
In the example above, we added a method called startEngine. When the method is used, it will print out Vroom!. The void keyword will be explained later in this course.

Note that the startEngine method is created outside of the main method, like the constructor was.
Instructions
1.
In between the constructor and the main method, add a method called bark to the Dog class by typing:

public void bark() {

}
2.
Inside the bark method, type:

System.out.println("Woof!");
9.
Great! Now the bark method is available to use on the spike object. We can do this by calling the method on spike.

Here is an example of calling a method on an object using the Car class:

class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    public void startEngine() {

        System.out.println("Vroom!");

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007);
        myFastCar.startEngine();
    }
In the example above, we call the startEngine method on the myFastCar object. Again, this occurs inside of the main method. Running the program results in printing Vroom! to the console.
Instructions
1.
Inside of the main method of the Dog class, call the bark method on the spike object.
10.
Fantastic! Similar to constructors, you can customize methods to accept parameters.

class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    public void startEngine() {
        System.out.println("Vroom!");
    }

    public void drive(int distanceInMiles) {

        System.out.println("Miles driven: " + distanceInMiles);

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007);
        myFastCar.startEngine();
        myFastCar.drive(1628);

    }
In the example above, we create a drive method that accepts an int parameter called distanceInMiles. In the main method, we call the drive method on the myFastCar object and provide an int parameter of 1628.

Calling the drive method on myFastCar will result in printing Miles driven: 1628 to the console.
1.
In between the bark and main methods, add a method called run to the Dog class by typing:

public void run() {

}
2.
Modify the run method so that it accepts an int parameter called feet.
3.
Inside of the run method, type:

System.out.println("Your dog ran " + feet + " feet!");
4.
Inside of the main method, call the run method on the spike object. You can pass in an int parameter of your choice
11.

Let's explore one of the keywords used in declaring a method. In past exercises, when creating new methods, we used the keyword void.

The void keyword indicates that no value should be returned by the method after it executes all the logic in the method. If we do want the method to return a value after it finishes running, we can specify the return type.

The void keyword (which means "completely empty") indicates to the method that no value is returned after calling that method.
Alternatively, we can use data type keywords (such as int, char, etc.) to specify that a method should return a value of that type.
An example of indicating a return value for a method is below:

class Car {

    int modelYear;

    public Car(int year) {

        modelYear = year;

    }

    public void startEngine() {

        System.out.println("Vroom!");

    }

    public void drive(int distanceInMiles) {

        System.out.println("Your car drove " + distanceInMiles + " miles!");

    }

    public int numberOfTires() {

        return 4;

    }

    public static void main(String[] args){

        Car myFastCar = new Car(2007)
        myFastCar.startEngine();
        myFastCar.drive(1628);

        int tires = myFastCar.numberOfTires();
        System.out.println(tires);

    }
}
In the example above, we created the numberOfTires method. This method specifies that it will return an int data type. Inside of the method, we used the return keyword to return the value of 4 which is an int type.

Within main, we called the numberOfTires method on myFastCar. Since the method returns an int value of 4, we store the value within an int variable called tires. We then print the value of tires to the console.
1.
In between the run and main methods, add a method called getAge that returns age by typing:

public int getAge() {

    return age;

}
2.
Inside of main, set an int variable spikeAge to the value returned by spike.getAge();
3.
On the next line, print out the age by typing:

System.out.println(spikeAge);
  */


package lesson3_object_oriented_programming;

class Dog extends Animal {
	  
	  int age;

		public Dog(int dogsAge) {
	    
	  	age = dogsAge;
	    
	  }
	  
	  public void bark() {
			
	    System.out.println("Woof!");
	    
		}
		
	  public void run(int feet) {
	    
	    System.out.println("Your dog ran " + feet + " feet!");

		}
	  
	  public int getAge() {

	    return age;
	    
		}
	  
		public static void main(String[] args) {
	    
	    Dog spike = new Dog(5);
	    spike.bark();
	    spike.run(40);
	    int spikeAge = spike.getAge();
	    System.out.println(spikeAge);
	    spike.checkStatus();

		}

	}
