package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {
    private List<User> userList = Arrays.asList(new User("admin", "admin"),
                                                new User("user1", "user1"));

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<User> getAllUsers() {
        return  userList;
    }
}
