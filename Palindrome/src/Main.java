import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        int option = 0;
        do {
            displayMenu();
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter option number:");

            option = myObj.nextInt();  // Read user input

            switch (option) {
                case 1:
                    System.out.println("You selected: " + option);  // Output user input
                    Scanner stringScanner = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter String:");
                    String enteredString = stringScanner.nextLine();

                    System.out.println("You entered:" + enteredString);
                    enteredString = enteredString.replace(",","");
                    enteredString = enteredString.replace(" ","");
                    enteredString = enteredString.replace("?","");

                    System.out.println(enteredString);

                    char arr[] = enteredString.toCharArray();
                    Queue queue = new Queue();
                    for(char word : arr) {
                        queue.add(String.valueOf(word).toLowerCase());
                    }
                    queue.display();

                    Queue.isPalindrome(queue);



                    break;
                case 2:
                    break;
                case 3:
                    break;

            }



        } while (option != 3);





       /* Queue queue = new Queue();

        queue.add("Hi");
        queue.add("this");
        queue.add("is");
        queue.add("me");
        queue.add("ok");

        queue.display();*/

    }

    public static void displayMenu() {
        System.out.println("");
        System.out.println("----------------");
        System.out.println("Main Menu:");
        System.out.println("1. Test character-by-character palindrome");
        System.out.println("2. Test word-by-word palindrome");
        System.out.println("3. Exit program");
    }
}