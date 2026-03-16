package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CollectionExercises {
    static void main() {

        System.out.println("""
                1.  Create a new list and populate it with the days of the week. Lastly,
    print out the list.
    """);
        List<String> daysOfWeek = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println("Days Of the week are: " + daysOfWeek);
        System.out.println();

        System.out.println("""
                2.  Create a new list and populate it with the days of the week. Lastly,
    iterate through the list and print out each element separately.
    """);
        for (String day : daysOfWeek){
            System.out.println(day);
        }
        System.out.println();

        System.out.println("""
                3.  Create a new list and populate it with the days of the week
    **excluding THURSDAY**. Lastly, insert the weekday **THURSDAY** into the correct position in the list.
    """);
        List<String> daysExclude = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Friday","Saturday","Sunday"));
        System.out.println("New List excluding Thursday: " + daysExclude);
        daysExclude.add(3,"Thursday");
        for (String days : daysExclude){
            System.out.println(days);
        }
        System.out.println();

        System.out.println("""
                4.  Create a new list and populate it with the days of the week. Then
    create a new list out of the first three elements of the first list using a `subList`.
    """);
        List<String> firstThreeDays = daysOfWeek.subList(0,3);
        System.out.println("Original List: " + daysOfWeek);
        System.out.println("First Three Days: " + firstThreeDays);
        System.out.println();

        System.out.println("""
                5.  Create a new `HashSet` and populate it with the days of the week.
    Lastly, print the set and pay attention to the order of the
    elements.
    """);
        HashSet<String> daysOfTheWeek = new HashSet<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println(daysOfTheWeek);
        System.out.println();

        System.out.println("""
                6.  Create a new `HashSet` and populate it with the days of the week.
    Then convert the `HashSet` to an `ArrayList`.
    """);
        HashSet<String> daysSet = new HashSet<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println("Created Hashset: " + daysSet);

        ArrayList<String> daysList = new ArrayList<>(daysSet);
        System.out.println("Converted ArrayList: " + daysList);
        System.out.println();










    }







}
