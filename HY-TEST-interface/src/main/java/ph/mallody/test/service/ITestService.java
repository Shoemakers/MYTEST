package ph.mallody.test.service;

import java.util.List;

import ph.mallody.test.pojo.User;

public interface ITestService {

    public List<User> selectUser();

    public void deleteUser(Long id);

    public User selectUserById(Long id);

    public void addUser(String name);

    public void updateUser(Long id, String name);

}
