package com.webapp.simple;

import java.util.*;

public class NewClassMain {
    private static String process(String input) {
        ArrayList<String> substrings = new ArrayList<>();
        StringBuilder currentSubstring = new StringBuilder();

        // Iterate through the input string to find consecutive letters or numbers
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                currentSubstring.append(c);
            } else {
                if (currentSubstring.length() > 0) {
                    substrings.add(currentSubstring.toString());
                    currentSubstring = new StringBuilder();
                }
            }
        }
        if (currentSubstring.length() > 0) {
            substrings.add(currentSubstring.toString());
        }

        // Sort individual substrings
        for (int i = 0; i < substrings.size(); i++) {
            char[] chars = substrings.get(i).toCharArray();
            ArrayList<Character> charList = new ArrayList<>();
            for (char c : chars) {
                charList.add(c);
            }
            Collections.sort(charList);
            StringBuilder sortedSubstring = new StringBuilder();
            for (char c : charList) {
                sortedSubstring.append(c);
            }
            substrings.set(i, sortedSubstring.toString());
        }

        // Join sorted substrings
        StringBuilder result = new StringBuilder();
        for (String substring : substrings) {
            result.append(substring);
        }

        return result.toString();
    }
    public static void main(String[] args) {
//        Stack<String> s= new Stack<>();
//        Queue<String> q=new LinkedList<>();
//        s.push("Ant");

//        Map<String, Integer> m= new HashMap<>();
//        m.put("A",new Integer(30));
//        m.put("B",new Integer(20));
//        m.put("C",new Integer(80));
//        m.remove(new String("A"));
//        System.out.println(m);

        String input = "DC501GCCCA098911";
         // Output: CD015ACCCG011899
        System.out.println("Encoded String: " + process(input));

        int[] array_nums = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        int x = array_nums[0];
        array_nums[0] = array_nums[array_nums.length - 1];
        array_nums[array_nums.length - 1] = x;

        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(array_nums));
    }
}
