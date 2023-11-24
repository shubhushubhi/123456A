/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */

import java.util.ArrayList;

public class Q5 {

    public static void main(String[] args) {

        // create ArrayList
        ArrayList<String> underground = new ArrayList<>();

        // Add elements to ArrayList
        underground.add("Metropolitan");
        underground.add("Picadilly");
        underground.add("Central");

        //Arraylist not empty
        System.out.println("Original array list: " + underground);
        System.out.println("Checking the above array list is not empty  "+underground.isEmpty());

        underground.removeAll(underground);

        //ArrayList empty

        System.out.println("Array list after remove all elements "+underground);
        System.out.println("Checking the above array list is empty "+underground.isEmpty());


    }
}


