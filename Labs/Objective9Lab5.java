import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		boolean keepGoing = true;

    System.out.print("Please give me a number: ");
    double num1 = kb.nextDouble();
    System.out.print("Please give me another number: ");
    double num2 = kb.nextDouble();

    while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			int choice = kb.nextInt();
      double sum = findSum(num1, num2);
      double average = findAverage(num1, num2);
      double calcTax = findCalcTax(num1, num2);
      switch(choice) {
      case 1:
      System.out.println(num1 + " + " + num2 + " = " + sum);
      break;
      case 2:
      System.out.println("The average of " + num1 + " and " + num2 + " is: " + average);
      break;
      case 3:
      System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + calcTax);
      break;
      case 4:
      System.out.println("You have chosen to quit");
      keepGoing = false;
      break;
      default:
      System.out.println("This is not a valid selection");
      break;
      }
    }
kb.close();
}
  public static void printMenu() {
    System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
    System.out.println();
}
	public static double findSum(double x, double y) {
		double sum = (x + y);
		return sum;
	}
  public static double findAverage(double x, double y) {
    double average = (x + y) / 2;
    return average;
  }
  public static double findCalcTax(double x, double y) {
    double calcTax = (x + y) * .0831;
    return calcTax;
  }
}
