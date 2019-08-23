package yan.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yan.dreamland.www.dao.UserMapper;
import yan.dreamland.www.entity.User;
import yan.dreamland.www.service.UserService;

/**
 * TODO
 *
 * @ClassName: UserServiceImpl
 * @author: yan
 * @since: 2019/6/14 14:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public int regist(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User login(String email, String password) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findByPhone(String phone) {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public void update(User user) {

    }
}
