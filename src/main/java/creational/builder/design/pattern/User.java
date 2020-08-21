package creational.builder.design.pattern;

/*
  Builder Design Pattern is a category of Creational pattern and it
  is a way to construct complex object.

  Below is the User class that have some private fields/attributes.

  Please implement Builder Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public class User {
    private String userName;
    private String userEmail;
    private String userSSN;
    private String userAge;

    private User(UserBuilder builder){
        this.userName=builder.userName;
        this.userEmail=builder.userEmail;
        this.userSSN=builder.userSSN;
        this.userAge=builder.userAge;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserSSN() {
        return userSSN;
    }

    public String getUserAge() {
        return userAge;
    }


    public static class UserBuilder {
        private String userName;
        private String userEmail;
        private String userSSN;
        private String userAge;


        public UserBuilder(String userName, String userAge) {
            this.userName = userName;
            this.userAge = userAge;
        }
        public UserBuilder getName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder getEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public UserBuilder getSSN(String userSSN) {
            this.userSSN = userSSN;
            return this;
        }
        public UserBuilder getAge(String userAge) {
            this.userAge = userAge;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
