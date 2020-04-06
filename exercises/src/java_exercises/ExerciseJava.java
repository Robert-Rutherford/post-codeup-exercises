package java_exercises;

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

//        System.out.println(highLow("1 2 3 4 5"));
//        System.out.println(highLow("1 2 -3 4 5"));
//        System.out.println(highLow("1 9 3 4 -5"));
//        System.out.println(highLow("13"));

//        System.out.println(rps("rock", "paper"));
//        System.out.println(rps("paper", "rock"));
//        System.out.println(rps("paper", "scissors"));
//        System.out.println(rps("scissors", "scissors"));
//        System.out.println(rps("scissors", "paper"));

//        System.out.println(flipEndChars("Cat, dog, and mouse."));
//        System.out.println(flipEndChars("ada"));
//        System.out.println(flipEndChars("Ada"));
//        System.out.println(flipEndChars("z"));

//        System.out.println(atbash("apple"));
//        System.out.println(atbash("Hello world!"));
//        System.out.println(atbash("Christmas is the 25th of December"));
//        double[] testArr = {9, 17, 30, 1.5};
//        System.out.println(overTime(testArr));
//        testArr = new double[]{16, 18, 30, 1.8};
//        System.out.println(overTime(testArr));
//        testArr = new double[]{13.25, 15, 30, 1.5};
//        System.out.println(overTime(testArr));

//        int[] testArr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(sevenBoom(testArr));
//        testArr = new int[]{8, 6, 33, 100};
//        System.out.println(sevenBoom(testArr));
//        testArr = new int[]{2, 55, 60, 97, 86};
//        System.out.println(sevenBoom(testArr));

//
//        System.out.println(Arrays.toString(findBrokenKeys("happy birthday", "hawwy birthday")));
//        System.out.println(Arrays.toString(findBrokenKeys("starry night", "starrq light")));
//        System.out.println(Arrays.toString(findBrokenKeys("beethoven", "affthoif5")));

//        double[][] test = {
//                {4, 2, 7, 1},
//                {20, 70, 40, 90},
//                {1, 2, 0}
//        };
//        System.out.println(Arrays.toString(findLargestNums(test)));
//        test = new double[][]{
//                {-34, -54, -74},
//                {-32, -2, -65},
//                {-54, 7, -43}
//        };
//        System.out.println(Arrays.toString(findLargestNums(test)));
//        test = new double[][]{
//                {0.4321, 0.7634, 0.652},
//                {1.324, 9.32, 2.5423, 6.4314},
//                {9, 3, 6, 3}
//        };
//        System.out.println(Arrays.toString(findLargestNums(test)));
//
//        System.out.println(uncensor("Wh*r* d*d my v*w*ls g*?", "eeioeo"));
//        System.out.println(uncensor("abcd", ""));
//        System.out.println(uncensor("*PP*RC*S*", "UEAE"));

//        System.out.println(xPronounce("Inside the box was a xylophone"));
//        System.out.println(xPronounce("The x ray is excellent"));
//        System.out.println(xPronounce("OMG x box unboxing video x D"));

//          System.out.println(removeLastVowel("Those who dare to fail miserably can achieve greatly."));
//          System.out.println(removeLastVowel("Love is a serious mental disease."));
//          System.out.println(removeLastVowel("Get busy living or get busy dying."));

//        System.out.println(duplicateCount("abcde"));
//        System.out.println(duplicateCount("aabbcde"));
//        System.out.println(duplicateCount("Indivisibilities"));
//        System.out.println(duplicateCount("Aa"));

//        System.out.println(swapTwo("ABCDEFGH"));
//        System.out.println(swapTwo("AABBCCDDEEFF"));
//        System.out.println(swapTwo("munchkins"));
//        System.out.println(swapTwo("FFGGHHI"));

//        System.out.println(textToNum("123-647-EYES"));
//        System.out.println(textToNum("(325)444-TEST"));
//        System.out.println(textToNum("653-TRY-THIS"));
//        System.out.println(textToNum("435-224-7613"));
        long num1 = 451999277;
        long num2 = 411777228;
        System.out.println(trouble(num1, num2));
         num1 = 1222345;
         num2 = 12345;
        System.out.println(trouble(num1, num2));
         num1 = 666789;
         num2 = 12345667;
        System.out.println(trouble(num1, num2));
         num1 = 33789;
         num2 = 12345337;
        System.out.println(trouble(num1, num2));

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
        if (player1.equalsIgnoreCase(player2)){
            return "TIE";
        }
        if (player1.equalsIgnoreCase("rock")){
            if (player2.equalsIgnoreCase("paper")){
                return "Player 2 wins";
            }else if (player2.equalsIgnoreCase("scissors")){
                return "Player 1 wins";
        }
        }else if (player1.equalsIgnoreCase("paper")){
                if (player2.equalsIgnoreCase("scissors")){
                    return "Player 2 wins";
                }else if (player2.equalsIgnoreCase("rock")){
                    return "Player 1 wins";
                }
        }else if (player1.equalsIgnoreCase("scissors")){
                if (player2.equalsIgnoreCase("rock")){
                    return "Player 2 wins";
                }else if (player2.equalsIgnoreCase("paper")){
                    return "Player 1 wins";
                }
        }
        return " ";
    }

