package ThiThu04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    private String name;
    private int age;

    public TestComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
    
    public static void main(String[] args) {
        List<TestComparator> personList = new ArrayList<>();
        personList.add(new TestComparator("Tú", 25));
        personList.add(new TestComparator("Dương", 35));
        personList.add(new TestComparator("Ánh", 30));

        // Sort the list in descending order of age
        Collections.sort(personList, Comparator.comparingInt(TestComparator::getAge).reversed());
        
        // Print the sorted list
        for (TestComparator person : personList) {
            System.out.println(person);
        }
    }
}
