package PersonPackage;

import java.util.HashMap;

/**
 * Created by rpanait on 7/24/2015.
 */
public class Test {
    public static void main(String[] args) {
        Person p1=new Person("Johan",1995);
        Person p2=new Person("Mike",1955);
        Person p3=new Person("Mark",1964);
        Person p4=new Person("Michael",1982);
        Person p5=new Person("John",1991);

        PersonHashMap pr1=new PersonHashMap();

        HashMap<String, Person> hashMap = new HashMap(1, 1);
        hashMap.put(p1.getName(),p1);
        hashMap.put(p2.getName(),p2);
        hashMap.put(p3.getName(),p3);
        hashMap.put(p4.getName(),p4);

        pr1.hashMap = hashMap;

        System.out.println("Remove a person object output: ");
        pr1.removeAPersonObject(p4.getName());

        System.out.println("printAPersonObject: ");
        pr1.printAPersonObject(p2.getName());
        System.out.println(pr1.printIfContains(p2.getName()));

        System.out.println("printTheContentOfTheMap: ");
        pr1.printTheContentOfTheMap();

    }
}
