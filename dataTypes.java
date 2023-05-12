class HelloWorld2 {
    /*
     * public static void main(String[] args) {
     * // integer types
     * byte aSingleByte = 100; // -128 to 127
     * short aSmallNumber = 20000; // -32,768 to 32,767
     * int anInteger = 2147483647; // -2147483648 to 2147483647
     * long aLargeNumber = 922337203685477589L;
     * 
     * // decimal types
     * double aDouble = 1.79769313;
     * float aFloat = 3.4028F; // floats require f at end
     * 
     * // booleans
     * boolean isWeekend = false;
     * boolean isWorkday = true;
     * 
     * // characters
     * char copyrightSymbol = '\u00A9';
     * char percentSymbol = '%';
     * 
     * System.out.println("this is the copyright symbol:" + percentSymbol);
     * 
     * }
     */
    public static void main(String[] args) {
        /*
         * int number1 = 5;
         * double number2 = number1;
         */

        // int convert can be done to a double without issue, but issues happen when
        // going from double to int unless specifying as int such as below. Decimal is
        // lost
        // since int is whole num
        double number2 = 5.2;
        int number1 = (int) number2;

        System.out.println(number1);

    }
}
