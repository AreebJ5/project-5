import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    // my idea is a car dealiership
    // my scanner is below to find the name
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
//scanner to find the customers name
    String name = scan.next();

    System.out.println("Hello " + name + " welcome to the car dealiership.");
//Scanner to find the customers car
    System.out.println("What is your Current car?");
    String currentCar = scan.next();

    System.out.println("What are the miles on your current car?");
//Scanner to find the miles on the customers car
    int currentMiles = scan.nextInt();
    System.out.println("How many miles did you gain last year?");
    System.out.println("If your miles use a positive number. If your miles didn't increase put 0.");

    int milesIncreased = scan.nextInt();

    int miles = getMiles(milesIncreased, currentMiles);

    System.out.println("Hi " + (name));
    System.out.println("The miles on your old car is " + miles);
//print statement that starts my recursion
    System.out.println("From 1-20 guess how many cars are in this Parking Lot?");
    String n1 = scan.next();

    countingUp(1);

    System.out.println("Thank you for visiting our Car dealiership!");
  }


  // method calculates the paients current miles
  static int getMiles(int milesIncreased, int currentMiles) {
    int miles = currentMiles + milesIncreased;
    return miles;

  }

  public static void countingUp(int n) {
    {
      if (n == 21) {
        System.out.println("There are actually 20 cars in this parking lot!");
      } else {
        System.out.println("There is another " + n +" cars");
        n++;
        countingUp(n);
      }
    }
  }
  
}
