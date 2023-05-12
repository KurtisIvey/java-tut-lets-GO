import java.util.Scanner;

class userInput {
    public static void main(String[] args) {
        /*
         * String string = "The sky is blue.";
         * 
         * System.out.println(string.contains("free"));
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. how old are you?", name);
        int age = scanner.nextInt();

        // cleans up input buffer because lextline not called prior
        scanner.nextLine();

        System.out.printf("%d is an excellent age to start programming. \n What language do you prefer?", age);

        String language = scanner.nextLine();

        System.out.printf("%s is a very popular language", language);

        scanner.close();
    }
}
