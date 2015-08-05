import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpanait on 7/29/2015.
 */
public class Worker implements Subject {
    public List<Observer> observers;
    String name;
    double salary;
    double netSalary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
        observers = new ArrayList<Observer>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void addObservers(Observer obs) {
        observers.add(obs);
    }

    public double getNetSalary() {
        return this.salary-((0.5/100)*salary+(10.5/100)*salary+(5.5/100)*salary+250);
    }

    @Override
    public void AddObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void NotifyObservers() {
        for(int i=0;i<observers.size();i++) {
            observers.get(i).notifyW();
    }
}
}
