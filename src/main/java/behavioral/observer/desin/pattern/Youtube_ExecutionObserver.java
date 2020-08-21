package behavioral.observer.desin.pattern;

public class Youtube_ExecutionObserver {
    public static void main(String[] args) {
        Channel techno = new Channel();
        Observer ob1 = new Observer("akask");
        Observer ob2 = new Observer("john");
        Observer ob3 = new Observer("david");
        Observer ob4 = new Observer("william");
        Observer ob5 = new Observer("stephen");

        techno.subscribeObserver(ob1);
        techno.subscribeObserver(ob2);
        techno.subscribeObserver(ob3);
        techno.subscribeObserver(ob4);
        techno.subscribeObserver(ob5);

        ob1.subscribeChannel(techno);
        ob2.subscribeChannel(techno);
        ob3.subscribeChannel(techno);
        ob4.subscribeChannel(techno);
        ob5.subscribeChannel(techno);

        techno.upload("learning Observer Design pattern");

    }
}
