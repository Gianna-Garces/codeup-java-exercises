import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);


        System.out.println("\n");

//         Scanner Class

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInt = userInput.nextInt();
        System.out.println(userInt);

//        *What happens if you input something that is not an integer?
//        Error: Exception in thread "main" java.util.InputMismatchException

        System.out.println("\n");
        System.out.println("Enter three words: ");
        String wordOne = userInput.next();
        String wordTwo = userInput.next();
        String wordThree = userInput.next();

        System.out.printf("1: %s\n2: %s\n3: %s", wordOne, wordTwo, wordThree);

//        *What happens if you enter less than 3 words?
//        doesn't run, waits for another word to be typed
//        *What happens if you enter more than 3 words?
//        ignores the extra words, only prints out the first three

        System.out.println("\n");

        System.out.println("Enter a sentence:");
        userInput.nextLine();
        String sentence = userInput.nextLine();
        System.out.println(sentence);

        System.out.println("\n");
//        Calculate the perimeter and area of Codeup's classrooms.

        System.out.println("Enter a length: ");
        String lengthString = userInput.nextLine();
        int length = Integer.parseInt(lengthString);

        System.out.println("Enter a width: ");
        String widthString = userInput.nextLine();
        int width = Integer.parseInt(widthString);

        int area = length * width;
        int perimeter = (2 * length) + (2 * width);

        System.out.printf("Area: %d\nPerimeter: %d\n", area,perimeter);

    }
}
