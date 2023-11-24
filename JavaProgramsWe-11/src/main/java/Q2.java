/*
Re write the student mark sheet program using if else and while loop.
 */

import java.util.Scanner;

public class Q2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); //Scanner class

        System.out.print("Enter name of student");
        String n = in.nextLine();

        System.out.print("Enter Maths Subject Marks");
        int m1 = in.nextInt();
        System.out.print("Enter Science Subject Marks");
        int m2 = in.nextInt();
        System.out.print("Enter English Subject Marks");
        int m3 = in.nextInt();

        //valid marks check
        while(m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
            System.out.println("Marks should between o and 100");

            System.out.print("Enter Maths Subject Marks");
            m1 = in.nextInt();
            System.out.print("Enter Science Subject Marks");
            m2 = in.nextInt();
            System.out.print("Enter English Subject Marks");
            m3 = in.nextInt();
        }

//Total Marks
        int t = m1 + m2 + m3;

//Average Percentage
        double  p= t / 3;
        System.out.println("Average : " + p);
//Grade
        String g = "";
        if (p >= 80)
            g = "A+";
        else if (p >= 60)
            g = "A";
        else if (p >= 50)
            g = "B";
        else if (p >= 35)
            g = "C";

        else {
            g = "fail";
        }


        System.out.println(" ________________________________________");
        System.out.println("|                                       |");
        System.out.println("|               MARKS SHEET             |");
        System.out.println("|   NAME     "+n+"                      |");
        System.out.println("|   Subject                             |");
        System.out.println("|_______________________________________|");
        System.out.println("|    Maths  :   "+m1+"                  |");
        System.out.println("|    Science:   "+m2+"                  |");
        System.out.println("|    English:   "+m3+"                  |");
        System.out.println("|    Total  :   "+t+"                   |");
        System.out.println("|    percentage:"+p+"                    |");
        System.out.println("|    Grade :     "+g+"                  |");



    }
}

