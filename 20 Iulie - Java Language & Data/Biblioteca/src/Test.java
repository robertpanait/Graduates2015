/**
 * Created by rpanait on 7/20/2015.
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {



//        System.out.println(c1.getTitlu());
//        System.out.println(c1.getNumarPagini());


        Scanner s= new Scanner(System.in);

        String titlu=s.nextLine();
        String autor=s.nextLine();
        String editura=s.nextLine();
        int numarPagini = s.nextInt();

        while(numarPagini ==0)
        {
            System.out.println("The number of pages must be !=0");
            numarPagini = s.nextInt();
        }
        Carte c1 = new Carte(titlu,autor,editura,numarPagini);
        Carte c2= new Carte("Ion","Liviu Rebreanu","Prisma",50);
        Carte c3= new Carte("Ion","Liviu Rebreanu","Prisma",50);
       // System.out.println(c1.getNumarPagini());

        Verificari v1=new Verificari();
        System.out.println(v1.verificaDuplicat(c1,c3));
        System.out.println("----------");
        System.out.println(v1.verifG(c1, c2));


    }
}
