import java.util.Scanner;

class conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        double number1 = scanner.nextDouble();
        // must clear input buffer because no next line call
        scanner.nextLine();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("subtract")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.equals("multiply")) {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        } else if (operation.equals("divide")) {
            if (number2 == 0) {
                System.out.println("can not divide by zero");
            }
            System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
        } else {
            System.out.printf("%s is not a supported operation.", operation);

        }

        scanner.close();
    }
}
