package creational.singleton.design.pattern;

public class ExecutionSingleton {
    public static void main(String[] args) {

        Singleton fromStudent = Singleton.getInstance();
        fromStudent.printDetails("Task 1 From Student");

        Singleton fromEmployee = Singleton.getInstance();
        fromEmployee.printDetails("Task 2 From Employee");
    }
}
