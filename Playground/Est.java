package Playground;

// import java.lang.reflect.Array;


public class Est {

    public static void main(String [] args) {

        // Running method that uses print method designed for newer and easier print to standard output
        MyMethod();

        // Running method that uses the traditional print method of Java
        // stringTests();


    }
        
    public static void MyMethod() {
        IO.println("Welcome to Lloyds Java programming!");

        IO.print(42);
        System.out.println(" ");

        IO.println("10 + 5 = " + (10 + 5));
    }

    public static void stringTests() {
        System.out.println("Hey");

        var a = "some People are nice, some are not nice.";
        var y = false;
        System.out.println(y);
        System.out.println(y);
        System.out.println(a);

        // Now print some parts of the string 'some People are nice, some are not nice.'
        System.out.println(a.indexOf("People"));
        System.out.println("The substring of \"some People are nice, some are not nice.\" from index 5 of"  + a +  "is: " + a.substring(5, a.length()));

        System.out.println("The substring of " + a + "from index 5 of "  + a +  "is: " + a.substring(5, a.length()));

        System.out.println("The substring of " + a + "from index 5 of "  + a +  "is: " + a.substring(5));
        
        // Array first_Array = [10];
        String txt = "    Big dog     !";
        System.out.println(txt);
        System.out.println(txt.trim());
        String new_txt = txt.trim();
        System.out.println("New string is: " + new_txt);
        int exclamation = new_txt.indexOf("!");
        System.out.println(exclamation);
        String substring = new_txt.substring(0, exclamation-1);
        System.out.println(substring);
        System.out.println(substring.trim() + "!");
        System.out.println(txt.trim());
    }

    
}