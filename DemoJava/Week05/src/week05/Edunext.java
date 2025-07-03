
package week05;

import java.util.ArrayList;

public class Edunext {
    public static void main(String[] args) {
        
        // Create a list of student names
        ArrayList <String> studentNames = new ArrayList<String> ();
        
        studentNames.add("duong");
        studentNames.add("anh");
        studentNames.add("thu");
        studentNames.add("giang");
        studentNames.add("my");
        studentNames.add("duong");  //Adding "duong" again
        studentNames.add("anh");    //Adding "anh" again
        
        // Create a new list to store capitalized names
        ArrayList <String> capitalizedNames = new ArrayList<String>();
        
        // Capitalize the first character of each name and add it to the new list
        for (String name : studentNames) {
            String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
            capitalizedNames.add(capitalized);
            System.out.println(capitalized);
        }
    }   
}
