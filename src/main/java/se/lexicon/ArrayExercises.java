package se.lexicon;

import java.util.Arrays;

public class ArrayExercises {
    static void main() {
        //Store and print array elements

        int[] numbersArr = new int[]{11, 23, 39};

        System.out.println(Arrays.toString(numbersArr));

        //Ex -2

        int[] numb = {2,4,5,7};

        int index = indexOf(numb,5);

        System.out.println("Index position of number 5 is: " +index);
    }

    //Create a method named indexOf that return index of the element
    public static int indexOf(int[] array, int value) {

        for(int i = 0; i < array.length; i ++){
            if(array[i] == value) {
                return i;
               }
            }
        return -1;
        }


}

