/**
 * Created by rpanait on 7/29/2015.
 */
public class Main {
    public static void main(String[] args) {
       // NetSalaryObserver ob1=new NetSalaryObserver();
        Worker w1=new Worker("Popescu Ion",4325.5);
        EmailSenderObserver ob2 = new EmailSenderObserver(w1);
        w1.addObservers(ob2);
//        w1.NotifyObservers();

        System.out.println("EmailSenderObserver: ");

        System.out.println("Salariul este :" + w1.getSalary());
        w1.setSalary(6000);
        //System.out.println("Noul salariu este :" + (w1.getSalary()+1000));
        ob2.notifyW();

        System.out.println("--------------------------------------------");

        System.out.println("CreditSimulationObserver: ");
        CreditSimulationObserver cs1=new CreditSimulationObserver(w1);
        cs1.notifyW();

        System.out.println("--------------------------------------------");

        System.out.println("NetSalaryObserver: ");
        NetSalaryObserver ns1=new NetSalaryObserver(w1);
        w1.setSalary(7000);
        ns1.notifyW();
    }
}
