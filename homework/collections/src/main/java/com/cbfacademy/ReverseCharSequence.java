package main.java.com.cbfacademy;

public class ReverseCharSequence implements CharSequence {
    private String originalString;
    // This class implements the java.lang.CharSequence interface
    // This class will return a given string backwards
    // Some of the methods from CharSequence must be overridden to make this happen
    public ReverseCharSequence(String inputString) {
        this.originalString = inputString;
    }
    
    @override
    public int length() {
        // Getting the length of the string
        return originalString.length();
    }
    @override
    public char charAt(int index) {
        // Preparing for index out of bounds errors, so if it's less than 0 or more than the length of the string we're dealing with.
        if (index < 0 || index >= originalString.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // This method is to return the char at its specified index in the originalString. 
        
        // Hint: You can use originalString.charAt(index) to access characters.
        // Youll need to calculate the correct index for the reversed order.
        return originalString.charAt(originalString.length() - 1 - index);
    }
    @override 
    public charSequence subSequence(int start, int end) {
        if (start < 0 || end < 0 || start > end || end > originalString.length()) {
            throw new IndexOutOfBoundsException("Invalid start or end indices");
        }
        // Implement this method to return a subsequence of the reversed string
        // based on the given start and end indices.
        // Remember to handle index out of bounds appropriately.
        // Hint: You can use originalString.substring(start, end) to get a substring from the original String.
        // You'll need to adjest the indices for the reversed order.
        return new ReverseCharSequence(originalString.substring(
            originalString.length() - end,
            originalString.length() - start
        ));
    }

    @Override
    public String toString() {
        // Implement this method to return the entire reversed string.
        // You can use a loop to build the reversed string character by character.
        StringBuilder reversed = new StringBuilder();
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversed.append(originalString.charAt(i));
        }
        return reversed.toString();
    }

    // public static void main(String[] args) {
    //     ReverseCharSequence reversed = new ReverseCharSequence("Hello, World!");
    //     System.out.println(reversed.toString()); // Output: "!dlroW ,olleH"
    // }
}
