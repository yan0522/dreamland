package yan.dreamland.www.service;

import yan.dreamland.www.entity.Role;

/**
 * TODO
 *
 * @InterfaceName: RoleService
 * @author: yan
 * @since: 2019/6/14 14:22
 */
public interface RoleService {
    /**
     * 根据id查询角色
     * @param id
     * @return
     */
    Role findById(long id);

    /**
     * 添加角色
     * @param role
     * @return
     */
    int add(Role role);
}
