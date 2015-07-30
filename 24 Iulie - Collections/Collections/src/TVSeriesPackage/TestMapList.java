package TVSeriesPackage;

import PersonPackage.Person;

import java.io.*;
import java.util.*;

/**
 * Created by rpanait on 7/24/2015.
 */
public class TestMapList {
    public static void main(String[] args) throws IOException {
        //HashMap<String, TVSeries> hashMap = new HashMap(1, 1);
        HashMap<String, String[]> hashMap1 = new HashMap(1, 1);
//        TVSeries t1= new TVSeries("Mr. Bean","Tuesday","16:00",1990,"Comedy");
//        TVSeries t2= new TVSeries("Duck","Monday","18:00",1991,"Comedy");
//        TVSeries t3= new TVSeries("Animals","Friday","21:00",2006,"Comedy");
//        hashMap.put("ProTv", t1);
//        hashMap.put("A1", t2);
//        hashMap.put("PrimaTv", t3);

        //List<String> strings = new ArrayList<String>();
        FileReader fr = new FileReader("C:\\Users\\rpanait\\Desktop\\Utile24IulieCollections\\info.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        int i=0;
        String [] strings = new String[100];
        while ((s = br.readLine()) != null) {

           // hashMap1.put(s[0],s);
            strings[i]=s;
            i++;

            // hashMap1.put("ProTv", s);


     /*   Iterator<String> i = hashMap1.keySet().iterator();
        while (i.hasNext()) {
            String key = i.next();
            System.out.println(key + "-" + hashMap1.get(key));
        }*/
        }

    }
}
