/**
 * Created by rpanait on 7/29/2015.
 */
public class NetSalaryObserver implements Observer {
    Worker wk;
    double previousBrutSalary;
    NetSalaryObserver(Worker wk) {
        previousBrutSalary = wk.getSalary();
        this.wk = wk;
        wk.addObservers(this);
    }
    @Override
    public void notifyW() {
        if(wk.getSalary() > previousBrutSalary) {
            System.out.println("Noul salariu net este :"+wk.getNetSalary());
        }
    }
}
