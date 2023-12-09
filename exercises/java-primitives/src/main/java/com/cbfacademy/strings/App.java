package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println(concatenate("hello", "my", "friends") );
        System.out.println(areEqual("word", "word"));
    }

    public static String concatenate(String word1, String word2, String word3) {
        String concatword = word1 + word2 + word3;
        return concatword; 
        // // TODO: Write code that concatenates the input parameters and returns the result
        // throw new RuntimeException("Not implemented");
    }

    public static Boolean areEqual(String word1, String word2) {
        if (word1 == word2) {
            return true;
        } 
        else {
            return false;
        }
        // // TODO: Write code to determine whether the input parameters are equal strings
        // throw new RuntimeException("Not implemented");
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        throw new RuntimeException("Not implemented");
    }
}
