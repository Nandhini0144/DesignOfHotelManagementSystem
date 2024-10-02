package Services;
import Models.*;
public interface UserService {
      public void createUser(User user);
      public User getUser(String id);
      public void deleteUser(String id);
}
