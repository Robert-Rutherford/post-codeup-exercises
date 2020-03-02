import java.util.Arrays;

public class ExerciseJava {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));
//        System.out.println(Arrays.toString(arrayOfMultiples(12, 10)));
//        System.out.println(Arrays.toString(arrayOfMultiples(17, 6)));

//        System.out.println(Arrays.deepToString(squarePatch(3)));
//        System.out.println(Arrays.deepToString(squarePatch(5)));
//        System.out.println(Arrays.deepToString(squarePatch(1)));
//        System.out.println(Arrays.deepToString(squarePatch(0)));

//        System.out.println(isValidHexCode("#CD5C5C"));
//        System.out.println(isValidHexCode("#EAECEE"));
//        System.out.println(isValidHexCode("#eaecee"));
//        System.out.println(isValidHexCode("#CD5C58C"));
//        System.out.println(isValidHexCode("#CD5C5Z"));
//        System.out.println(isValidHexCode("#CD5C&C"));
//        System.out.println(isValidHexCode("CD5C5C"));

        System.out.println(highLow("1 2 3 4 5"));
        System.out.println(highLow("1 2 -3 4 5"));
        System.out.println(highLow("1 9 3 4 -5"));
        System.out.println(highLow("13"));

    }


//    2/29/2020 - light exercise edabit.com **************
//  Problem: Array of Multiples
//  task: Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
//  site: https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    private static int[] arrayOfMultiples(int num, int length){
        int[] newArray = new int[length];
        for (int i = 0; i<length;i++){
            newArray[i] = num*(i+1);
        }
        return newArray;
    }

    //  Problem: Perfect Square Patch
    //  task: Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
    //  site: https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
    private static int[][] squarePatch(int num){
        int[][] square = new int[num][num];
        if (num == 0){
            return square;
        }
        for (int i = 0; i< num; i++){
            for (int j =0; j<num; j++){
                square[i][j] = num;
            }
        }
//        for (int[] line: square) {
//            for (int col: line) {
//                col = num;
//            }
//        }
        return square;
    }

    //    3/1/2020 - light exercise edabit.com **************
//  Problem: Valid Hex Code
//  task: Create a function that determines whether a string is a valid hex code.
//     A hex code must begin with a pound key # and is exactly 6 characters in length. Each character must be a digit
//     from 0-9 or an alphabetic character from A-F. All alphabetic characters may be uppercase or lowercase.
//  site: https://edabit.com/challenge/9zBJYnBekqAo52zEp
    private static Boolean isValidHexCode(String code){
        if (code.length() != 7){
            return false;
        }
        if (code.charAt(0) != '#'){
            return false;
        }
        for (int i= 1; i<code.length();i++){
            boolean flag = Character.isDigit(code.charAt(i));
            if (flag){
                int num = Character.getNumericValue(code.charAt(i));
//                will never trigger
                if (num > 9 || num < 0){
                    return false;
                }
            }else {
                char lower = Character.toLowerCase(code.charAt(i));
                if (lower < 'a' || lower > 'f'){
                    return false;
                }
            }
        }
        return true;
    }

    //  Problem: Return the Highest and Lowest Numbers
//  task: Create a method that accepts a string of space separated numbers and returns the highest and lowest number (as a string).
//  site: https://edabit.com/challenge/iaCSbqngin2AXriyB

    private static String highLow(String numString){
        String returnString = "";
        int high = 0;
        int low = 0;
        String[] splitString = numString.split(" ");
        for (int i = 0; i< splitString.length;i++){
            if (i == 0){
                high = Integer.parseInt(splitString[i]);
                low = Integer.parseInt(splitString[i]);
            }else{
                if (Integer.parseInt(splitString[i]) > high){
                    high =Integer.parseInt(splitString[i]);
                }else if (Integer.parseInt(splitString[i]) < low){
                    low = Integer.parseInt(splitString[i]);
                }
            }
        }

        returnString = String.join(" ", Integer.toString(high), Integer.toString(low));

        return returnString;
    }

    //  Problem: Recursion: Array Sum
//  task: Write a function that finds the sum of an array. Make your function recursive.
//  site: https://edabit.com/challenge/hf2THAoQRQbAx2jc9
    private static int sum(int[] numArray){
        int total = 0;

        return total;
    }

    //    3/3/2020 - light exercise edabit.com **************
//  Problem: Simulate the Game "Rock, Paper, Scissors"
//  task: Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:
//
//"Player 1 wins"
//"Player 2 wins"
//"TIE" (if both inputs are the same)
//The rules of rock, paper, scissors, if not known:
//
//Both players have to say either "rock", "paper" or "scissors" at the same time.
//Rock beats scissors, paper beats rock, scissors beat paper.
//  site: https://edabit.com/challenge/3S8XppR6Yf5mXPxij
    private static String rps(String player1,String player2){
        return " ";
    }

//  Problem: Switcharoo
//  task: Create a function that takes a string and returns a new string with its first and last characters swapped, except under three conditions:
//
//If the length of the string is less than two, return "Incompatible.".
//If the first and last characters are the same, return "Two's a pair.".
//  site: https://edabit.com/challenge/c52kNwPuWo5kp9x4H
    private static String flipEndChars(String input){
        return " ";
    }


}
