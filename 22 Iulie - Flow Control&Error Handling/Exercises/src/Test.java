import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by rpanait on 7/22/2015.
 */
public class Test {
    public static void main(String[] args) {
        // Exercitiul 1
        System.out.println("Exercitiul 1: ");
        Exercise1 e1 = new Exercise1();
        System.out.println(e1.monkeyTrouble(false,false));
        System.out.println("----------------------------");
        // Exercitiul 2
        System.out.println("Exercitiul 2: ");
        Exercise2 e2 = new Exercise2();
        System.out.println(e2.parrotTrouble(true, 6));
        System.out.println("----------------------------");
        // Exercitiul 3
        System.out.println("Exercitiul 3: ");
        Exercise3 e3 = new Exercise3();
        System.out.println(e3.posNeg(-4, -5, true));
        System.out.println("----------------------------");
        // Exercitiul 4
//        System.out.println("Exercitiul 4: ");
//        Scanner s= new Scanner(System.in);
//        System.out.println("Please enter a string: ");
//        String str = s.nextLine();
//            while(str.length() ==0)
//            {
//                System.out.println("The length must be > 0");
//                str = s.nextLine();
//            }
//
//             Exercise4 e4 = new Exercise4();
//             System.out.println(e4.backAround(str));
//             System.out.println("----------------------------");
        // Exercitiul 5
        System.out.println("Exercitiul 5: ");
        Exercise5 e5 = new Exercise5();
        System.out.println(e5.everyNth("Miracle", 3));
        System.out.println("----------------------------");
        // Exercitiul 6
        System.out.println("Exercitiul 6: ");
        int[] array={1,2,3};
        Exercise6 e6 = new Exercise6();
        System.out.println(e6.scoresIncreasing(array));
        System.out.println("----------------------------");
        // Exercitiul 7
        System.out.println("Exercitiul 7: ");
        int[] arrayEx={5, 3, 6, 7, 2};
        Exercise7 e7 = new Exercise7();
        System.out.println(e7.sumHeights(arrayEx,2,4));
        System.out.println("----------------------------");
         //Exercitiul 8
//        System.out.println("Exercitiul 8: ");
//        Exercise8 e8 = new Exercise8();
//        e8.method();
//        System.out.println("----------------------------");
        // Exercitiul 9
        System.out.println("Exercitiul 9: ");
        List<Integer> lista1=new ArrayList<>();
        lista1.add(6);
        lista1.add(4);
        Exercise9 e9 = new Exercise9();
        System.out.println(e9.average(Arrays.asList(new Integer[]{2,6})));

        //System.out.println(e9.average(lista1));
        System.out.println("----------------------------");
    }
}
