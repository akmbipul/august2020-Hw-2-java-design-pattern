package behavioral.observer.desin.pattern;

import java.security.PrivateKey;

/*
  Observer design pattern is a category of Behavioral pattern which defines a one-to-many
  dependency between objects so that one object changes state, all its dependencies are
  notified and updated automatically.

  Please implement Observer Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public class Observer {
    private  String name;
    private Channel channel = new Channel();

    public Observer(String name) {
        this.name = name;
    }
    public void update(){
        System.out.println("Hey "+name+", Video Is Uploaded");
    }
    public void subscribeChannel(Channel ch){
        channel =ch;
    }


}
