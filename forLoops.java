import java.util.Arrays;

class forloops {
    public static void main(String[] args) {
        // int numbers[] = { 1, 2, 3, 4, 5 };
        /*
         * for (int number = 1; number <= 10; number++) {
         * for (int multiplier = 1; multiplier <= 10; multiplier++) {
         * System.out.printf("%d X %d = %d \n", number, multiplier, number *
         * multiplier);
         * }
         * }
         */
        /*
         * int numbers[] = { 1, 2, 3, 4, 5 };
         * 
         * for (int number : numbers) {
         * System.out.println(number);
         * }
         */

        int number = 5;
        int multiplier = 1;

        /*
         * while (multiplier <= 10) {
         * System.out.printf("%d X %d \n", number, multiplier, number * multiplier);
         * multiplier++;
         * }
         */

        do {
            System.out.printf("%d X %d \n", number, multiplier, number * multiplier);
            multiplier++;
        } while (multiplier <= 10);
    }
}