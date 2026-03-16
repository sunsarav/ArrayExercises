package se.lexicon;

import java.util.*;

public class Challenges {
    void main() {
        System.out.println("""
                1.  Create an empty `Set` and populate it with all the days of the week.
    Next, create a second `Set` and populate it with **only the weekend days** (`SATURDAY` and `SUNDAY`).
    Lastly, compare the two sets and **retain in the first set only those days that are the same in both sets**.
    """);
        Set<String> allDays = new HashSet<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday"));

        Set<String> weekends = new HashSet<>(Arrays.asList("Saturday","Sunday"));

        allDays.retainAll(weekends);
        System.out.println("Days that are present in both the sets: " + allDays);
        System.out.println();

        System.out.println("""
                2.  Create a new `HashMap` of type `<String, String>` and populate it
    with elements containing an **email (String)** and a **name (String)**. Next, create a new `Set` and
    populate it with the **keys from the HashMap**.
    """);

        HashMap<String, String> emailList = new HashMap<>();

        emailList.put("john.smith@company.com","John");
        emailList.put("emily@company.com","Emily");
        emailList.put("alex@company.com","Alex");
        emailList.put("jessica-sales@company.com","Jessica");
        emailList.put("samantha.mkt@company.com","Samantha");

        Set<String> emailSet = new HashSet<>(emailList.keySet());
        System.out.println("Created HashMap: " + emailList);

        System.out.println("Emails are: " + emailSet);

        System.out.println("""
                3.  Create a new class called **SuperHero**.
    -   Add fields for `Id`, `Name`, and `Age` with getters and setters.
    -   Have the class implement the `Comparable` interface.
    -   Implement the overridden method and have it compare the **age** of the superhero.
    -   Create a new `ArrayList<SuperHero>`.
    -   Sort the list by age and print out each element.
    """);
        ArrayList<SuperHero> heroes = new ArrayList<>();

        heroes.add(new SuperHero(1,"Spiderman",27));
        heroes.add(new SuperHero(2,"Ironman",35));
        heroes.add(new SuperHero(3,"CaptainAmerica",38));
        heroes.add(new SuperHero(4,"Cyclops",28));

        Collections.sort(heroes);

        for (SuperHero hero : heroes) {
            System.out.println(hero.getName() + "(Age: " + hero.getAge() + ")");
        }
        System.out.println();

        System.out.println("""
                4.  Create an array of type `int` with numbers:
    {1,4,4,2,6,7}
    Next, create an appropriate **Collection** and populate it with the contents of the array.
    Lastly, print out each element in the collection **without duplicates**.
    """);
        int[] numbers = {1,4,4,2,6,7};

        Set<Integer> numSet = new HashSet<>();

        for (int n : numbers) {
            numSet.add(n);
        }
        System.out.println("Collection elements are: " + numSet);
    }
}
