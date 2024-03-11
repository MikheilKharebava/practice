package properties;

import user.User;

public class userFactory {

  public static final String ALL_USER_PASSWORD = "password";
  public static final String STANDARD_USER_LOGIN = "standard_user_name";

  public static User withStandardUser(){
    return new User(UserProperties.getValueOf(STANDARD_USER_LOGIN),
        UserProperties.getValueOf(ALL_USER_PASSWORD));
  }

}
