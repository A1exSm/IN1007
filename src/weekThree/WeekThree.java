package weekThree;
import java.util.Scanner;

public class WeekThree {
    public void greet(String[] arguments) {
        //Checks whether any arguments have been provided, and gives an appropriate greeting.
        if (arguments.length > 0) System.out.println("Hello " + arguments[0]);
        else System.out.println("Hello");
    }

    public String inputString(String statement) {
        Scanner sc = new Scanner(System.in);
        System.out.println(statement);
        return sc.nextLine();
    }

    public int inputInt(String statement) {
        Scanner sc = new Scanner(System.in);
        System.out.println(statement);
        return sc.nextInt();
    }

    public void exerciseFive() {
        String name_of_the_TA = inputString("Please enter the name of a TA:\n");
        String name_of_the_student = inputString("Please enter your name:\n");
        System.out.println("Dear " + name_of_the_TA + ",\nI enjoy your tutorials, they are awesome!\n" + name_of_the_student + ".");
    }

    public void increasingOrder() {
        int num1 = inputInt("Please enter the first number:\n");
        int num2 = inputInt("Please enter the second number:\n");
        int num3 = inputInt("Please enter the third number:\n");
        if (num1 < num2 && num2 < num3) System.out.println("True");
        else System.out.println("False");
    }

    public void isPalindrome() {
        String word = inputString("Please enter the Sequence:\n");
        StringBuilder newString = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) newString.append(word.charAt(i));

        if (newString.toString().equals(word)) System.out.println("This sequence is a Palindrome!");
        else System.out.println("This sequence is not a Palindrome!");
    }
}
