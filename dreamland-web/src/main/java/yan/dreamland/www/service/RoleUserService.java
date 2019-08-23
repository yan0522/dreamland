package yan.dreamland.www.service;

import yan.dreamland.www.entity.RoleUser;
import yan.dreamland.www.entity.User;

import java.util.List;

/**
 * TODO
 *
 * @InterfaceName: RoleUserService
 * @author: yan
 * @since: 2019/6/14 14:23
 */
public interface RoleUserService {
    /**
     * 根据用户查询角色用户集合
     * @param user
     * @return
     */
    List<RoleUser> findByUser(User user);

    /**
     * 添加用户角色中间对象
     * @param roleUser
     * @return id
     */
    int add(RoleUser roleUser);


    /**
     * 根据用户id删除
     * @param uid
     */
    void deleteByUid(Long uid);
}
