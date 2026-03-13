package se.lexicon;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        /* 1. Write a program which will store elements in an array of type `int` and print it out.
        Expected output: `11 23 39` etc. */

        int[] numbersArr = new int[]{11, 23, 39};

        System.out.println(Arrays.toString(numbersArr));

        /* 2. Create a program and create a method with name `indexOf` which will find and return the index of an element in the
        array. If the element doesn’t exist your method should return `-1` as value.
        Expected output: `Index position of number 5 is: 2` */

        int[] numb = {2, 4, 5, 7};

        int index = indexOf(numb, 5);

        System.out.println("Index position of number 5 is: " + index);

        /* 3. Write a program which will sort a string array.
           Expected output:  String array: `[Paris, London, New York, Stockholm]`
                             Sorted string array: `[London, New York, Paris, Stockholm]` */

        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String Array: " + Arrays.toString(cities));

        Arrays.sort(cities);
        System.out.println("Sorted String: " + Arrays.toString(cities));

        /* 4. Write a program which will copy the elements of one array into another array.
              Expected output: Elements from first array: `1 15 20`
                               Elements from second array: `1 15 20` */

        int[] first = {1, 15, 20};
        int[] second = Arrays.copyOf(first, first.length);
        System.out.println("Copy of Arrays :" + Arrays.toString(second));

        /* 5. Create a two-dimensional string array `[2][2]`. Assign values containing any Country and City.
              Expected output:  France Paris
                                Sweden Stockholm */

        String[][] arr = {
                {"France", "Paris"},
                {"Sweden","Stockholm"}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        }

        //indexOf method created for Ex.2
        public static int indexOf ( int[] array, int value){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;


        //Sort String Array


        }
    }




