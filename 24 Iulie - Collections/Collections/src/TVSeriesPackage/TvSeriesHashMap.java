package TVSeriesPackage;

import PersonPackage.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by rpanait on 7/24/2015.
 */
public class TvSeriesHashMap {
    HashMap<String, TVSeries> hashMap = new HashMap(1, 1);

    /*public void populate(String s,HashMap<String, TVSeries> hashMap) {
        TVSeries t1= new TVSeries("Mr. Bean","Tuesday","16:00",1990,"Comedy");
        hashMap.put(s,t1);
    }*/
    public void printTheContentOfTheMap() {
        Set set = hashMap.entrySet();
        final Iterator i = set.iterator();
        // Display elements
        while (i.hasNext()) {
            final Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() +"-"+me.getValue());
        }
    }
}
