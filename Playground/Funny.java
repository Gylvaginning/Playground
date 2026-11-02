package Playground;

public class Funny {
    public static void main(String [] args) {
        // IO.println("Passed argument(s) was " + args[0] + " " +  args[1] + " " + args[2]);
        // Run the hellowWorld method
        hellowWorld();
        IO.println();
        IO.println();

        // Run the printpassedArgument method, *NOTE* program execution will fail and give an array out of bound exception if three arguments are not provided when executing the program.
        try {
            printpassedArgument(args[0], args[1], args[2]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            IO.println(e);
        }
        finally {
            IO.println("I will still continue running");
        }
        
        IO.println();
        IO.println();

        int numberthree1 = 1239; 
        int numberthree2 = 85;

        // Check to see if I can add the numbers from two different methods belonging to two different classes
        IO.println(CalculateNumberOne.calculateNumber() + CalculateNumberTwo.calculateNumber() + CalculateNumberThree.generateNumberThree(numberthree1, numberthree2));

        // The above worked, but it would be nice to see if I can utilise the methods of the object of each class that I can create from the constructor that I must define for these classes?? 


    }

    // Method for printing an argument passed into the called program/application
    public static void printpassedArgument(String var, String var2, String var3) {
        IO.println("Passed argument was " + var + " " + var2 + " " + var3);
    }

    // Method for printing HelloWorld
    public static void hellowWorld() {
        IO.println("Hello, World!");
        var name = IO.readln("What is your name? "); 
        IO.println("Hello " + name);
    }
}

class CalculateNumberOne {
    // Instance variables (class fields)
    int numberOne;
    int numberTwo;
    
    // Constructor
    public CalculateNumberOne(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    // Method
     static int calculateNumber() {
        return (51 + 1);
     }


    //static Int CalculateNumberOne() {
        // var numberone = 1;
        // var numbertwo = 54;
        // var addition = numberone + numbertwo;
    //}
}

class CalculateNumberTwo {
    // Constructor

    // Method
    static int calculateNumber() {
        return (1 + 54);
    }
}

class CalculateNumberThree {

    // int someNumber = 398;
    // int anotherNumber = 123;


    // Static method: This method belongs to the CLASS, rather than to an OBJECT of that CLASS
    static int generateNumberThree(int a, int b) {
        return (a + b);
    }
}