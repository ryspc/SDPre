import java.util.Scanner;
public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter a number:");
    int userNum = scanner.nextInt();

    if (userNum % 2 == 0) {
      System.out.println("The number is even");
      }
      else {
        System.out.println("The number is odd");
      }
      scanner.close();
    }
  }
