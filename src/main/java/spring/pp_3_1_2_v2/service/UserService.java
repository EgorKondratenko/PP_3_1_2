package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public void addUser(User user);
    public User getUser(Long id);
    public void deleteUser(Long id);
    public void updateUser(User user);
}
