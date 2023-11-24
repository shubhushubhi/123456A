/*
3. Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.
 */

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>(); // declare arraylist
        ArrayList<String> color = new ArrayList<>();
        colour.add("Yellow");
        colour.add("Blue");
        colour.add("red");
        colour.add("Black");



       for (String a : colour) {

            System.out.println(colour);

        }
    }

}



