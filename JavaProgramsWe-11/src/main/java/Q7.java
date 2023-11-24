/*
7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Q7 {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(1, "Jay");
        people.put(2, "Amit");
        people.put(3, "Om");
        System.out.println(people);


        for (String a: people.values()){
            if(a.equalsIgnoreCase("Om")){
                System.out.println(a);
            }

        }

        for (Integer a: people.keySet()){
            System.out.println(a);
        }
    }
}