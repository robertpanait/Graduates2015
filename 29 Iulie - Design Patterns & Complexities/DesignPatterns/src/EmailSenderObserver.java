/**
 * Created by rpanait on 7/29/2015.
 */
public class EmailSenderObserver implements Observer {
    Worker wk;
    double previousSalary;
    EmailSenderObserver(Worker wk) {
        previousSalary=wk.getSalary();
        this.wk=wk;
        wk.addObservers(this);
    }
    @Override
    public void notifyW() {
        if ((wk.getSalary() > previousSalary)) {
            System.out.println("E-mail");
        }
        previousSalary=wk.getSalary();
    }
}
