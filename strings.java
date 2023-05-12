class Strings {
    public static void main(String[] args) {
        // char percentSign = '%';

        // String name = "Farhan Hasin Chowdhury"

        // when new is present, creates new string in pool rather than redefining
        // previous
        // String name = new String("Farhan");

        String literalString1 = "abs";
        String literalString2 = "abc";

        // though they have the same string value, they do not use the same value in the
        // string poop since
        // they're seperately created instances as declared by "new"
        String objecString1 = new String("efg");
        String objecString2 = new String("efg");

        // System.out.println(objecString2);

        /*
         * String name = "Kurtis"; // %s
         * String country = "usa"; // %s
         * int age = 31; // %d
         * String company = "fcc"; // %s
         * double gpa = 3.8; // %f
         * char percentSign = '%'; // %c
         * boolean amTruth = false; // %b
         * 
         * String formattedString = String.format(
         * "My name is %s. I am from %s. I am %d years old. I work for %s. My gpa is %f. I have attended 100%c of my uni classes. this is %b."
         * ,
         * name, country, age, company, gpa, percentSign, amTruth);
         * 
         * System.out.println(formattedString);
         */

        /*
         * String string1 = new String("abc");
         * String string2 = new String("ABC");
         * System.out.println(string1.equalsIgnoreCase(string2));
         */

        // using replace does not mutate the original string
        String string = "the sky is blue.";
        // System.out.println(string.replace("blue", "red"));

        String updatedString = string.replace("blue", "red");
        System.out.println(updatedString);
        System.out.println(string.contains("sky"));

    }
}
