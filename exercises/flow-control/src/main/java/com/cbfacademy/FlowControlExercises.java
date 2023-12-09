package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FlowControlExercises {
    
        public List<String> fizzBuzz(List<Integer> numbers) {
            
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

        // 1, 2, Fizz, 4, Buzz, FizzBuzz, 
        // 
            List<String> result = new ArrayList<>();
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                    result.add("FizzBuzz");
                } else if (numbers.get(i) % 5 == 0) {
                    result.add("Buzz");
                } else if (numbers.get(i) % 3 == 0) {
                    result.add("Fizz");
                } else { 
                   result.add(String.valueOf(numbers.get(i)));
                } 
               
            }   
       return result;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        String[] months ={
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        // Check if the input is within the valid range
        if (number >= 1 && number <= 12) {
            return months[number - 1];
        }
        else{
            return "Invalid month number";
        }
        
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        //  - determines the sum of all the even numbers in the list
        int sumOfEvens = 0;
        int sumOfOdds = 0;
         //  - determines the sum of all the odd numbers in the list
        for (int num : numbers) {
            if (num % 2 ==0) {
                sumOfEvens += num;
            } else {
                sumOfOdds += num;
            }
        }
        
        //  - returns a map with two entries:
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("SumOfEvens", sumOfEvens);
        resultMap.put("SumOfOdds", sumOfOdds);
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        
        return resultMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        List<Integer> reversedList = new ArrayList<>();
        // TODO - Implement this method such that
        //  - it takes an array list of integers

        // Itereate through the original list in reverse order and add elements to the new list
        for (int i = numbers.size() - 1; i >= 0; i --) {
            reversedList.add(numbers.get(i));
        }
        //  - it returns the list in reverse order
        
        return reversedList;
    }
    

    public String getName() {
        return "Flow Control Exercises";
    }
}
