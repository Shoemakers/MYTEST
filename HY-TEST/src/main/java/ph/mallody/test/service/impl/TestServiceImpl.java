package ph.mallody.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sohu.idcenter.IdWorker;

import ph.mallody.test.mapper.UserMapper;
import ph.mallody.test.pojo.User;
import ph.mallody.test.service.ITestService;

@Service
@Transactional
public class TestServiceImpl implements ITestService {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private IdWorker idWorker;

    @Override
    public List<User> selectUser() {

        List<User> list = userMapper.selectByExample(null);
        return list;
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selectUserById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;

    }

    @Override
    public void addUser(String name) {

        User user = new User();
        user.setName(name);
        user.setId(idWorker.getId());
        userMapper.insertSelective(user);
    }

    @Override
    public void updateUser(Long id, String name) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        userMapper.updateByPrimaryKeySelective(user);

    }

}
