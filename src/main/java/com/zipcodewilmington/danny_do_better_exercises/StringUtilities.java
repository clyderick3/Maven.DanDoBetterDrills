package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String answer = "Hello World";
        return answer;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment)
    { String answer = firstSegment + secondSegment;
        return answer;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        //Get the length of the word.
        int length = input.length();
        //The length of the word -3 for the last 3 letters to be recorded.
        return input.substring(length-3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue)
    {
        if (inputValue.equals(comparableValue)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue)
    {   //Created a boolean to test is even is true.
        Boolean isEven = inputValue.length() % 2 == 0;
        int middle = inputValue.length() / 2;
        //In a boolean the if statement is always testing for true.
        if (isEven) {
            return inputValue.charAt(middle-1);
        }
        else {
           return inputValue.charAt(middle);
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
       int index = spaceDelimitedString.indexOf(" ");
       return spaceDelimitedString.substring(0,index).trim();


    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        int index = spaceDelimitedString.indexOf(" ");

        return spaceDelimitedString.substring(index).trim();
//

    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse)
    {   String answer = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            answer = answer + stringToReverse.charAt(i);
        }
        return answer; } }