//  Problem: Switcharoo
//  task: Create a function that takes a string and returns a new string with its first and last characters swapped, except under three conditions:
//
//If the length of the string is less than two, return "Incompatible.".
//If the first and last characters are the same, return "Two's a pair.".
//  site: https://edabit.com/challenge/c52kNwPuWo5kp9x4H
    private static String flipEndChars(String input){
        if (input.length() < 2){
            return "Incompatible.";
        }
        if (input.charAt(0) == input.charAt(input.length()-1)){
            return "Two's a pair.";
        }
        return input.charAt(input.length() - 1) + input.substring(1, input.length() - 1) + input.charAt(0);
    }

//    3/18 problems
//
//  Problem: Atbash Cipher
//  task: The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
//
//Create a function that takes a string and applies the Atbash cipher to it.
    public static String atbash(String str) {
        String codedString = "";
        for (char i:str.toCharArray()) {
            if (Character.isLetter(i)){
                if (Character.isUpperCase(i)){
                    codedString += (char) ('A' + ('Z' - i));
                }else {
                    codedString += (char) ('a' + ('z' - i));
                }
            }else {
                codedString += i;
            }

        }
        return codedString;
    }

    //  Problem: Bit Rotation
//    site: https://edabit.com/challenge/tNKWXJZPgRHZAc9Ja
//  task: Java offers some bit operations but not bit rotation. To complete that, create a function that takes three parameters:
//
//  n: Integer, which in binary representaion should be rotated.
//  m: Number of rotation steps that should be performed.
//  d: Boolean value; true = rotation right, false = rotation left.
//Your function should return an integer as a result of its rotated binary representation.
    public static int bitRotate(int n, int m, boolean d) {
        int newNumber = 0;



        return newNumber;
    }

    //  Problem: Working 9 to 5
//    site: https://edabit.com/challenge/phxxGdTJraPEQmKdq
//  task: Write a function that calculates overtime and pay associated with overtime.
//
//Working 9 to 5: regular hours
//After 5pm is overtime
//Your function gets an array with 4 values:
//
//Start of working day, in decimal format, (24-hour day notation)
//End of working day. (Same format)
//Hourly rate
//Overtime multiplier
//Your function should spit out:
//
//$ + earned that day (rounded to the nearest hundreth)
    public static String overTime(double[] arr) {
        double jobTime = 0;
        double overtime = 0;
        double total = 0;
        if (arr.length < 4){
            return "invalid array";
        }

        if (arr[0] < 9){
            return "invalid start time";
        }

        if (arr[1] > 17){
            jobTime  = 17 - arr[0];
            overtime = arr[1] - 17;
        }else{
            jobTime = arr[1] - arr[0];
        }
        total = (jobTime*arr[2]) + (overtime *(arr[2]*arr[3]));

        return Double.toString(total);
    }

    //  Problem: Seven Boom!
//    site: https://edabit.com/challenge/CKqfEowjmSTw2jsso
//  task: Create a function that takes an array of numbers and return "Boom!" if the number 7 appears in the array.
//  Otherwise, return "there is no 7 in the array".
//
    public static String sevenBoom(int[] arr) {
        for (int num: arr) {
            String stringNum = Integer.toString(num);
            String[] splitNum = stringNum.split("");
            for (String singleNum: splitNum) {
                if (Integer.parseInt(singleNum) == 7){
                    return "Boom!";
                }
            }
        }
        return "there is no 7 in the array";
    }

//    Sick days catch up
    //  Problem: A Capital Challenge
//    site: https://edabit.com/challenge/AudsydHhvWpCCSuaN
//  task: Given two strings, s1 and s2, select only the characters in each string where the character in the same
//  position in the other string is in uppercase. Return these as a single string.
//
//To illustrate, given the strings s1 = "heLLo" and s2 = "GUlp", we select the letters "he" from s1, because "G"
// and "U" are uppercase. We then select "lp" from s2, because "LL" is in uppercase. Finally, we join these together
// and return "help".
//
    public static String selectLetters(String s1, String s2) {


        return "";
    }

    //  Problem: Broken Keyboard
