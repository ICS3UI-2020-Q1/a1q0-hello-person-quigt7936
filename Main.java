import java.util.Scanner;

/**
 * The program greets a user and calculate their approximate age.\
 * @ThomasQuigley 
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
   
    // ask their user their name
    System.out.println("Please enter your name:");
   
    // to declare a variable to store a string
    String userName;

    // initilaze the users name
    userName = input.nextLine();
    
    // greet the user
    System.out.println("Hello " + userName + "!");

    // ask the user the year they were born
    System.out.println("Please enter the year you were born:");
    
    // declare and initialize a variable for the current year
    int birthYear = input.nextInt();

    // declar and initialize a costant for the current year
    final int CURRENT_YEAR = 2020;

    // declare and initialize
    int age = CURRENT_YEAR - birthYear;

    // tell the user their approximate age
    System.out.println("You are " + age + " years old.");
  }
}
