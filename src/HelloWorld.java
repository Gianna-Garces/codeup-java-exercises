public class HelloWorld {
    public static void main (String [] args){
        System.out.println("Hello, World!");

//       1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
        int myFavoriteNumber = 11;
        System.out.println(myFavoriteNumber);


//       2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
        String myString = "Hello";
        System.out.println(myString);

//       3. Change your code to assign a character value to myString.

//        myString = 'H';

//        What do you notice?

//        Error: incompatible types: char cannot be converted to java.lang.String

//        wound need to be: myString = "H";
//
//       4. Change your code to assign the value 3.14159 to myString. What happens?

//        myString = 3.14159;

//        What happens?

//        Error: incompatible types: double cannot be converted to java.lang.String

//        would need to be:  myString = "3.14159";

//
//        5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console.

//        long myNumber;
//        System.out.println(myNumber);

//        What happens?

//        Error: myNumber might not have been initialized

//
//        6. Change your code to assign the value 3.14 to myNumber.
//
//        long myNumber = 3.14;
//
//        What do you notice?

//        Error: Incompatible types. Found: 'double', required: 'long'
//
//        7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        long myNumber = 123L;
//        System.out.println(myNumber);
//
//        8. Change your code to assign the value 123 to myNumber.

//        long myNumber = 123;
//        System.out.println(myNumber);

//
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//        9. Change your code to declare myNumber as a float. Assign the value 3.14 to it.

//        float myNumber = 3.14;

//      What happens? What are two ways we could fix this?
//
//      Error: Incompatible types. Found: 'double', required: 'float'

//       1) I could add F at the end, 3.14F
//       2) I could do double myNumber = 3.14;


//        10. Copy and paste the following code blocks one at a time and execute them

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


//        What is the difference between the above code blocks? Explain why the code outputs what it does.

//        Line 82 prints out 5 and line 83 prints out 6 because it is a post increment (++x), of x which is 5, 5 +1 =6
//        Line 87 prints out 6 as well.  It is pre increment (x++), still gives 6.
//


//
//        11. Try to create a variable named class.

//        Sting class;

//        What happens?
//
//        Error: not a statement
//
//        12. Object is the most generic type in Java. You can assign any value to a variable of type Object.
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        What do you think will happen when the following code is run?
//
//        Error: String cannot be cast to Integer.
//
//        Line 111, I'm trying to cast object o, the value cannot be cast into the integer


//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//                How is the above example different from the code block below?

//        int three = (int) "three";

//      Error: String cannot be converted to int

//      Cannot use the casting method, since they are different data types, string and integer


//      13.  Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
//
//
//        x += 5;
//
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//
//        y *= x;


//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//
//        x /= y;
//        y -= x;



//        14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//        int number = 214748364700;

//        int num too large, with 00 added to the end

        int number = Integer.MAX_VALUE +1;
        System.out.println(number);




    }
}
