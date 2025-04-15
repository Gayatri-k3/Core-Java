package com.xworkz.string.internal;

public class string {
    static String s = "Hello World";

    public static void hello() {
        String UpdatedS = s.concat("!!");
        String u_s = "Hello World!!";
        System.out.println("Statement: " + s);
        System.out.println("Updated Statement: " + UpdatedS);
        System.out.println("new Statement: " + u_s);
        System.out.println("Memory location of u: " + u_s.hashCode());
        System.out.println("Memory location of updated: " + UpdatedS.hashCode());
        if (u_s == UpdatedS) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }

    public static void reverse(String s) {
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void countWords() {
        System.out.println();
        String[] words = s.split(" ");
        System.out.println("Number of words: " + words.length);
    }

    public static void target(char target){
        char[] arr1 = s.toCharArray();
        boolean isPresent = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println("Target is present");
        } else {
            System.out.println("Target is not present");
        }
    }

    public static void sentChars(){
        String s1 = "Hi this is Gayatri";
        int len = s1.length();
        System.out.println("Number of characters in this sentence are: "+len);
    }

    public static void space() {
        String s1 = "Hi this is Gayatri";
        char[] arr1 = s1.toCharArray();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 32) {
                count++;
            }
        }
        System.out.println("Number of spaces in this sentence are: "+count);
    }

    public static void space1() {
        String s1 = "Hi this is Gayatri";
        String updatedS = s1.replace(" ", "%");
        System.out.println("Updated sentence: " + updatedS);
    }

    public static void freq(){
        String s1 = "Hi this is Gayatri and this is a sentence";
        String[] arr1 = s1.split(" ");
        int[] freq = new int[arr1.length];
        boolean[] checked = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (checked[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i].equals(arr1[j])){
                    count++;
                    checked[j] = true;
                }
            }
            freq[i] = count;
        }
        for (int i = 0; i < freq.length; i++) {
            if (!checked[i]) {
                System.out.println(arr1[i] + " : " + freq[i]);
            }
        }
    }

    public static void freqChar(){
        String s1 = "Hi this is Gayatri and this is a sentence";
        char[] arr1 = s1.toCharArray();
        int[] freq = new int[arr1.length];
        boolean[] checked = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (checked[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i]==arr1[j]){
                    count++;
                    checked[j] = true;
                }
            }
            freq[i] = count;
        }
        for (int i = 0; i < freq.length; i++) {
            if (!checked[i]) {
                System.out.println(arr1[i] + " : " + freq[i]);
            }
        }
    }
    public static void pali(String s) {
        char[] arr = s.toCharArray();
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i] + "";
        }
        if (reversed.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}