package java_exercises;

import java.math.BigInteger;
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

//        long num1 = 451999277;
//        long num2 = 411777228;
//        System.out.println(trouble(num1, num2));
//        num1 = 1222345;
//        num2 = 12345;
//        System.out.println(trouble(num1, num2));
//        num1 = 666789;
//        num2 = 12345667;
//        System.out.println(trouble(num1, num2));
//        num1 = 33789;
//        num2 = 12345337;
//        System.out.println(trouble(num1, num2));

//        System.out.println(plusSign("+f+d+c+#+f+"));
//        System.out.println(plusSign("+d+=3=+s+"));
//        System.out.println(plusSign("f++d+g+8+"));
//        System.out.println(plusSign("+s+7+fg+r+8+"));


//        System.out.println(bracketLogic("[<>()]"));
//        System.out.println(bracketLogic("[<(>)]"));
//        System.out.println(bracketLogic("[(a*b+<7-c>+9]"));
//        System.out.println(bracketLogic("[{(h*i+3)-12]/4*x+2}"));
//        System.out.println(bracketLogic("[ab(c/d<e-f+(7*6)>)+2]"));

//        System.out.println(correctSigns("3 < 7 < 11"));
//        System.out.println(correctSigns("13 > 44 > 33 > 1"));
//        System.out.println(correctSigns("1 < 2 < 6 < 9 > 3"));

//        System.out.println(addStrNums("4", "5"));
//        System.out.println(addStrNums("abcdefg", "3"));
//        System.out.println(addStrNums("1", ""));
//        System.out.println(addStrNums("1874682736267235927359283579235789257", "32652983572985729"));

//        int[] arr = new int[] {1, 2, 3, 10, 11, 15};
//        System.out.println(longestRun(arr));
//        arr = new int[] {5, 4, 2, 1};
//        System.out.println(longestRun(arr));
//        arr = new int[] {3, 5, 7, 10, 15};
//        System.out.println(longestRun(arr));
//        arr = new int[] {1, 2, 3, 5, 6, 7, 8, 9};
//        System.out.println(longestRun(arr));
//        arr = new int[] {3, 2, 1, 2, 3, 4, 5};
//        System.out.println(longestRun(arr));

//        System.out.println(incrementString("foo"));
//        System.out.println(incrementString("foobar0009"));
//        System.out.println(incrementString("foo099"));

//        System.out.println(minSwaps("101010"));
//        System.out.println(minSwaps("10001110"));
//        System.out.println(minSwaps("11110000"));

//        System.out.println(sameLetterPattern("ABAB", "CDCD"));
//        System.out.println(sameLetterPattern("ABCBA", "BCDCB"));
//        System.out.println(sameLetterPattern("FFGG", "CDCD"));
//        System.out.println(sameLetterPattern("FFFF", "ABCD"));

//        System.out.println(afterPotion("3A78B51"));
//        System.out.println(afterPotion("9999B"));
//        System.out.println(afterPotion("9A123"));
//        System.out.println(afterPotion("567"));

//        System.out.println(rectangles(1));
//        System.out.println(rectangles(2));
//        System.out.println(rectangles(3));

//        System.out.println(noYelling("What went wrong?????????"));
//        System.out.println(noYelling("Oh my goodness!!!"));
//        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
//        System.out.println(noYelling("Oh my goodness!"));
//        System.out.println(noYelling("I just cannot believe it."));

        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2",null));
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2",new String[]{"b"}));
        System.out.println(stripUrlParams("https://edabit.com", new String[]{"b"}));

    }


    //    2/29/2020 - light exercise edabit.com **************
