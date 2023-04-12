import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {

//       1. Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

        int i = 5;
        while (i <= 15) {
            System.out.print(" " + i);
            i++;
        }
        System.out.println("\n");
//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.


        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        System.out.println("\n");

//        long = i 2 (?)

        //        Alter your loop to count backwards by 5's from 100 to -10.

        i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

        System.out.println("\n");
        //        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

        long y = 2;
        do {
            System.out.println(y);
            y *= y;
        } while (y <= 1_000_000);

        System.out.println("\n");

//        Refactor the previous two exercises to use a for loop instead.

        for (i = 100; i > -10; i -= 5) {
            System.out.println(i);
        }
        System.out.println("\n");

        for (long g = 2; g <= 1_000_000; g *= g) {
            System.out.println(g);
        }
        System.out.println("\n");
        //FizzBuzz

        for (int z = 1; z < 100; z++) {
            boolean divideBy3 = (z % 3) == 0;
            boolean divideBy5 = (z % 5) == 0;

            if (divideBy3 && divideBy5) {
                System.out.println("FizzBuzz");
            } else if (divideBy3) {
                System.out.println("Fizz");
            } else if (divideBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(z);
            }
        }
        System.out.println("\n");

        //Table of Powers
        Scanner userInput = new Scanner(System.in);

        boolean confirm;

        do {
            System.out.print("Enter a number: ");
            int userNumber = userInput.nextInt();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------ | ------");


            for (int t = 1; t <= userNumber; t++) {
                System.out.printf("%7d|%9d|%6d\n", t, t * t, t * t * t);
            }

            System.out.println("Would you like to continue? (Y/N)");
            confirm = userInput.next().equalsIgnoreCase("y");
        } while (confirm);

//   Convert Grades

        boolean confirm2 = false;

        int grade;
        do {
            System.out.print("Enter a numerical grade: ");
            grade = userInput.nextInt();

            if (grade < 60) {
                System.out.println("F");
            } else if (grade < 67) {
                System.out.println("D");
            } else if (grade < 80) {
                System.out.println("C");
            } else if (grade < 88) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }

            System.out.println("Would you like to continue? (Y/N)");
            confirm2 = userInput.next().equalsIgnoreCase("y");

        } while (confirm2);
    }

}