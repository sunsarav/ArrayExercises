package se.lexicon;

import java.util.Arrays;

public class ArrayExercises {
    static void main() {

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
        System.out.println("Sorted String Array: " + Arrays.toString(cities));

        /* 4. Write a program which will copy the elements of one array into another array.
              Expected output: Elements from first array: `1 15 20`
                               Elements from second array: `1 15 20` */

        int[] first = {1, 15, 20};
        int[] second = Arrays.copyOf(first, first.length);
        System.out.println("Elements from first Array :" + Arrays.toString(first));
        System.out.println("Elements from second Array :" + Arrays.toString(second));

        /* 5. Create a two-dimensional string array `[2][2]`. Assign values containing any Country and City.
              Expected output:  France Paris
                                Sweden Stockholm */

        String[][] arr = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

        /* 6. Write a program which will set up an array to hold the next values in this
        order: `43, 5, 23, 17, 2, 14` and print the average of these 6 numbers.
            Expected output: `Average is: 17.3` */

        int sum = 43 + 5 + 23 + 17 + 2 + 14;
        double average = sum / 6.0;
        System.out.println("Average is :" + average);

        /* 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
              Example: Array: `1 2 4 7 9 12`
                       Odd Array: `1 7 9` */

        int[] numbers = {1, 2, 4, 7, 9, 12, 13, 14, 15, 16};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.print("Odd Array: ");

        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        /* 8.  Write a program which will remove the duplicate elements of a given
               array `[20, 20, 40, 20, 30, 40, 50, 60, 50]`.
               Expected output: Array: `20 20 40 20 30 40 50 60 50`
                                Array without duplicates: `20 40 30 50 60` */

        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array);
        System.out.println("Array:" +Arrays.toString(array));
        System.out.print("Array without duplicates: ");

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1 && array[i] == array[i + 1]) {
                continue;
                }
            System.out.print(array[i] + " ");
            }

        /* 9. Write a method which will add elements in an array.
              Remember that arrays are fixed in size so you need to come up with a
              solution to “expand” the array. */
        int[] num = {10,20,30,40};
        num = addElement(num, 50);
        for (int n : num) {
            System.out.println(n + " ");
        }

        /* 10. Write a program which will represent multiplication table stored in multidimensional array.
                Hint: You have a two‑dimensional array with values:
                [[1,2,3,4,5,6,7,8,9,10],
                [1,2,3,4,5,6,7,8,9,10]]

        Example output:

                 1  2  3  4  5  6  7  8  9 10
                 2  4  6  8 10 12 14 16 18 20
                 3  6  9 12 15 18 21 24 27 30
                 4  8 12 16 20 24 28 32 36 40
                 5 10 15 20 25 30 35 40 45 50
                 6 12 18 24 30 36 42 48 54 60
                 7 14 21 28 35 42 49 56 63 70
                 8 16 24 32 40 48 56 64 72 80
                 9 18 27 36 45 54 63 72 81 90
                10 20 30 40 50 60 70 80 90 100 */

        int[][] table = new int[10][10];
        //Fill the array
        for (int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        //Print the table
        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);//aligns the numbers so table looks neat
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

        }
        //newElement method created for Ex.9
        public static int[] addElement(int[] arr, int newElement) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = newElement;
            return arr;
        }

    }









