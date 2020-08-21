package behavioral.observer.desin.pattern;
import java.util.List;
import java.util.ArrayList;


public class Channel {
    List<Observer> observers = new ArrayList<>();
    private String title;

    public void subscribeObserver(Observer subscribe){
        observers.add(subscribe);
    }
    public void unsubscribeObserver(Observer unsubscribe){
        observers.remove(unsubscribe);
    }
    public void subscribeObserverNotify(){
        for (Observer observer:observers) {
            observer.update();
        }
    }
    public void upload(String title){
        this.title=title;
        subscribeObserverNotify();
    }




}
