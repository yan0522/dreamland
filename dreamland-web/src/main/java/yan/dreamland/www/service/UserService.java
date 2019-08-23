package yan.dreamland.www.service;

import yan.dreamland.www.entity.User;

/**
 * @InterfaceName: UserService
 * @author: yan
 * @since: 2019/6/14 13:44
 */
public interface UserService {

    /**
     * 注册
     * @param user
     * @return
     */
    int regist(User user);

    /**
     * 用户登陆
     * @param email
     * @param password
     * @return
     */
    User login(String email,String password);

    /**
     * 根据用户邮箱查询用户
     * @param email
     * @return
     */
    User findByEmail(String email);

    /**
     * 根据用户手机号查询用户
     * @param phone
     * @return
     */
    User findByPhone(String phone);

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 根据邮箱账号删除用户
     * @param email
     */
    void deleteByEmail(String email);

    /**
     * 更新用户
     * @param user
     */
    void update(User user);
}
