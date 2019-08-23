package yan.dreamland.www.dao;

import tk.mybatis.mapper.common.Mapper;
import yan.dreamland.www.entity.User;

public interface UserMapper extends Mapper<User> {

    User findByEmail(String email);

    void update(User user);
}