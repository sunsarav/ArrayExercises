package se.lexicon;

import java.util.*;

public class CollectionExercises {
    static void main() {

        System.out.println("""
                1.  Create a new list and populate it with the days of the week. Lastly,
    print out the list.
    """);
        List<String> daysOfWeek = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
                "Friday","Saturday","Sunday"));
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
        List<String> daysExclude = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Friday",
                "Saturday","Sunday"));
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
        HashSet<String> daysOfTheWeek = new HashSet<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
                "Friday","Saturday","Sunday"));
        System.out.println(daysOfTheWeek);
        System.out.println();

        System.out.println("""
                6.  Create a new `HashSet` and populate it with the days of the week.
    Then convert the `HashSet` to an `ArrayList`.
    """);
        HashSet<String> daysSet = new HashSet<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
                "Friday","Saturday","Sunday"));
        System.out.println("Created Hashset: " + daysSet);

        ArrayList<String> daysList = new ArrayList<>(daysSet);
        System.out.println("Converted ArrayList: " + daysList);
        System.out.println();

        System.out.println("""
                7.  Create a new `HashSet` and populate it with random names. Then convert the `HashSet`
    to an `ArrayList`. Lastly, manually sort the list in alphabetical order and print it out.
    """);
        HashSet<String> randomNames = new HashSet<>(Arrays.asList("Stephen","Denis","David","Manju","Shaly",
                "Rashmi","Asha","Carolina","Stephi"));
        System.out.println("Random Names are: " + randomNames);

        ArrayList<String> nameLists = new ArrayList<>(randomNames);
        Collections.sort(nameLists);
        System.out.println("Sorted ArrayLists: " + nameLists);
        System.out.println();

        System.out.println("""
                8.  Create a new `HashSet` and populate it with random names. Lastly,
    sort the names in alphabetical order using only a `Set` or a child of `Set`.
    """);
        System.out.println("Random names unsorted are: " + randomNames);

        TreeSet<String> alphaOrder = new TreeSet<>(randomNames);
        System.out.println("Names sorted in alphabetical order are: " + alphaOrder);
        System.out.println();

        System.out.println("""
                9.  Create a new `HashMap` of type `<Integer, String>` and populate it with elements
    containing an **id (Integer)** and a **carMap brand (String)**. Lastly, print out the entire `HashMap`.
    """);
        HashMap<Integer, String> cars = new HashMap<>();

        cars.put(1, "Volvo");
        cars.put(2, "Tesla");
        cars.put(3, "BMW");
        cars.put(4, "Benz");
        cars.put(5, "Ferrari");
        cars.put(6, "RollsRoyce");
        cars.put(7, "Lamborghini");

        System.out.println("HashMap of Cars: " +cars);
        System.out.println();

        System.out.println("""
                10. Create a new `HashMap` of type `<Integer, String>` and populate it with elements
    containing an **id (Integer)** and a **carMap brand (String)**. Lastly, print out only the **keys**.
    """);
        System.out.println("HashMap of Cars: " +cars);
        System.out.println("Keys Of Cars: " + cars.keySet());
        System.out.println();

        System.out.println("""
                11. Create a new `HashMap` of type `<Integer, String>` and populate it with elements
    containing an **id (Integer)** and a **carMap brand (String)**. Lastly, print out only the **values**.
    """);
        System.out.println("HashMap of Cars: " +cars);
        System.out.println("Values of Cars: " + cars.values());
        System.out.println();

        System.out.println("""
                12. Create a new class called **Car**.
    -   Add fields for `Id`, `Brand`, and `Model` with getters and setters.
    -   Create a new `HashMap` of type `<Integer, Car>` and populate it with
    elements containing an **id (Integer)** and a **Car object**.
    -   Lastly, print out only the **carMap's brand**.
    """);
        HashMap<Integer,Car> carMap = new HashMap<>();

        carMap.put(1,new Car(1,"Volvo","XC60"));
        carMap.put(2,new Car(2,"Tesla","Model S"));
        carMap.put(3,new Car(3,"BMW","X5"));
        carMap.put(4,new Car(4,"Audi","A7"));

        for (Car c : carMap.values()){
        System.out.println(c.getBrand());
        }
        System.out.println();






    }







}
