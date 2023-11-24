/*
11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
 */

public class Q11 {

    String name = "Kinnari";

    public static void main(String[] args) {

        String [] member = {"Scrum", "Java", "Selenium", "Code", "Jira"};

        for (int i = 0; i < member.length; i++) {
           // System.out.println(member[i]); only to print my name
        }

        Q11 obj = new Q11();
        System.out.println(obj.name);
    }

}
