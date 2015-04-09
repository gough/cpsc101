import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Problem3 {
    public static void main(String[] args) {
        String startWord = "math";
        String endWord = "road";
        
        String currentWord = startWord;
        ArrayList<String> previousWords = new ArrayList<String>();
        ArrayList dictionary = getDictionary("/Users/adam/Desktop/lab2/resources/enable1.txt");

        int iterations = 0;
        while (currentWord.equals(endWord) == false) {            
            System.out.printf("%s (%d) ->\n", currentWord, iterations);
            previousWords.add(currentWord);
            
            currentWord = getClosestWord(currentWord, endWord, dictionary);
            
            while (previousWords.contains(currentWord)) {
                // the new current word was previously chosen, so pick a new one
                currentWord = getClosestWord(currentWord, endWord, dictionary);
            }

            iterations++;
        }

        System.out.printf("%s (%d)", currentWord, iterations);
    }
    
    public static ArrayList<String> getDictionary(String file) {
        ArrayList<String> dictionary = new ArrayList<String>();
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/adam/Desktop/lab2/resources/enable1.txt"));

            String word;
            while ((word = bufferedReader.readLine()) != null) {
                dictionary.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  
        
        return dictionary;
    }

    public static int countDifferences(String firstWord, String secondWord) {
        int differences = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            if (firstWord.charAt(i) != secondWord.charAt(i)) {
                differences++;
            }
        }

        return differences;
    }

    public static int getLevenshteinDistance(String a, String b) {
        // algorithm implementation from http://rosettacode.org/wiki/Levenshtein_distance#Java

        a = a.toLowerCase();
        b = b.toLowerCase();
        // i == 0

        int [] costs = new int [b.length() + 1];

        for (int j = 0; j < costs.length; j++) {
            costs[j] = j;
        }

        for (int i = 1; i <= a.length(); i++) {
            // j == 0; nw = lev(i - 1, j)
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }

        return costs[b.length()];
    }

    public static String getClosestWord(String currentWord, String endWord, ArrayList<String> dictionary) {
        ArrayList<String> similarWords = new ArrayList<String>();

        // iterate over dictionary and find similar words (same length and one letter difference)
        for (int i = 0; i < dictionary.size(); i++) {
            if (currentWord.length() == dictionary.get(i).length()) {
                if (countDifferences(currentWord, dictionary.get(i)) == 1) {
                    similarWords.add(dictionary.get(i));
                }
            }
        }

        int minDistance = Integer.MAX_VALUE;
        String minWord = null;

        // iterate over similarWords and find least Levenshtein distance
        for (int i = 0; i < similarWords.size(); i++) {
            int distance = getLevenshteinDistance(similarWords.get(i), endWord);
            
            if (distance < minDistance) {
                minDistance = distance;
            }
        }
        
        ArrayList<String> minWords = new ArrayList<String>();
        
        // iterate over similarWords again and find all words with lowest Levenshtein distance
        for (int i = 0; i < similarWords.size(); i++) {
            int distance = getLevenshteinDistance(similarWords.get(i), endWord);
            
            if (distance == minDistance) {
                minWords.add(similarWords.get(i));
            }
        }
        
        // if more than one word with same least distance, pick one at random
        if (minWords.size() > 1) {
            minWord = minWords.get(new Random().nextInt(minWords.size()));
        } else {
            minWord = minWords.get(0);
        }

        // return word with least Levenshtein distance
        return minWord;
    }
}