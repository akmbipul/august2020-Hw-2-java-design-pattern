package creational.builder.design.pattern;

public class ExecutionBuilder {
    public static void main(String[] args) {
        User user = new User.UserBuilder("akash", "35")
                .getEmail("aka123456@gmail")
                .getSSN("7653-98776-54434")
                .build();
        System.out.println("User Name Is- "+user.getUserName()+" User Email Is- "+ user.getUserEmail()+
                " User Age Is- "+user.getUserAge());
    }
}
