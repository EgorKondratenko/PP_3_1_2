package spring.pp_3_1_2_v2.dao;

import spring.pp_3_1_2_v2.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getall();
    public void addUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user,Long id);
}
