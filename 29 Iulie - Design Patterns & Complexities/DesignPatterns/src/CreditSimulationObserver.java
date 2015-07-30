/**
 * Created by rpanait on 7/29/2015.
 */
public class CreditSimulationObserver implements Observer {
    Worker wk;
    double salary;

    CreditSimulationObserver(Worker wk) {
        salary = wk.getSalary();
        this.wk = wk;
        wk.addObservers(this);
    }

    @Override
    public void notifyW() {
        if ((wk.getNetSalary() > 5000)) {
            System.out.println("Simulare credit");
        }
    }
}
