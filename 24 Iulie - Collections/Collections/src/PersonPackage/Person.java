package PersonPackage;

import java.util.HashMap;

/**
 * Created by rpanait on 7/24/2015.
 */
public class Person {
    private String name;
    private int birthYear;
    public Person(String name, int birthYear) {
        this.name=name;
        this.birthYear=birthYear;
    }
    public String getName() {
        return this.name;
    }
    public String getBirthYear() {
        return this.getBirthYear();
    }
    @Override
    public String toString() {
        return name+" "+birthYear;
    }

}
