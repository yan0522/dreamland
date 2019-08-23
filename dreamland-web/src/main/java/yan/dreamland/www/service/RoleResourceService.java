package yan.dreamland.www.service;

import yan.dreamland.www.entity.RoleResource;

import java.util.List;

/**
 * TODO
 *
 * @InterfaceName: RoleResourceService
 * @author: yan
 * @since: 2019/6/14 14:22
 */
public interface RoleResourceService {
    /**
     * 添加roleRource
     * @param roleResource
     */
    void add(RoleResource roleResource);

    /**
     * 根据id查询RoleResource
     * @param id
     * @return
     */
    RoleResource findById(Long id);

    /**
     * 根据角色id查询角色资源集合
     * @param rid
     * @return
     */
    List<RoleResource> findByRoleId(Long rid);

    /**
     * 根据id删除RoleResource
     * @param id
     */
    void deleteById(Long id);
}
