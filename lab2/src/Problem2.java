import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        for (String word : getDictionary()) {
            if (equals("knowledge", word)) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("total: " + count);
    }

    public static ArrayList<String> getDictionary() throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("/data/programming/cpsc101/lab2/src/enable1.txt"));
        ArrayList<String> dictionary = new ArrayList<String>();

        String line;
        while ((line = file.readLine()) != null) {
            dictionary.add(line);
        }

        return dictionary;
    }

    public static boolean equals(String word1, String word2) {
        HashMap<Character, Integer> map1 = getLetters(word1);
        HashMap<Character, Integer> map2 = getLetters(word2);

        int score = 0;

        for (Character letter : map2.keySet()) {
            if (map1.containsKey(letter) == false || map2.get(letter) <= map1.get(letter) == false) {
                score++;
            }
        }

        if (score == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static HashMap<Character, Integer> getLetters(String word) {
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length(); i++) {
            Character letter = word.charAt(i);

            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        return letters;
    }
}

/* Output:
 * de
 * dee
 * deke
 * del
 * dele
 * den
 * ...
 * woke
 * woken
 * wold
 * won
 * wonk
 * total: 159
 */