//    site: https://edabit.com/challenge/6THnWXvQrhRrEErtb
//  task: Given what is supposed to be typed and what is actually typed, write a function that returns the broken key(s). The function looks like:
//    findBrokenKeys(correct phrase, what you actually typed)
//
    public static String[] findBrokenKeys(String str1, String str2) {
        String[] stringArray1 = str1.split("");
        String[] stringArray2 = str2.split("");
        String[] wrongArrayBuild = new String[26];
        int wrongChar = 0;
        boolean matchChar = false;
        if (stringArray1.length != stringArray2.length){
            wrongArrayBuild[wrongChar] = "";
            return wrongArrayBuild;
        }
        for (int i = 0; i<stringArray1.length; i++) {
            if (!stringArray1[i].equalsIgnoreCase(stringArray2[i])){
                for (String wrongStr: wrongArrayBuild) {
                    if (stringArray1[i].equalsIgnoreCase(wrongStr)){
                        matchChar = true;
                    }
                }
                if (!matchChar){
                    wrongArrayBuild[wrongChar] = stringArray1[i];
                    wrongChar++;

                }
                matchChar = false;
            }
        }

        String[] returnArray = new String[wrongChar];

        System.arraycopy(wrongArrayBuild, 0, returnArray, 0, returnArray.length);

        return returnArray;

    }

//    march 28

    //  Problem: Find the Largest Numbers in a Group of Arrays
//    site: https://edabit.com/challenge/QLz5aGfChHhndKWMv
//  task: Create a function that takes an array of arrays with numbers. Return a new (single) array with the largest numbers of each.
//
    public static double[] findLargestNums(double[][] arr) {
        double[] returnArray = new double[arr.length];
        int arraySlot = 0;
        double numHolder = 0;
        for (double[] subArray: arr) {
            for (int i = 0; i< subArray.length; i++) {
                if (i==0){
                    numHolder = subArray[i];
                }else {
                    if (subArray[i] > numHolder){
                        numHolder = subArray[i];
                    }
                }
            }
            returnArray[arraySlot] = numHolder;
            arraySlot++;
        }

        return returnArray;

    }

    //  Problem: C*ns*r*d Str*ngs
//    site: https://edabit.com/challenge/jt6TWkTcYdWcRXbds
//  task: Someone has attempted to censor my strings by replacing every vowel with a *, l*k* th*s. Luckily, I've been able to find the vowels that were removed.
//
//  Given a censored string and a string of the censored vowels, return the original uncensored string.
//
    public static String uncensor(String str, String vowels) {
        String[] strSplit = str.split("");
        String[] vowelSplit = vowels.split("");
        int vowelNum = 0;
        for (int i =0; i < strSplit.length;i++){
            if (strSplit[i].equalsIgnoreCase("*")){
                strSplit[i] = vowelSplit[vowelNum];
                vowelNum++;
            }
        }

        return String.join("",strSplit);

    }

    //  Problem: Pronouncing the Xs
//    site: https://edabit.com/challenge/g5n85W62rJqZakMry
//  task: Create a function which replaces all the x's in the string in the following ways:
//
//Replace all x's with "cks" UNLESS:
//
//The word begins with "x", therefore replace it with "z".
//The word is just the letter "x", therefore replace it with "ecks".
//
    public static String xPronounce(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i< words.length; i++){
            String[] letters = words[i].split("");
            for (int j=0;j<letters.length;j++){
                if (j== 0 && letters[j].equalsIgnoreCase("x")){
                    if (letters.length == 1){
                        letters[j] = "ecks";
                    }else {
                        letters[j] = "z";
                    }
                }else if (letters[j].equalsIgnoreCase("x")){
                    letters[j] = "cks";
                }
            }
            words[i] = String.join("",letters);
        }
        return String.join(" ",words);
    }

    //    march 29

    //  Problem: Remove the Last Vowel
//    site: https://edabit.com/challenge/buctumjkfFWGx5iP6
//  task: Write a function that removes the last vowel in each word in a sentence.
//
    public static String removeLastVowel(String str) {
        String[] vowels = {"a","e","i","o","u"};
        String[] words = str.split(" ");
        for (int i = 0; i< words.length; i++){
            String[] letters = words[i].split("");
            boolean vowelTaken = false;
            for (int j = letters.length-1; j>=0; j--) {
                if (!vowelTaken){
                    for (String vowel : vowels) {
                        if (vowel.equalsIgnoreCase(letters[j])) {
                            letters[j] = "";
                            vowelTaken = true;
                            break;
                        }
                    }
                }
            }
            words[i] = String.join("",letters);
        }

        return String.join(" ",words);
    }

    //    April 1st

    //  Problem: Count the Number of Duplicate Characters
