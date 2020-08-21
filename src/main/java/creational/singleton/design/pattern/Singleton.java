package creational.singleton.design.pattern;

/*
  Singleton Pattern is a category of Creational pattern.

  Singleton design solution is where an application wants to have
  one and only one instance of any class.

  Please implement Singleton Design Pattern.

 */
public class Singleton {
    private static  Integer counter = 0;
    private static  Singleton singleton;

    //This will show the number or of object is created
    private Singleton() {
        counter++;
        System.out.println("Object Created - "+counter.toString());
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    public void printDetails(String message){
        System.out.println(message);
    }
}
