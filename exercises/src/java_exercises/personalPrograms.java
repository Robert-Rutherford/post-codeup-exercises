package java_exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class personalPrograms {
    //    personal Challenge

    public static void printFooBarBaz(){
//        number for testing limit
        int end = 100;
        for (int i = 1; i <= end; i++){
            if (i % 6 == 0){
                System.out.println("Baz");
            }else if (i % 3 == 0){
                System.out.println("Bar");
            }else if (i % 2 == 0){
                System.out.println("Foo");
            }else {
                System.out.println(i);
            }
        }
    }

//

    public static String reverseCharacters(String input){
        String[] words = input.split(" ");
        for (int i= 0; i < words.length; i++){
            char[] letters = words[i].toCharArray();
            char[] reverseLetters = new char[letters.length];
            for (int j = 0; j < reverseLetters.length; j++){
                reverseLetters[j] = letters[reverseLetters.length-(j+1)];
            }
            words[i] = String.valueOf(reverseLetters);
        }

        return String.join(" ",words);
    }


    //    binary tree
    public static Node balancedTree(ArrayList<Integer> inputList){
        int mid = (inputList.size()) / 2;

        if (inputList.size() == 0) {
            return null;
        }

        ArrayList<Integer> left = new ArrayList<Integer>();
        for (int i = 0; i < mid; i++){
            left.add(inputList.get(i));
        }
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int j = mid+1; j < inputList.size(); j++){
            right.add(inputList.get(j));
        }

        return new Node(inputList.get(mid),balancedTree(left),balancedTree(right));

    }


    /* A utility function to print preorder traversal of BST */
    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    private boolean filightMovie(int[] movies, int flightLength){

        int target = 0;

//        keys length;
//        value arrayindex;
        HashMap<Integer, Integer> movieMap = new HashMap<Integer,Integer>();
//        for (int k = 0; k < movies.length; k++){
//            movieMap.put(movies[k],k);
//        }
        for (int i =0; i < movies.length; i++){
            target = flightLength - movies[i];
            if (movieMap.get(target) != null){
                return true;
            }
            movieMap.put(movies[i],i);

//            for (int j = i+1; j < movies.length; j++){
//                if (target == movies[j]){
//                    return true;
//                }
//
//            }

        }

        return false;
    }



    private boolean palidromeSort(String letters){
        HashMap<Character,Integer> counter = new HashMap<>();

        for (int i = 0; i < letters.length(); i++){
            char letter= letters.charAt(i);
            if (counter.get(letter) == null){
                counter.put(letter,1);
            }
            else {
                counter.put(letter, (counter.get(letter) + 1));
            }
        }
        int oddCount = 0;
        for (Map.Entry<Character, Integer> group: counter.entrySet()) {
            if (group.getValue() % 2 != 0){
                oddCount++;
            }
        }

        return oddCount <= 1;






    }


}

class Node{
    public int value;
    public Node left;
    public Node right;
    public Node(int v, Node l, Node r) {
        this.value = v;
        this.left = l;
        this.right = r;
    }




}
