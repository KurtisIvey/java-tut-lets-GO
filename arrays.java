import java.util.Arrays;

class arrays {
    public static void main(String[] args) {
        // char vowels[] = new char[5];
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        // a e i o u
        // a - - - -
        /*
         * vowels[0] = 'a';
         * vowels[1] = 'e';
         * vowels[2] = 'i';
         * vowels[3] = 'o';
         * vowels[4] = 'u';
         */

        // vowels[2] = 'x';
        /*
         * int startingIndex = 0;
         * int endingIndex = 4;
         * char key = 'z';
         * 
         * Arrays.sort(vowels);
         * int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex,
         * key);
         * 
         * System.out.print(Arrays.toString(vowels));
         */

        // fill changes all index to specified val

        int numbers[] = { 1, 2, 3, 4, 5 };
        // int copyOfNumbers[] = numbers;

        // only makes new copy if u use Arrays.copyOf(referenceArr,length )
        // length could be any length. if length exceeds referenced Arr, exceeding
        // length vals will default to 0 since they're ints
        // int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);
        int copyOfNumbers[] = Arrays.copyOfRange(numbers, 0, 5);

        /*
         * int startingIndex = 1;
         * int endingIndex = 4;
         * Arrays.fill(vowels, startingIndex, endingIndex, 'x');
         */

        // both are changed because arrays are reference types. There is not a new copy
        // of numbers, but instead linked to original via pointing
        Arrays.fill(numbers, 0);

        System.out.print(Arrays.toString(numbers));
        System.out.print(numbers == copyOfNumbers); // returns false because they have different references in memory
        System.out.print(Arrays.equals(numbers, copyOfNumbers)); // returns true because now only the values are being
                                                                 // checked rather than fully in the memory references

    }
}
