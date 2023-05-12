import java.util.ArrayList;
import java.util.Comparator;

class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // int double float boolean
        // integer , integer is the reference type form of the int type,

        numbers.add(4); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(1); // 3
        numbers.add(5); // 4

        // to print out array list must be println & toString() method
        // System.out.println(numbers.toString());
        // to get specific number use the get method & it gets the value in that index
        // System.out.println(numbers.get(3));

        // numbers.remove(2);// to remove number, use remove method & pass in index of
        // item to remove

        // numbers.clear(); // clears entire ArrayList and makes it empty

        // inserts value at that index replacing prev value
        // numbers.set(2, Integer.valueOf(30));

        // built in sorting method, also available is reverse order
        // numbers.sort(Comparator.naturalOrder());

        // for each method
        /*
         * numbers.forEach(number -> {
         * System.out.println(number * 2);
         * });
         */
        System.out.println(numbers);

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        // System.out.println(numbers.contains(Integer.valueOf(1)));
        System.out.println(numbers);
    }
}