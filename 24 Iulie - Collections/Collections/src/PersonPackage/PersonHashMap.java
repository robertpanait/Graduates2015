package PersonPackage;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by rpanait on 7/24/2015.
 */
public class PersonHashMap {
    HashMap<String, Person> hashMap = new HashMap(1, 1);


    public void printAPersonObject(String s) {
        System.out.println(hashMap.get(s));
    }


    public Boolean printIfContains(String s) {
        return hashMap.containsKey(s);
    }
    public void removeAPersonObject(String s) {
        hashMap.remove(s);
        System.out.println(hashMap.containsKey(s));
    }
    public void printTheContentOfTheMap() {

        Iterator<String> i = hashMap.keySet().iterator();
        while (i.hasNext()) {
            String key = i.next();
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