//    site: https://edabit.com/challenge/ENozFXdPz9YTTHdps
//  task: Create a function that takes a string and returns the number of alphanumeric characters that occur more than once.
//    Notes
//      Duplicate characters are case sensitive.
//      The input string will contain only alphanumeric characters.
//
    public static int duplicateCount(String str) {
        String[] letters = str.split("");
        String[] dupLetters = new String[26];
        int dups = 0;
        for (int i=0;i<letters.length;i++){
            for (int j = i+1; j<letters.length;j++){
                if (letters[i].equals(letters[j])){
                    if (dups == 0){
                        dupLetters[dups] = letters[i];
                        dups++;
                    }else {
                        boolean counted = false;
                        for (int k=0; k<dups;k++){
                            if (letters[i].equals(dupLetters[k])){
                                counted =true;
                                break;
                            }
                        }
                        if (!counted){
                            dupLetters[dups] = letters[i];
                            dups++;
                        }
                    }

                }
            }
        }
        return dups;
    }

    //    April 2

//  Problem: Swapping Two by Two
//    site: https://edabit.com/challenge/Bt6tuyqL7ESZHpsec
//  task: Write a function that swaps the first pair (1st and 2nd characters) with the second pair (3rd and 4th characters) for every quadruplet substring.
//    Notes
//      Keep leftover strings in the same order.
//

    public static String swapTwo(String str) {
        String[] letters = str.split("");
        int remainder = letters.length % 4;
        int i = 0;
        while (i+4 <= letters.length){
            String tempHold1 = letters[i];
            String tempHold2 = letters[i+1];
            letters[i] = letters[i+2];
            letters[i+1] = letters[i+3];
            letters[i+2] = tempHold1;
            letters[i+3] = tempHold2;
            i+=4;
        }

        return String.join("",letters);
    }

    //    April 5

//  Problem: Phone Number Word Decoder
//    site: https://edabit.com/challenge/8NZaLdJBkhZCgNBc7
//  task: Create a program that converts a phone number with letters to one with only numbers.
//
//Number	Letter
//0	none
//1	none
//2	ABC
//3	DEF
//4	GHI
//5	JKL
//6	MNO
//7	PQRS
//8	TUV
//9	WXYZ
//
//    Notes
//All inputs will be formatted as a string representing a proper phone number in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.
//Check the Resources tab for more info on telephone keypads.
//
public static String textToNum(String phone) {
        String[] numbers = phone.split("");
        String[] letterConvert = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i].equalsIgnoreCase("(")||numbers[i].equalsIgnoreCase(")")||numbers[i].equalsIgnoreCase("-")){
                continue;
            }
            if (!(numbers[i].equalsIgnoreCase("0")||numbers[i].equalsIgnoreCase("1")
                    ||numbers[i].equalsIgnoreCase("2")||numbers[i].equalsIgnoreCase("3")
                    ||numbers[i].equalsIgnoreCase("4")||numbers[i].equalsIgnoreCase("5")
                    ||numbers[i].equalsIgnoreCase("6")||numbers[i].equalsIgnoreCase("7")
                    ||numbers[i].equalsIgnoreCase("8")||numbers[i].equalsIgnoreCase("9"))){
                for (int j = 0; j <letterConvert.length;j++){
                    for (String letter: letterConvert[j].split("")) {
                        if (numbers[i].equalsIgnoreCase(letter)){
                            numbers[i] = Integer.toString(j);
                        }
                    }
                }
            }
        }

        return String.join("",numbers);
}

    //    April 6

//  Problem: Triple + Double = So Much Trouble
//    site: https://edabit.com/challenge/27h4mwAKD3hhy6onh
//  task: Create a function that takes two integers and returns true if a number repeats three times in a row at any
//          place in num1 AND that same number repeats two times in a row in num2.
//    Notes
//      You can expect every test case to contain exactly two integers.
//
    public static boolean trouble(long num1, long num2) {
        String sNum1 = Long.toString(num1);
        String sNum2 = Long.toString(num2);
        boolean hasTriple = false;
        boolean hasDouble = false;

        String[] tripleNum = sNum1.split("");
        String[] doubleNum = sNum2.split("");

        for (int i = 0; i < tripleNum.length-2; i++){
            if (tripleNum[i].equalsIgnoreCase(tripleNum[i+1]) && tripleNum[i].equalsIgnoreCase(tripleNum[i+2])){
                hasTriple = true;
            }
        }
        for (int i = 0; i < doubleNum.length-1;i++){
            if (doubleNum[i].equalsIgnoreCase(doubleNum[i+1])){
                hasDouble = true;
            }
        }

        if (hasDouble && hasTriple){
            return true;
        }
        return false;
    }

}



