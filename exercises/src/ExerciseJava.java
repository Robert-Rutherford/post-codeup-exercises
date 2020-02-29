import java.util.Arrays;

public class ExerciseJava {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));
        System.out.println(Arrays.toString(arrayOfMultiples(12, 10)));
        System.out.println(Arrays.toString(arrayOfMultiples(17, 6)));

    }


//    2/29/2020 - light exercise edabit.com **************
//  Problem: Array of Multiples
//  task: Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
//  site: https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public static int[] arrayOfMultiples(int num,int length){
        int[] newArray = new int[length];
        for (int i = 0; i<length;i++){
            newArray[i] = num*(i+1);
        }
        return newArray;
    }
}
