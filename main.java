/* class Main {
    public static void main(String[] arguments) {
        System.out.println("Hello world!");
    }
} */

class HelloWorld {

    // when num declared without value, java assigns default value of 0
    static int age;

    public static void main(String[] args) {
        int age = 27;
        // redeclared variables cause error
        // int age = 17;

        System.out.println("I am " + age + " years old.");
    }
}