//  Problem: Array of Multiples
//  task: Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
//  site: https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    private static int[] arrayOfMultiples(int num, int length) {
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = num * (i + 1);
        }
        return newArray;
    }

    //  Problem: Perfect Square Patch
    //  task: Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
    //  site: https://edabit.com/challenge/7Tb7qMDQHtz3xpydd
    private static int[][] squarePatch(int num) {
        int[][] square = new int[num][num];
        if (num == 0) {
            return square;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
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
    private static Boolean isValidHexCode(String code) {
        if (code.length() != 7) {
            return false;
        }
        if (code.charAt(0) != '#') {
            return false;
        }
        for (int i = 1; i < code.length(); i++) {
            boolean flag = Character.isDigit(code.charAt(i));
            if (flag) {
                int num = Character.getNumericValue(code.charAt(i));
//                will never trigger
                if (num > 9 || num < 0) {
                    return false;
                }
            } else {
                char lower = Character.toLowerCase(code.charAt(i));
                if (lower < 'a' || lower > 'f') {
                    return false;
                }
            }
        }
        return true;
    }

    //  Problem: Return the Highest and Lowest Numbers
//  task: Create a method that accepts a string of space separated numbers and returns the highest and lowest number (as a string).
//  site: https://edabit.com/challenge/iaCSbqngin2AXriyB

    private static String highLow(String numString) {
        String returnString = "";
        int high = 0;
        int low = 0;
        String[] splitString = numString.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            if (i == 0) {
                high = Integer.parseInt(splitString[i]);
                low = Integer.parseInt(splitString[i]);
            } else {
                if (Integer.parseInt(splitString[i]) > high) {
                    high = Integer.parseInt(splitString[i]);
                } else if (Integer.parseInt(splitString[i]) < low) {
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
    private static int sum(int[] numArray) {
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
    private static String rps(String player1, String player2) {
        if (player1.equalsIgnoreCase(player2)) {
            return "TIE";
        }
        if (player1.equalsIgnoreCase("rock")) {
            if (player2.equalsIgnoreCase("paper")) {
                return "Player 2 wins";
            } else if (player2.equalsIgnoreCase("scissors")) {
                return "Player 1 wins";
            }
        } else if (player1.equalsIgnoreCase("paper")) {
            if (player2.equalsIgnoreCase("scissors")) {
                return "Player 2 wins";
            } else if (player2.equalsIgnoreCase("rock")) {
                return "Player 1 wins";
            }
        } else if (player1.equalsIgnoreCase("scissors")) {
            if (player2.equalsIgnoreCase("rock")) {
                return "Player 2 wins";
            } else if (player2.equalsIgnoreCase("paper")) {
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
    private static String flipEndChars(String input) {
        if (input.length() < 2) {
            return "Incompatible.";
        }
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
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
        for (char i : str.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    codedString += (char) ('A' + ('Z' - i));
                } else {
                    codedString += (char) ('a' + ('z' - i));
                }
            } else {
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
        if (arr.length < 4) {
            return "invalid array";
        }

        if (arr[0] < 9) {
            return "invalid start time";
        }

        if (arr[1] > 17) {
            jobTime = 17 - arr[0];
            overtime = arr[1] - 17;
        } else {
            jobTime = arr[1] - arr[0];
        }
        total = (jobTime * arr[2]) + (overtime * (arr[2] * arr[3]));

        return Double.toString(total);
    }

    //  Problem: Seven Boom!
//    site: https://edabit.com/challenge/CKqfEowjmSTw2jsso
//  task: Create a function that takes an array of numbers and return "Boom!" if the number 7 appears in the array.
//  Otherwise, return "there is no 7 in the array".
//
    public static String sevenBoom(int[] arr) {
        for (int num : arr) {
            String stringNum = Integer.toString(num);
            String[] splitNum = stringNum.split("");
            for (String singleNum : splitNum) {
                if (Integer.parseInt(singleNum) == 7) {
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
        if (stringArray1.length != stringArray2.length) {
            wrongArrayBuild[wrongChar] = "";
            return wrongArrayBuild;
        }
        for (int i = 0; i < stringArray1.length; i++) {
            if (!stringArray1[i].equalsIgnoreCase(stringArray2[i])) {
                for (String wrongStr : wrongArrayBuild) {
                    if (stringArray1[i].equalsIgnoreCase(wrongStr)) {
                        matchChar = true;
                    }
                }
                if (!matchChar) {
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
        for (double[] subArray : arr) {
            for (int i = 0; i < subArray.length; i++) {
                if (i == 0) {
                    numHolder = subArray[i];
                } else {
                    if (subArray[i] > numHolder) {
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
        for (int i = 0; i < strSplit.length; i++) {
            if (strSplit[i].equalsIgnoreCase("*")) {
                strSplit[i] = vowelSplit[vowelNum];
                vowelNum++;
            }
        }

        return String.join("", strSplit);

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
        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split("");
            for (int j = 0; j < letters.length; j++) {
                if (j == 0 && letters[j].equalsIgnoreCase("x")) {
                    if (letters.length == 1) {
                        letters[j] = "ecks";
                    } else {
                        letters[j] = "z";
                    }
                } else if (letters[j].equalsIgnoreCase("x")) {
                    letters[j] = "cks";
                }
            }
            words[i] = String.join("", letters);
        }
        return String.join(" ", words);
    }

    //    march 29

    //  Problem: Remove the Last Vowel
//    site: https://edabit.com/challenge/buctumjkfFWGx5iP6
//  task: Write a function that removes the last vowel in each word in a sentence.
//
    public static String removeLastVowel(String str) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String[] letters = words[i].split("");
            boolean vowelTaken = false;
            for (int j = letters.length - 1; j >= 0; j--) {
                if (!vowelTaken) {
                    for (String vowel : vowels) {
                        if (vowel.equalsIgnoreCase(letters[j])) {
                            letters[j] = "";
                            vowelTaken = true;
                            break;
                        }
                    }
                }
            }
            words[i] = String.join("", letters);
        }

        return String.join(" ", words);
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
        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i].equals(letters[j])) {
                    if (dups == 0) {
                        dupLetters[dups] = letters[i];
                        dups++;
                    } else {
                        boolean counted = false;
                        for (int k = 0; k < dups; k++) {
                            if (letters[i].equals(dupLetters[k])) {
                                counted = true;
                                break;
                            }
                        }
                        if (!counted) {
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
        while (i + 4 <= letters.length) {
            String tempHold1 = letters[i];
            String tempHold2 = letters[i + 1];
            letters[i] = letters[i + 2];
            letters[i + 1] = letters[i + 3];
            letters[i + 2] = tempHold1;
            letters[i + 3] = tempHold2;
            i += 4;
        }

        return String.join("", letters);
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
        String[] letterConvert = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equalsIgnoreCase("(") || numbers[i].equalsIgnoreCase(")") || numbers[i].equalsIgnoreCase("-")) {
                continue;
            }
            if (!(numbers[i].equalsIgnoreCase("0") || numbers[i].equalsIgnoreCase("1")
                    || numbers[i].equalsIgnoreCase("2") || numbers[i].equalsIgnoreCase("3")
                    || numbers[i].equalsIgnoreCase("4") || numbers[i].equalsIgnoreCase("5")
                    || numbers[i].equalsIgnoreCase("6") || numbers[i].equalsIgnoreCase("7")
                    || numbers[i].equalsIgnoreCase("8") || numbers[i].equalsIgnoreCase("9"))) {
                for (int j = 0; j < letterConvert.length; j++) {
                    for (String letter : letterConvert[j].split("")) {
                        if (numbers[i].equalsIgnoreCase(letter)) {
                            numbers[i] = Integer.toString(j);
                        }
                    }
                }
            }
        }

        return String.join("", numbers);
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

        for (int i = 0; i < tripleNum.length - 2; i++) {
            if (tripleNum[i].equalsIgnoreCase(tripleNum[i + 1]) && tripleNum[i].equalsIgnoreCase(tripleNum[i + 2])) {
                hasTriple = true;
            }
        }
        for (int i = 0; i < doubleNum.length - 1; i++) {
            if (doubleNum[i].equalsIgnoreCase(doubleNum[i + 1])) {
                hasDouble = true;
            }
        }

        return hasDouble && hasTriple;
    }


    /* Renewing Java Skills start-up
     *
     * July 16th
     *
     *
     *
     *
     * */

    // Problem: Know Your Neighbor
    // site: https://edabit.com/challenge/ka4Mk98LW4TEbcqzH
    // task: Create a function that takes a string as an argument and returns true if each letter in the string is
    //          surrounded by a plus sign. Return false otherwise.

    public static boolean plusSign(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((Character.isLetter(str.charAt(i)))) {
                if (i == 0 || str.charAt(i - 1) != '+') {
                    return false;
                }
                if (i == (str.length() - 1) || str.charAt(i + 1) != '+') {
                    return false;
                }
            }
        }
        return true;
    }


    // Problem: Bracket Logic
    // site: https://edabit.com/challenge/Cu6euwD8Mi2c7BAHd
    // task: Brackets and parentheses in mathematical expressions have to conform to certain logical rules. Every
    // opening bracket must have a closing mate somewhere further down the line. Although brackets can be nested,
    // different types cannot overlap:
    //
    //      ([<x+y>+3]-1) makes sense because each set of brackets contains or is contained by another set.
    //      ([<x+y>+3)-1] makes no sense because the parentheses and the square brackets overlap.
    //
    //Given a string expression that can contain four types of brackets: () <> [] {}, create a function that returns
    // true if the bracket logic is valid and false if it is not.

    public static boolean bracketLogic(String xp) {
        char[] startBrackets = {'(', '[', '{', '<'};
        char[] endBrackets = {')', ']', '}', '>'};
        int priorityIndex = 0;
        char[] currentStack = new char[10];
        for (int i = 0; i < xp.length(); i++) {
//            open bracket case
            boolean contains = false;
            for (char c : startBrackets) {
                if (c == xp.charAt(i)) {
                    contains = true;
                    break;
                }
            }
            if (contains) {
                currentStack[priorityIndex] = xp.charAt(i);
                priorityIndex++;
            }

//            close bracket case
            for (char c : endBrackets) {
                if (c == xp.charAt(i)) {
                    contains = true;
                    break;
                }
            }
            if (contains) {
                if (priorityIndex == 0) {
                    return false;
                }
                if (xp.charAt(i) == ')') {
                    if (currentStack[priorityIndex - 1] != '(') {
                        return false;
                    } else {
                        priorityIndex--;
                    }
                }
                if (xp.charAt(i) == ']') {
                    if (currentStack[priorityIndex - 1] != '[') {
                        return false;
                    } else {
                        priorityIndex--;
                    }
                }
                if (xp.charAt(i) == '}') {
                    if (currentStack[priorityIndex - 1] != '{') {
                        return false;
                    } else {
                        priorityIndex--;
                    }
                }
                if (xp.charAt(i) == '>') {
                    if (currentStack[priorityIndex - 1] != '<') {
                        return false;
                    } else {
                        priorityIndex--;
                    }
                }
            }

        }
        return priorityIndex == 0;
    }

    // Problem: Correct Inequality Signs
    // site: https://edabit.com/challenge/vtW558tXEYFQGv27S
    // task: Create a function that returns true if a given inequality expression is correct and false otherwise.
    public static boolean correctSigns(String str) {
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase("<") || array[i].equalsIgnoreCase(">")) {
                int num1 = Integer.parseInt(array[i - 1]);
                int num2 = Integer.parseInt(array[i + 1]);
                if (array[i].equalsIgnoreCase("<")) {
                    if (num1 >= num2) {
                        return false;
                    }
                } else {
                    if (num1 <= num2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    // Problem: Add Two String Numbers
    // site: https://edabit.com/challenge/QwGgDuvWtFmDTeRHw
    // task: Write a function that adds two numbers. The catch, however, is that the numbers will be strings.
    // Notes: If there are any non-numerical characters, return "-1".
    //          If one option is blank the code should still work.
    //          Your function should be able to add any size number.
    //          Your function doesn't have to add negative numbers.
    //      Bonus: Don't use BigInteger or BigDecimal classes.
    public static String addStrNums(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0) {
            if (num1.length() == 0 && isNumeric(num2)) {
                return num2;
            } else if (num2.length() == 0 && isNumeric(num1)) {
                return num1;
            } else {
                return "-1";
            }
        }
        if (!isNumeric(num1) || !isNumeric(num2)) {
            return "-1";
        }
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger sum = number1.add(number2);

        return sum.toString();
    }

    private static boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;

    }

    // Problem: Longest Consecutive Run
    // site: https://edabit.com/challenge/NwSd26PwgggJquov3
    // task: A consecutive-run is a list of adjacent, consecutive integers. This list can be either increasing or
    // decreasing. Create a function that takes an array of numbers and returns the length of the longest
    // consecutive-run.
    //
    //To illustrate:
    //
    //      longestRun([1, 2, 3, 5, 6, 7, 8, 9]) ➞ 5
    //      // Two consecutive runs: [1, 2, 3] and [5, 6, 7, 8, 9] (longest).
    //
    // Note: If there aren't any consecutive runs (there is a gap between each integer), return 1.
    public static int longestRun(int[] arr) {
        int consecutive = 1;
        int counter = 1;
        boolean start = true;
        boolean first = true;
        boolean positive = true;
        boolean lastpositive = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1] || arr[i] - 1 == arr[i + 1]) {
                positive = arr[i] + 1 == arr[i + 1];
                if (start) {
                    // reset
                    lastpositive = positive;
                    counter = 2;
                    start = false;
                } else {
                    if (lastpositive == positive) {
                        counter++;
                    } else {
                        if (consecutive < counter) {
                            consecutive = counter;
                        }
                        // reset
                        lastpositive = positive;
                        counter = 2;
                    }
                }
            } else {
                start = true;
                if (consecutive < counter) {
                    consecutive = counter;
                }

            }
        }
        if (!start) {
            if (consecutive < counter) {
                consecutive = counter;
            }
        }

        return consecutive;
    }


    // Problem: String Incrementer
    // site: https://edabit.com/challenge/iqEb9gZi2jgNR99At
    // task: Write a function which increments a string to create a new string.
    //
    //  If the string ends with a number, the number should be incremented by 1.
    //  If the string doesn't end with a number, 1 should be added to the new string.
    //  If the number has leading zeros, the amount of digits should be considered.
    public static String incrementString(String str) {
        if (!Character.isDigit(str.charAt(str.length() - 1))) {
            return str + "1";
        }
        int digitLength = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                digitLength++;
            } else {
                String numberSub = str.substring(str.length() - digitLength);
                int add = Integer.parseInt(numberSub) + 1;
                StringBuilder newNumber = new StringBuilder(Integer.toString(add));
                if (newNumber.length() < numberSub.length()) {
                    int zeros = numberSub.length() - newNumber.length();
                    for (int j = 0; j < zeros; j++) {
                        newNumber.insert(0, "0");
                    }
                }
                return str.substring(0, str.length() - digitLength) + newNumber;
            }
        }
        return "error";
    }

    // Problem: Minimum Swaps to Alternate a Binary String
    // site: https://edabit.com/challenge/EiemTcctcJXCn6eJa
    // task: Write a function that returns the minimum number of swaps to create an alternating binary string.
    // The input will have the same number of zeroes and ones.
    public static int minSwaps(String str) {
        char[] numbers = str.toCharArray();
        boolean zeroTurn = false;
        char[] switchChars = new char[numbers.length];
        if (numbers[0] == '0') {
            zeroTurn = true;
        }
        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] == '0' && zeroTurn) || (numbers[i] == '1' && !zeroTurn)) {
                switchChars[i] = numbers[i];
            }
            zeroTurn = !zeroTurn;
        }

        int zeros = 0;
        int ones = 0;
        for (char switchChar : switchChars) {
            if (switchChar == '0') {
                zeros++;
            }
            if (switchChar == '1') {
                ones++;
            }
        }

        // ones and zeros should match but just in case
        return Math.max(zeros, ones);
    }

    // Problem: Same Letter Patterns
    // site: https://edabit.com/challenge/DhwkubnGy7mwZ2xt9
    // task: Create a function that returns true if two strings share the same letter pattern, and false otherwise.
    public static boolean sameLetterPattern(String str1, String str2) {
        char[] group1 = str1.toCharArray();
        char[] group2 = str2.toCharArray();
        if (group1.length != group2.length) {
            return false;
        }

        char[] patternCoder = new char[group1.length];
        int[] numPattern1 = new int[group1.length];
        int index = 0;

        createPatternArray(group1, patternCoder, numPattern1, index);

        patternCoder = new char[group2.length];
        int[] numPattern2 = new int[group2.length];
        index = 0;

        createPatternArray(group2, patternCoder, numPattern2, index);

        for (int i = 0; i < numPattern1.length; i++) {
            if (numPattern1[i] != numPattern2[i]) {
                return false;
            }
        }


        return true;
    }

    private static void createPatternArray(char[] group1, char[] patternCoder, int[] numPattern1, int index) {
        for (int i = 0; i < group1.length; i++) {
            if (i == 0) {
                patternCoder[0] = group1[0];
                index++;
                numPattern1[0] = 0;
            } else {
                int indexHunt1 = new String(patternCoder).indexOf(group1[i]);
                if (indexHunt1 == -1) {
                    patternCoder[index] = group1[i];
                    numPattern1[i] = index;
                    index++;
                } else {
                    numPattern1[i] = indexHunt1;
                }
            }
        }
    }


    // Problem: Growing and Shrinking Potions
    // site: https://edabit.com/challenge/rEuWBDwABDMo2rTSt
    // task: There are two types of potions:
    //
    //Growing potion: "A"
    //Shrinking potion: "B"
    //If "A" immediately follows a digit, add 1 to the digit.
    //If "B" immediately follows a digit, subtract 1 from the digit.
    //Create a function that returns a string according to these rules, removing the potions once they've been consumed.
    public static String afterPotion(String str) {
        int potionCount = 0;
        char[] altered = str.toCharArray();
//        Attempt 1
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.toUpperCase(str.charAt(i)) == 'A' && i != 0){
//                altered[i-1] = (char) (Character.getNumericValue(str.charAt(i-1)) + 1);
//                potionCount++;
//            }
//            else if (Character.toUpperCase(str.charAt(i)) == 'B' && i != 0){
//                altered[i-1] = (char) (Character.getNumericValue(str.charAt(i-1)) - 1);
//                potionCount++;
//            }
//        }
//        char[] updated = new char[str.length()-potionCount];
//        int index = 0;
//        for (char c : altered) {
//            if (Character.isDigit(c)) {
//                updated[index] = c;
//                index++;
//            }
//        }
//        return new String(updated);
//        Attempt 2
        for (int i = 0; i < altered.length; i++) {
            if ((Character.toUpperCase(str.charAt(i)) == 'A' || Character.toUpperCase(str.charAt(i)) == 'B') && i != 0) {
                potionCount++;
            }
        }
        return "";
    }

    // Problem: How Many Rectangles?
    // site: https://edabit.com/challenge/LyytqgmYKzCgBGbxE
    // task: Create a function that takes a number steps as an argument and returns the amount of rectangles
    // you can count in a matrix.
    public static int rectangles(int step) {
        double function = (step*(step+1))/2;
        double total = Math.pow(function,2);

        return (int) Math.round(total);
    }

    // Problem: No Yelling
    // site: https://edabit.com/challenge/33tRK98geLPcf73PF
    // task: Create a function that transforms sentences ending with multiple question marks ? or exclamation marks !
    // into a sentence only ending with one without changing punctuation in the middle of the sentences.
    // notes: Only change ending punctuation - keep the exclamation marks or question marks in the middle of the
    //          sentence the same (see third example).
    //        Don't worry about mixed punctuation (no cases that end in something like ?!??!).
    //        Keep sentences that do not have question/exclamation marks the same.
    public static String noYelling(String phrase) {
        char[] letters = phrase.toCharArray();
        boolean endYell = true;
        int yellCount = 0;
        for (int i = letters.length-1; i > 0; i--){
            if (letters[i] == '!' || letters[i] == '?' && endYell){
                yellCount++;
            }else{
                endYell = false;
            }
        }
        if (yellCount != 0){
            yellCount--;
        }
        char[] edit = new char[letters.length-yellCount];
        System.arraycopy(letters, 0, edit, 0, edit.length);
        return new String(edit);
    }

    // Problem: Strip URL Query Parameters
    // site: https://edabit.com/challenge/W7juRdtzze5ZbrfbJ
    // task: Create a function that takes a URL (string), removes duplicate query parameters and parameters specified
    // within the 2nd argument (which will be an optional array).
    //Notes: The 2nd argument paramsToStrip is optional.
    //paramsToStrip can contain multiple params.
    //If there are duplicate query parameters with different values, use the value of the last occurring parameter
    // (see examples #1 and #2 above).
    public static String stripUrlParams(String url, String[] paramsToStrip) {
        int queryIndexStart = url.indexOf('?');
        if (queryIndexStart == -1){
            return url;
        }
        String[] variableName = new String[10];
        int nameIndex = 0;
        int dupIndex = 0;
        String[] variableValue = new String[10];
        boolean duplicate = false;
        String variables = url.substring(queryIndexStart);
        if (variables.length() == 1){
            return url.substring(0,queryIndexStart);
        }
        String variable = "";
//        quicker way with for substrings but will use for loop for now
        for (int i = 1; i < variables.length(); i++){
            if (variables.charAt(i) == '='){
                if (getIndexOf(variableName,variable) != -1){
                    dupIndex = getIndexOf(variableName,variable);
                    duplicate = true;
                }
                else {
                    variableName[nameIndex] = variable;
                    variable = "";
                }
            }else if (variables.charAt(i) == '&'){
                if (duplicate){
                    variableValue[dupIndex] = variable;
                    duplicate = false;
                }
                else {
                    variableValue[nameIndex] = variable;
                    variable = "";
                    nameIndex++;
                }
            }else {
                variable = variable + variables.charAt(i);
            }
        }
        int variableCount = 0;
        for (String var: variableName) {
            if (var != null){
                variableCount++;
            }
        }
        if (paramsToStrip != null){
            for (String cut: paramsToStrip) {
                if (getIndexOf(variableName,cut) != -1){
                    variableCount--;
                }
            }
        }

        if (variableCount == 0){
            return url.substring(0,queryIndexStart);
        }

//        rebuild URL
        String urlReformed = url.substring(0,queryIndexStart+1);
        for (int i = 0; i < variableName.length; i++){
            if (variableName[i] != null && (paramsToStrip == null || getIndexOf(paramsToStrip,variableName[i]) == -1)){
                urlReformed = urlReformed + variableName[i] + "=" + variableValue[i] + "&";
            }
        }

        return urlReformed;
    }

    private static int getIndexOf(String[] strings, String item) {
        for (int i = 0; i < strings.length; i++) {
            if (item.equals(strings[i])) return i;
        }
        return -1;
    }

}



