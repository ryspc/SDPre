import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    currentYear = 2021;
    age = input.nextInt();
    birthYear = currentYear - age;
    /*
    Your solution goes here
    */

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
