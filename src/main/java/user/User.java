package user;

import java.util.Objects;

public class User {

  private String userName;
  private String password;

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "user='" + userName + '\'' +
        ", password='" + password + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user1 = (User) o;
    return Objects.equals(userName, user1.userName) && Objects.equals(password,
        user1.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUserName(), getPassword());
  }
}
