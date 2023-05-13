import java.util.ArrayList;
import java.util.HashMap;

class hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        // examScores.put("Math", 88);
        examScores.put("Sociology", 35);
        examScores.put("English", 95);
        examScores.put("Bengali", 100);
        examScores.put("Computer programming", 100);

        examScores.putIfAbsent("Math", 55);

        System.out.println(examScores);
        System.out.println(examScores.get("religion")); // returns null if not present
        System.out.println(examScores.getOrDefault("religion", -1)); // returns -1 if given key is not found

        // hash maps clearing through .clear() method
        // examScores.clear();

        // returns size of hashmap , zero due to hashmap clearing
        System.out.println(examScores.size());

        // remove key in hashmat through remove method
        examScores.remove("English");
        System.out.println(examScores.size());

        // check if contains
        System.out.println(examScores.containsValue(Integer.valueOf(35)));

        // check if hashmap is empty
        System.out.println(examScores.isEmpty());

        // hashmaps have for each loops
        /*
         * examScores.forEach((subject, score) -> {
         * System.out.println(subject + "-" + score);
         * });
         */
        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
        System.out.println(examScores);

    }
}