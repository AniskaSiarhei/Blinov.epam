package com.epam.glava_11.sets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class HashSetWordsMain {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(100_000);
        Scanner scanner;
        try{
            scanner = new Scanner(new File("data\\hashSet.txt"));
            scanner.useDelimiter("[^А-я]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word.toLowerCase());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(words);
        TreeSet<String> treeSet = new TreeSet<>(words);
        System.out.println(treeSet);
    }
}
