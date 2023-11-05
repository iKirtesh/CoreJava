package Design_Patterns.Creational_Patterns.Builder;

class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.userId + " " + this.userName + " " + this.emailId;
    }


    // Inner class to create a User object
    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {
        }

        public static UserBuilder newInstance() {
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}

class Main{
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("12")
                .setUserName("iKirtesh")
                .setEmailId("kirteshadmute@gmail.com")
                .build();
        System.out.println(user);

        User user2 = User.UserBuilder.newInstance()
                .setUserId("13")
                .setUserName("iKirtesh")
                .setEmailId("kirtesh@gmail.com")
                .build();
        System.out.println(user2);
    }
}