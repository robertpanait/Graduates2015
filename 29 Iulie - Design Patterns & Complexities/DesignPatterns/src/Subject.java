/**
 * Created by rpanait on 7/29/2015.
 */
public interface Subject {
    void AddObserver(Observer o);
    void RemoveObserver(Observer o);
    void NotifyObservers();
}
