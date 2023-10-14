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
                    String enteredString = askUserForValues(option);
                    enteredString = removeChrachters(enteredString,"[^a-zA-Z0-9]");

                    char arr[] = enteredString.toCharArray();
                    Queue queue = new Queue();
                    for(char word : arr) {
                        queue.add(String.valueOf(word).toLowerCase());
                    }

                    boolean isPalindrome = Queue.isPalindrome(queue);
                    String result = isPalindrome ? "Palindrome" : "Not Palindrome";
                    System.out.println("Judgment:" + result);


                    break;
                case 2:
                    enteredString = askUserForValues(option);
                    enteredString = removeChrachters(enteredString,"[^a-zA-Z0-9\s]");

                    String words[] = enteredString.split(" ");
                    Queue wordQueue = new Queue();
                    for(String word : words) {
                        wordQueue.add(String.valueOf(word).toLowerCase());
                    }
                    wordQueue.display();

                    isPalindrome = Queue.isPalindrome(wordQueue);
                    result = isPalindrome ? "Palindrome" : "Not Palindrome";
                    System.out.println("Judgment:" + result);
                    break;
                case 3:
                    break;
            }
        } while (option != 3);
    }

    private static String askUserForValues(int option) {
        System.out.println("You selected: " + option);  // Output user input
        Scanner stringScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter String:");
        String enteredString = stringScanner.nextLine();
        return enteredString;
    }

    private static String removeChrachters(String text,String regex){
        return text.replaceAll(regex,"");
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