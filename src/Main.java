import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (100 - 1) + 1);
        System.out.println("Guess my number! It's between 1 and 100 :)");
        Scanner scanner = new Scanner(System.in);
        int attempts = 1;
        while(true) {
            System.out.print("Enter number: ");
            if(scanner.hasNextInt()) {
                int myNumber = scanner.nextInt();
                if(myNumber > 100 || myNumber < 1) {
                    System.out.println("It must be between 1 and 100!");
                } else if(myNumber == randomNumber) {
                    scanner.close();
                    break;
                } else if (myNumber < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                attempts++;
            } else {
                scanner.next();
                System.out.println("Please enter a valid whole number!");
            }
        }
        System.out.println("Congrats, you found it!");
        System.out.printf("Took you %d attempts.", attempts);
    }
}